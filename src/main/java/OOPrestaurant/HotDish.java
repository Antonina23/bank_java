package OOPrestaurant;

public class HotDish extends Dish{
    public HotDish(int infoCelsium){
        setInfoCelsium(infoCelsium);
    }
    public void print() {
        System.out.println("Температура горячего блюда: " + getInfoCelsium());
    }
}
