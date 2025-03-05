package OOPAquarium;

public class Main {
    public static void main(String[] args) {
        SeaAnimals fish = new Fish();
        SeaAnimals seaStar = new SeaStar();

        AquaAdmin aquaAdmin = new AquaAdmin();

        aquaAdmin.add(fish);
        aquaAdmin.add(seaStar);
        aquaAdmin.show(fish);
        aquaAdmin.show(seaStar);

    }
}
