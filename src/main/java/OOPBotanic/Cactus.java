package OOPBotanic;

public class Cactus extends Plant {
    public Cactus(String name) {
        setName("Кактус: " + name);
    }

    @Override
    void careOf() {
        System.out.println(getName() + "требует много света и редкого полива.");
    }
}
