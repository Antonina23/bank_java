package OOPAquarium;

public class Main {
    public static void main(String[] args) {
        AquaAdmin aquaAdmin = new AquaAdmin();
        SeaAnimals fish = new Fish("большам");
        SeaAnimals seaStar = new SeaStar("маленькая");

        aquaAdmin.add(fish);
        aquaAdmin.add(seaStar);
        aquaAdmin.showThem(fish);
        aquaAdmin.showThem(seaStar);
    }
}
