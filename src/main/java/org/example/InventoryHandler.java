package org.example;

public class InventoryHandler implements Handler{
    private Handler handler;


    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public void handleOrder(Order order) {
        if(check(order)) {
            System.out.println("item available ");
            handler.handleOrder(order);
        } else {
            System.out.println("item not available in inventory");
        }
    }
    public boolean check(Order order) {
        Inventory inv = Inventory.getInventory();
        if(inv.isAvailable(order.getProduct())) {
            return true;
        }
        return false;
    }
}
