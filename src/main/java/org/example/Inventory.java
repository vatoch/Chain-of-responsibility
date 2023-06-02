package org.example;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Product> products;
    private static Inventory inventory;


    private Inventory() {
        this.products = new ArrayList<>();
    }

    public static Inventory getInventory() {
        if(inventory==null) {
            inventory = new Inventory();
        }
        return inventory;
    }

    public boolean isAvailable(Product product) {
        return products.contains(product);
    }
    public void remove(Product product) {
        if(isAvailable(product)) {
            products.remove(product);
        }
    }
    public void addProduct(Product product) {
        products.add(product);
    }




}
