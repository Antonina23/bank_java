package company;

public class Main {
    public static void main(String[] args) {

        Company petya = new Company(1, "Petya");
        Company kolya = new Company(2, "Kolya");
        Company vanya = new Company(3, "Vanya");

        Company.printCompanyName();

        petya.setCompanyName("DD");
        kolya.setCompanyName("DD");
        vanya.setCompanyName("DD");

        Company.printCompanyName();

    }
}
