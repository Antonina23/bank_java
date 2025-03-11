package OOPzoo;

public class Bird extends Animal {
    public Bird(String name, int age) {
        setName(name);
        setAge(age);
    }

    @Override
    void speak() {
        System.out.println(getName() + " чирикает");
    }

    @Override
    void move() {
        System.out.println(getName() + " летает");
    }

}