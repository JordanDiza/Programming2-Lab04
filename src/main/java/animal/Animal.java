package animal;

public class Animal {
    static void main() {

        System.out.println("---- PART A----");
        Animal animal = new Animal("Mocha");

        System.out.println(animal.getName());
        animal.speak();

        Dog dog = new Dog("Cookie");
        dog.speak();
        dog.fetch();

        Cat cat = new Cat("Daisy");
        cat.speak();
        cat.scratch();

        Frog frog = new Frog("Kermit");
        frog.speak();
        frog.jump();
    }

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void speak() {
        System.out.println(name + " makes an animal sound.");
    }
}



