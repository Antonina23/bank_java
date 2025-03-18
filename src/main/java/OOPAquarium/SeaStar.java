package OOPAquarium;

public class SeaStar extends SeaAnimals{
    public SeaStar(String name) {
        setName("Морская звезда " + name);
    }

    @Override
    void move() {
        System.out.println("Морское существо: " + getName() + " медленно ползает по дну");
    }
}
