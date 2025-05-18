package finishtask5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InventoryService {
    private Map<String, List<Product>> inventory;

    private boolean isInventoryOpen;

    public InventoryService() {
        this.inventory = new HashMap<>();
        this.isInventoryOpen = true;
    }

    public void setInventoryOpen(boolean isOpen) {
        this.isInventoryOpen = isOpen;
    }

    public void addProduct(Product product) {
        if(!isInventoryOpen) {
            System.out.println("The access is closed.");
            return;
        }

        inventory.putIfAbsent(product.getCategory(), new ArrayList<>());
        inventory.get(product.getCategory()).add(product);
    }

    public Product getProductByCategory(String category) {
        if(!isInventoryOpen) {
            throw new OutOfStockExceprion("The access is closed for now");
        }
        List<Product> products = inventory.get(category);
        if(products ==null || products.isEmpty()) {
            throw new OutOfStockExceprion("There are no items at the category " + category);
        }
        return products.remove(0);
        }
    public List<Product> getAllProductsByCategory(String category) {
            return inventory.getOrDefault(category, new ArrayList<>()); }

    public List<Product> getProductsByPriceRange(double minPrice, double maxPrice) {
            return inventory.values().stream()
                .flatMap(List::stream)
                .filter(p -> p.getPrice() >= minPrice && p.getPrice() <= maxPrice)
                .collect(Collectors.toList());
}}