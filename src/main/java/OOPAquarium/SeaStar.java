package OOPAquarium;

public class SeaStar extends SeaAnimals{
    public SeaStar(String name) {
        setName(name);
    }

    @Override
    public void move(){
        System.out.println(getName() + " медленно ползает по дну");
    }
}
