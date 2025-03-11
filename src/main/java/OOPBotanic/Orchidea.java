package OOPBotanic;

public class Orchidea extends Plant {
    public Orchidea(String name) {
        setName("Орхидея: " + name);
    }

    @Override
    void careOf() {
        System.out.println(getName() + "нуждается в высокой влажности и тени");
    }
}
