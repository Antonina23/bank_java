package OOPBotanic;

public abstract class Plant {
    private String name;

   public String getName() {
       return name;
   }

   void setName(String name) {
       this.name = name;
   }

    abstract void careOf();

}
