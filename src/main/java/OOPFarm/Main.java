package OOPFarm;

public class Main {
    public static void main(String[] args) {
        FarmAnimals cow = new Cow("Корова", 2);
        FarmAnimals chicken = new Chicken("Курица", 1);
        FarmAnimals cow2 = new Cow("Корова2", 4);
        FarmAnimals chicken2 = new Chicken("Курица2", 2);

        Farmer farmer = new Farmer();

        farmer.addFarmAnimals(cow);
        farmer.addFarmAnimals(chicken);
        farmer.addFarmAnimals(cow2);
        farmer.addFarmAnimals(chicken2);

        farmer.print(cow);
        farmer.print(chicken);

        farmer.control(cow);
        farmer.control(chicken);
        farmer.print(cow2);
        farmer.print(chicken2);

        farmer.control(cow2);
        farmer.control(chicken2);
    }
}
