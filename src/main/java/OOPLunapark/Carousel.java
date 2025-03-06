package OOPLunapark;

public class Carousel extends Attractions {
    public Carousel() {
        this.name = "Carousel";
        this.age = 1;
    }

    @Override
    void service() {
        System.out.println("Карусель нуждается в частом техническом обслуживании");
    }
}
