package OOPFarm;

public class Cow extends FarmAnimals {
   public Cow() {
       this.name = "Cow";
       this.age = 2;
   }

   @Override
    public void care() {
       System.out.println("Корова пасется на лугу");
   }

   @Override
    public void getProduct() {
       System.out.println("Корова дает молоко");
   }


}
