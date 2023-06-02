package org.example;

public class Main {
    public static void main(String[] args) {

        Product product = new BikeProduct(23,54.0);
        Balance balance = new Balance(55.0);
        Order order = new Order(product,balance);
        Inventory inv = Inventory.getInventory();
        inv.addProduct(product);

        InventoryHandler invHandler = new InventoryHandler();
        TransactionHandler transactionHandler = new TransactionHandler();
        invHandler.setHandler(transactionHandler);
        invHandler.handleOrder(order);



    }
}