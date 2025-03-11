package OOPrestaurant;

public class Main {
    public static void main(String[] args) {
        Dish drink = new Drink(220);
        Dish hotDish = new HotDish(80);
        Dish drink2 = new Drink(100);
        Dish hotDish2 = new HotDish(50);

        Admin admin = new Admin();

        admin.add(drink);
        admin.add(hotDish);
        admin.print(drink);
        admin.print(hotDish);
        admin.add(drink2);
        admin.add(hotDish2);
        admin.print(drink2);
        admin.print(hotDish2);

    }
}
