package fooditems;

import order.Order;

public class MargheritaPizza extends Order {

    @Override
    public String getDescription() {
        return "Margherita Pizza";
    }

    @Override
    public int getCost() {
        return 150;
    }
}
