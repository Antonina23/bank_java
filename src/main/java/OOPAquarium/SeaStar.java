package OOPAquarium;

public class SeaStar extends SeaAnimals{
    public SeaStar(String name) {
        this.name = name;
    }

    @Override
    void move() {
        System.out.println("Морское животное: " + getName() + " медленно ползает по дну");
    }
}
