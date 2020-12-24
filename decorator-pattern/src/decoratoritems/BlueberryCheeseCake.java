package decoratoritems;

import order.Order;

public class BlueberryCheeseCake extends DecoratorItems {

    private Order order;

    public BlueberryCheeseCake(final Order order) {
        this.order = order;
    }

    @Override
    public String getDescription() {
        return order.getDescription() + ", with Blueberry cheesecake";
    }

    @Override
    public int getCost() {
        return order.getCost() + 80;
    }
}
