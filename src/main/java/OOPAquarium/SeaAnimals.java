package OOPAquarium;

public abstract class SeaAnimals {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void move();
}
