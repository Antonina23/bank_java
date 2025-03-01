package laptop;

public class Main {
    public static void main(String[] args) {
        Laptop lenovo = new Laptop("Леново", 70000.00);

        lenovo.printInfo();

        lenovo.setPrice(50000.00);
        lenovo.printInfo();

    }
}
