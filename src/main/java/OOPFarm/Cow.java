package OOPFarm;

public class Cow extends FarmAnimals {
   public Cow(String name, int age) {
       setName(name);
       setAge(age);
   }

   @Override
    public void care() {
       System.out.println(getName() + " пасется на лугу");
   }

   @Override
    public void getProduct() {
       System.out.println(getName() + " дает молоко");
   }


}
