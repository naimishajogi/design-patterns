package decoratoritems;

import order.Order;

public class GarlicBread extends DecoratorItems {

    private Order order;

    public GarlicBread(final Order order) {
        this.order = order;
    }

    @Override
    public String getDescription() {
        return order.getDescription() + ", with Garlic Bread";
    }

    @Override
    public int getCost() {
        return order.getCost() + 50;
    }
}