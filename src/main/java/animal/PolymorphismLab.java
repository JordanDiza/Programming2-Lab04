package animal;
import java.util.ArrayList;

public class PolymorphismLab {

    public static void makeAnimalSpeak(Animal animal) {
        animal.speak();
    }

    public static void makeAllAnimalsSpeak(ArrayList<Animal> animals){
        for(Animal animal : animals) {
            animal.speak();
        }
    }

    public static void main(String[] args) {

// Part B
        System.out.println("---- PART B----");
        Animal a1 = new Dog("Buddy");
        Animal a2 = new Cat("Mittens");
        Animal a3 = new Frog("Kermit");

    /*
        Variable: a1 , Reference Type: Animal , Object Type: Dog
        Variable: a2 , Reference Type: Animal , Object Type: Cat
        Variable: a3 , Reference Type: Animal ,  Object Type: Frog
     */

        a1.speak();
        a2.speak();
        a3.speak();

     /*
        At compile time, Java checks the variable type on the left to make sure the method exists.
        At runtime, Java looks at the real object created on the right and runs that object's specific method.
        This lets you call the same method name, but get different actions depending on the object
     */

// Part C
        System.out.println("---- PART C----");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Buddy"));
        animals.add(new Cat("Mittens"));
        animals.add(new Frog("Kermit"));
        animals.add(new Dog("Rex"));
        animals.add(new Cat("Luna"));

        for (Animal animal : animals) {
            animal.speak();
        }
      /*
         It sohuld print woof, meow, ribbit, woof, meow,
         A cat, dog, frog is a animal
         while a dog isnt a cat or a frog
       */
// Part D
        System.out.println("---- PART D----");
        Animal animal = new Dog("Buddy");
        animal.speak();

        if (animal instanceof Dog) {
            Dog buddy = (Dog) animal;
            buddy.fetch();
        }

        /*
         Error found: java: cannot find symbol  symbol:   method fetch() location: variable animal of type animal.Animal
         The reference type used here is Animal, the object type is a dog and fetch is a method declared in the dog class only.
         So the Animal class cant use the fetch method since its only declared in the dog class.
         */
// Part E
        System.out.println("---- PART E ----");
        Dog dog = new Dog("Buddy");
        Animal animal1 = dog;

        animal1.speak();

        /*
         1.one object was created dog
         2. its Animal
         3. Dog
         4. yes
         Upcasting is always automatic, a subclass can safely be treated as an object of its parent type
         */

// Part F
        System.out.println("---- PART F ----");
        Animal animal2 = new Dog("Buddy");
        // aninal.fetch();

        if (animal2 instanceof Dog) {
            Dog dog2 = (Dog) animal2;
            dog2.fetch();
        }
        /*
        1. Because Dog is a Animal
        2. No just one object
        3. Before the cast it was a dog object. After it is a dog object.
         */

// Part G
        System.out.println("---- PART G----");
        Animal first = new Dog("Buddy");
        Animal second = new Cat("Mittens");

        if (first instanceof Dog) {
            Dog dog3 = (Dog) first;
            dog3.fetch();
        }
        if (second instanceof Dog) {
            Cat mittens = (Cat) second;
            mittens.scratch();
        }

        /*
        Instanceof checks if the created object is a subclass of the parent class or the exact same class
         */

// Part H
        /*
        System.out.println("---- Part H ----");
        Animal animal3 = new Cat("Mittens");
        Dog dog4 = (Dog) animal3;
        dog4.fetch();
        */

        /*
        The reference type here is an Animal. The created object is a Cat. a Cat cannot be a dog so it doesnt work.
         */

// Part I
        System.out.println("---- Part I ----");
        makeAnimalSpeak(new Dog("Buddy"));
        makeAnimalSpeak(new Cat("Mittens"));
        makeAnimalSpeak(new Frog("Kermit"));
        /*
        Because theyre all animals.
         */

// Part J
        System.out.println("---- Part J ----");
        ArrayList<Animal> myAnimals = new ArrayList<>();

        myAnimals.add(new Dog("Buddy"));
        myAnimals.add(new Cat("Mittens"));
        myAnimals.add(new Frog("Kermit"));
        myAnimals.add(new Dog("Rex"));
        myAnimals.add(new Cat("Luna"));

        makeAllAnimalsSpeak(myAnimals);

        /*
        you won't need any change because you can override the speak method for the bird
        it will just print the birds names "is tweeting"
         */
    }
}
