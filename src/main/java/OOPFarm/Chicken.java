package OOPFarm;

public class Chicken extends FarmAnimals {
    public Chicken() {
        this.name = "Chicken";
        this.age = 3;
    }

    @Override
    void care() {
        System.out.println("Курице нужна кормушка с зерном");
    }

    @Override
    void getProduct() {
        System.out.println("Курица несет яйца");
    }
}
