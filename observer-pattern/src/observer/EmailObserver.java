package observer;

import subject.Order;

public class EmailObserver implements ObserverInterface{

    @Override
    public void update(final Order order) {
        System.out.println("===Email===");
        System.out.println(String.format("Order Number:%s, status changed to %s", order.getOrderNumber(),
                                         order.getOrderStatus().toString()));
    }
}
