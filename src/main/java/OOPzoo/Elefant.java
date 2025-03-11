package OOPzoo;

public class Elefant extends Animal {
    public Elefant(String name, int age) {
        setName(name);
        setAge(age);
    }

    @Override
    void speak() {
        System.out.println(getName() + " трубит");
    }

    @Override
    void move() {
        System.out.println(getName() + " ходит");
    }

}
