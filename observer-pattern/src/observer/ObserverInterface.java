package observer;

import subject.Order;
import subject.SubjectInterface;

public interface ObserverInterface {
    void update(Order order);
}
