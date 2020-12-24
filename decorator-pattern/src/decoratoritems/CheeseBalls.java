package decoratoritems;

import order.Order;

public class CheeseBalls extends DecoratorItems{

    private Order order;

    public CheeseBalls(final Order order) {
        this.order = order;
    }

    @Override
    public String getDescription() {
        return order.getDescription() + ", with Cheese Balls";
    }

    @Override
    public int getCost() {
        return order.getCost() + 90;
    }
}
