package subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import observer.ObserverInterface;

public class Order implements SubjectInterface {

    List<ObserverInterface> observers;

    int orderNumber;
    OrderStatus orderStatus;

    public Order() {
        orderNumber = new Random().nextInt(1000);
        orderStatus = OrderStatus.PLACED;
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(ObserverInterface observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ObserverInterface observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObjserver() {
        observers.forEach(observer -> observer.update(this));
    }

    public void setOrderStatus(final OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
        notifyObjserver();
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(final int orderNumber) {
        this.orderNumber = orderNumber;
    }
}
