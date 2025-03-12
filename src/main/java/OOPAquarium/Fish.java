package OOPAquarium;

public class Fish extends SeaAnimals{
    public Fish(String name) {
        this.name = name;
    }

    @Override
    void move() {
        System.out.println("Морское животное: " + getName() + " быстро и агрессивно плавает");
    }
}
