# **Observer Pattern**

Observer pattern defines One to Many dependancy between objects, so that when one object changes state, all its dependents will be notified and updated automatically.

### OO Principles which this pattern follows:
1. Encapsulates states which varies
        
        The things that vaies in Observer pattern is the state of the subject and the number of observers.
        With this pattern, one can vary objects that are dependent on the subject, without having to change that Subject.

2. Program to interface, not an implementation
    
        Both subject and observer uses interface. The subject keeps track of objects of implementing the Observer interface while observer regiseter with, and get notified by Subject interface.

3. Favor compositions over inheritance

        The observer pattern uses compositions to compose any number of observer with their subject.
        
 ### Java built-in support
 
    Java provides built-in support for observer pattern. There are Observer interface and Obserable class into java.util package.
    
    
    Steps:
    
    1. Extends Obserable class into Subject class
    2. Implement Observer interface into Observer classes.
    3. call setChanged() method(which set flag which represents update happended)
    4. call notifyObservers()

    Pros:
    1. No need to maintain Data structure to maintain observers
    2  No need to implement addObserver()/removerObserver() methods
    
    
    Cons: 
    1. Obserable is class, so it will be program to implementations instead of program to interface.
    2. Since Obserable is class, Subject has to be subclass of it. If subject is already extending other class, it won't be able to use Obserable class.
    3. Observable has implemented setChanged() as protected, hence other class wont be able to use Obserable class as composition.
       Which breaks "Favour composition over inheritance" principle.          
 
 
 ### Implemented Example:
 
 When any e-commerce order's state changes, customer will be notified by multile ways like email, SMS. 
 Here Order is Subjects and multiple notification ways are dependent on order state change, hence these are observers.
 
 Later if company introduce new way to notify (eg. push notification on app), one needs to create new observer by implementing ObserverInterface and register itself as observer into Order subject.
