package OOPFarm;

public class Chicken extends FarmAnimals {
    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    @Override
    void care() {
        System.out.println(getName() + " нужна кормушка с зерном");
    }

    @Override
    void getProduct() {
        System.out.println(getName() + " несет яйца");
    }
}
