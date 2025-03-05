package OOPrestaurant;

public class Admin {
    private Dish dish;

    public Admin(){
        this.dish = null;
    }

    public void add(Dish dish){
        this.dish = dish;
    }

    public void print(Dish dish){
        if(dish instanceof Drink){
            System.out.println("Напиток имеет объем " + dish.getInfoVolume());
         }else if(dish instanceof HotDish) {
            System.out.println("Горячее блюдо подается при температуре " + dish.getInfoCelsium() + "С");
        }
    }
}

