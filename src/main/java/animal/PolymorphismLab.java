package animal;
import java.util.ArrayList;

public class PolymorphismLab {
    public static void main(String [] args) {
// Part B

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

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Buddy"));
        animals.add(new Cat("Mittens"));
        animals.add(new Frog("Kermit"));
        animals.add(new Dog("Rex"));
        animals.add(new Cat("Luna"));

        for(Animal animal : animals){
            animal.speak();
        }
      /*
         It sohuld print woof, meow, ribbit, woof, meow,
         A cat, dog, frog is a animal
         while a dog isnt a cat or a frog
       */
    }
}