package org.example;

public class Order {
    private Product product;
    private Balance balance;

    public Order(Product product,Balance balance) {
        this.balance = balance;
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public Balance getBalance() {
        return balance;
    }
}
