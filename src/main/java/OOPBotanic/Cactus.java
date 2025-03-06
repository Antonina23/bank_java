package OOPBotanic;

public class Cactus extends Plant {
    public Cactus() {
        this.name = "Кактус";
    }

    @Override
    void careOf() {
        System.out.println("Кактус требует много света и редкого полива");
    }
}
