package OOPBotanic;

public class Orchidea extends Plant {
    public Orchidea() {
        this.name = "Орхидея";
    }

    @Override
    void careOf() {
        System.out.println("Орхидея нуждается в высокой влажности и тени");
    }
}
