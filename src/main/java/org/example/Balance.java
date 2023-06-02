package org.example;

public class Balance {
    private double money;

    public Balance(double money) {
        this.money=money;
    }

    public void buy(double price) {
        money  = money - price;
    }

    public double getMoney() {
        return money;
    }
}
