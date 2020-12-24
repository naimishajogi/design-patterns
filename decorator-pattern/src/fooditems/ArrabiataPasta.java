package fooditems;

import order.Order;

public class ArrabiataPasta extends Order {

    @Override
    public String getDescription() {
        return "Arrabiata Pasta";
    }

    @Override
    public int getCost() {
        return 120;
    }
}
