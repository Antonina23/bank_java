package OOPAquarium;

public class Main {
    public static void main(String[] args) {
       SeaAnimals fish = new Fish("Акула");
       SeaAnimals seaStar = new SeaStar("Морская звезда");
       SeaAnimals fish2 = new Fish("Маленькая акула");
       SeaAnimals seaStar2 = new SeaStar("Мини морская звезда");

       AquaAdmin aquaAdmin = new AquaAdmin();

       aquaAdmin.addAnimal(fish);
       aquaAdmin.addAnimal(seaStar);
       aquaAdmin.showThem(fish);
       aquaAdmin.showThem(seaStar);
       aquaAdmin.addAnimal(fish2);
       aquaAdmin.addAnimal(seaStar2);
       aquaAdmin.showThem(fish2);
       aquaAdmin.showThem(seaStar2);
    }
}
