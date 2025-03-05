package OOPFarm;

public class Farmer {
    public void control(FarmAnimals farmAnimals) {
        farmAnimals.care();
        farmAnimals.getProduct();
    }

   public void print(FarmAnimals farmAnimals) {
       System.out.println("Животное: " + farmAnimals.getName());
       System.out.println("Возраст: " + farmAnimals.getAge());
   }

}
