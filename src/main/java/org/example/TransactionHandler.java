package org.example;

public class TransactionHandler implements Handler {
    private Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handleOrder(Order order) {
        if(check(order)) {
            System.out.println("transaction succeed");
            Inventory inventory = Inventory.getInventory();
            inventory.remove(order.getProduct());
            order.getBalance().buy(order.getProduct().getPrice());

        } else {
            System.out.println("not enough money ");
        }
    }

    public boolean check(Order order) {
       return order.getBalance().getMoney()>=order.getProduct().getPrice();
    }
}
