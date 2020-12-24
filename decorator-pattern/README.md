# Decorator Design Pattern

Decorator pattern allows to attach additional responsibilities to an object dynamically.Decorators provide a flexible alternative to subclassing for extending functionality.

### OO Principles which this pattern follows:

1. Encapsulates states which varies
2. Program to interface, not an implementation 
3. Favor compositions over inheritance 

        The Decotator pattern uses compositions to extend responsibility.
       
4. Strive for loosly coupled designs between objects that interact.
5. Classes should be open for extension but closed for modification.

        In this pattern, one can extend responsiblity by adding additional Decorator class.
        
 ### Implemented Example:
 
 Food order system like Zomato provides features to add-on various items like starter, desserts or drink with order. 
 Here user can add multiple items in various combinations as per theirs choice. This add-on items can be implemented as decorators to an order.   