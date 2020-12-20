package observer;

import subject.Order;

public class SMSObserver implements ObserverInterface {

    //Pull model - passes whole subject object
    //push model - passed updated properties, eg public void update(final int orderNumber, final OrderStatus
    // orderStatus)

    /**
     * This method will be called by subject when any update happens on Subject object. This is implemented with Pull
     * model (by passing whole subject object as param) hence when any new properties will be introduced in Subject, we
     * dont need to change this methods syntax.
     *
     * @param order object of Subject class
     */
    @Override
    public void update(final Order order) {
        System.out.println("===SMS===");
        System.out.println(String.format("Order Number:%s, status changed to %s", order.getOrderNumber(),
                                         order.getOrderStatus().toString()));
    }
}
