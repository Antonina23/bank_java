package product;

public class Product {
    String name;
    double price;

    Product(String someName, double somePrice) {
        this.name = someName;
        this.price = somePrice;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public double applyDiscount(double discount) {
        discount = Math.max(0, Math.min(discount, 100));
        price = price * (1 - discount / 100);
        return price;
    }

        void print() {
        System.out.println("Товар: " + this.name + ", Цена: " + this.price);
    }
}
