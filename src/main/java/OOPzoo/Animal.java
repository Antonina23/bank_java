package OOPzoo;

public abstract class Animal {
    protected String name;
    protected int age;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    abstract void speak();
    abstract void move();
}
