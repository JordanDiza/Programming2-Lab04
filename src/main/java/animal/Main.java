package animal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
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
}

