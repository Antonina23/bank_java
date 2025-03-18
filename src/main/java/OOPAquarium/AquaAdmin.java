package OOPAquarium;

public class AquaAdmin {
    private SeaAnimals seaAnimals;

    public AquaAdmin() {
        this.seaAnimals = null;
    }

    public void add(SeaAnimals seaAnimals) {
        this.seaAnimals = seaAnimals;
    }

    public void showThem(SeaAnimals seaAnimals) {
        seaAnimals.move();
    }
}
