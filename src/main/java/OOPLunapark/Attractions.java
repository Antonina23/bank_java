package OOPLunapark;

public abstract class Attractions {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    abstract void service();
}
