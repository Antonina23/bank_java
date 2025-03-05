package OOPFarm;

public abstract class FarmAnimals {
    protected String name;
    protected int age;

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    abstract void care();
    abstract void getProduct();
}
