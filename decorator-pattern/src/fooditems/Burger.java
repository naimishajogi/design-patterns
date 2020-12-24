package fooditems;

import order.Order;

public class Burger extends Order {

    @Override
    public String getDescription() {
        return "Burger";
    }

    @Override
    public int getCost() {
        return 100;
    }
}
