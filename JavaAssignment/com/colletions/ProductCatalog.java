package com.colletions;

import java.util.LinkedHashSet;

public class ProductCatalog {
    public LinkedHashSet<Product> products;

    // Constructor
    public ProductCatalog(LinkedHashSet<Product> products) {
        super();
        this.products = products;
    }

    // Add a product
    public boolean addProduct(Product pro) {
        return products.add(pro);
    }

    // Remove a product by ID
    public boolean removeProduct(int proId) {
        return products.removeIf(p -> p.getProductId() == proId);
    }

    // Display all products
    public void displayProduct() {
        System.out.println("Product Catalog:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
