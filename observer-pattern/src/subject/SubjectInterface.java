package subject;

import observer.ObserverInterface;

public interface SubjectInterface {

    void addObserver(ObserverInterface observer);

    void removeObserver(ObserverInterface observer);

    void notifyObjserver();

}
