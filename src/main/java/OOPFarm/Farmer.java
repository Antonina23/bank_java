package OOPFarm;

public class Farmer {
    private FarmAnimals farmAnimals;

    public Farmer() {
        this.farmAnimals = null;
    }

    public void addFarmAnimals(FarmAnimals farmAnimals) {
        this.farmAnimals = farmAnimals;
    }

    public void control(FarmAnimals farmAnimals) {
        farmAnimals.care();
        farmAnimals.getProduct();
    }

   public void print(FarmAnimals farmAnimals) {
       System.out.println("Животное: " + farmAnimals.getName());
       System.out.println("Возраст: " + farmAnimals.getAge());
   }

}
