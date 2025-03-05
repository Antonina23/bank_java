package OOPrestaurant;

public class Main {
    public static void main(String[] args) {
        Dish drink = new Drink();
        Dish hotDish = new HotDish();

        Admin admin = new Admin();

        admin.add(drink);
        admin.add(hotDish);
        admin.print(drink);
        admin.print(hotDish);

    }
}
