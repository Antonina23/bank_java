package OOPLunapark;

public class Carousel extends Attractions {
    public Carousel(String name, int age) {
        setName(name);
        setAge(age);
    }

    @Override
    void service() {
        System.out.println(getName() + " нуждается в частом техническом обслуживании");
    }
}
