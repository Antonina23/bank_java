package finishtask5Test;

import finishtask5.Product;
import finishtask5.OutOfStockExceprion;
import finishtask5.InventoryService;

public class InventoryServiceTest {
    public static void main(String[] args) {
        InventoryService service = new InventoryService();

        service.addProduct(new Product("Milk", 100.00, "Milk"));
        service.addProduct(new Product("Airan", 70.00, "Milk products"));
        service.addProduct(new Product("Water", 50.00, "Drinks"));

        try {
            Product product = service.getProductByCategory("Milk products");
            System.out.println("Have got the item: " + product);
        } catch (OutOfStockExceprion e) {
            System.out.println("Error: " + e.getMessage());
        }

        service.setInventoryOpen(false);

        service.addProduct(new Product("Dessert", 90.00, "Milk product"));

        try {
            service.getAllProductsByCategory("Drinks");
        } catch (OutOfStockExceprion e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProducts by the price: ");
        service.getProductsByPriceRange(50, 100).forEach(System.out::println);
    }
}
