package OOPAquarium;

public class Fish extends SeaAnimals{
    public Fish(String name) {
        setName("Акула " + name);
    }

    @Override
    void move() {
        System.out.println("Морское существо: " + getName() + " быстро и агрессивно плавает");
    }
}
