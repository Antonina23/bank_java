package OOPrestaurant;

public class Drink extends Dish{
    public Drink(int infoVolume){
        setInfoVolume(infoVolume);
    }

    public void print() {
        System.out.println("Объем напитка: " + getInfoVolume());
    }
}
