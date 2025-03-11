package OOPAquarium;

public class Main {
    public static void main(String[] args) {
        SeaAnimals fish = new Fish("Акула");
        SeaAnimals seaStar = new SeaStar("Морская звезда");
        SeaAnimals fish2 = new Fish("Морской уж");
        SeaAnimals seaStar2 = new SeaStar("Вторая морская звезда");

        AquaAdmin aquaAdmin = new AquaAdmin();

        aquaAdmin.add(fish);
        aquaAdmin.add(seaStar);
        aquaAdmin.show(fish);
        aquaAdmin.show(seaStar);
        aquaAdmin.add(fish2);
        aquaAdmin.add(seaStar2);
        aquaAdmin.show(fish2);
        aquaAdmin.show(seaStar2);

    }
}
