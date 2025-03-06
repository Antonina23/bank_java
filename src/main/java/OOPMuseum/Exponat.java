package OOPMuseum;

public abstract class Exponat {
    protected String name;
    protected int year;

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    abstract void care();
}
