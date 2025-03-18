package OOPAquarium;

public abstract class SeaAnimals {
    private String name;

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    abstract void move();
}
