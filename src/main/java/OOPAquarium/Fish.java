package OOPAquarium;

public class Fish extends SeaAnimals{
    public Fish(String name) {
        setName(name);
    }

    @Override
    public void move(){
        System.out.println(getName() + " плавает быстро и агрессивно");
    }
}
