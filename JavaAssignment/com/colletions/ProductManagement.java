package com.colletions;



import java.util.LinkedHashSet;

public class ProductManagement {
    public static void main(String[] args) {
        // Create a LinkedHashSet for storing products
        LinkedHashSet<Product> productSet = new LinkedHashSet<>();

        // Initialize ProductCatalog with the product set
        ProductCatalog catalog = new ProductCatalog(productSet);

        // Add products to the catalog
        catalog.addProduct(new Product(1, "Laptop", 75000.00));
        catalog.addProduct(new Product(2, "Smartphone", 30000.00));
        catalog.addProduct(new Product(3, "Tablet", 20000.00));

        // Display products
        System.out.println("After Adding Products:");
        catalog.displayProduct();

        // Remove a product
        catalog.removeProduct(2); // Removes product with ID 2 (Smartphone)

        // Display products after removal
        System.out.println("\nAfter Removing Product with ID 2:");
        catalog.displayProduct();
    }
}
