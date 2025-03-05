package OOPFarm;

public class Main {
    public static void main(String[] args) {
        FarmAnimals cow = new Cow();
        FarmAnimals chicken = new Chicken();

        Farmer farmer = new Farmer();

        farmer.print(cow);
        farmer.print(chicken);

        farmer.control(cow);
        farmer.control(chicken);
    }
}
