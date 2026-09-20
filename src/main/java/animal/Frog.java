package animal;

public class Frog extends Animal {
    public Frog(String name) {
        super(name);
    }
    @Override
    public void speak() {
        System.out.println(getName() + " says Ribbit!");
    }

    public void jump() {
        System.out.println(getName() + " is jumping");
    }
}
