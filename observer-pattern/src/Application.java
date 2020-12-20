import observer.EmailObserver;
import observer.ObserverInterface;
import observer.SMSObserver;
import subject.Order;
import subject.OrderStatus;

public class Application {

    public static void main(String[] args) {
        Order order1 = new Order();
        ObserverInterface smsObserver = new SMSObserver();
        ObserverInterface emailObserver = new EmailObserver();

        order1.addObserver(smsObserver);
        order1.addObserver(emailObserver);
        order1.setOrderStatus(OrderStatus.SHIPPED);
    }
}
