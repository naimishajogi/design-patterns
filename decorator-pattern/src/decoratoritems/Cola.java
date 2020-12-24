package decoratoritems;

import order.Order;

public class Cola extends DecoratorItems {

    private Order order;

    public Cola(final Order order) {
        this.order = order;
    }

    @Override
    public String getDescription() {
        return order.getDescription() + " ,with cola";
    }

    @Override
    public int getCost() {
        return order.getCost() + 30;
    }
}
