package product;

public class Main {
    public static void main(String[] args) {
        Product bread = new Product("Хлеб", 50.00);

        bread.print();

        bread.setPrice(100.00);
        bread.print();

        bread.applyDiscount(10.00);
        bread.print();
    }
}
