# Strategy Design Pattern

Strategy design patterns defines a family of algorithms, encapsulates each one and make them interchangeable. Strategy lets the algorithm vary inedpendently from clients that use it.

### OO Principles which this pattern follows:
1. Encapsulates states which varies
        
        The things that vaies in Strategy patterns is the various algorithms behaviour.
        With this pattern, one can vary objects with multiple algorithms, without having to change that Client.

2. Program to interface, not an implementation
    
        Both Client and Algorithm family uses interface. The Client uses object of interface to intialise algorithm. 

3. Favor compositions over inheritance 

        The Strategy pattern uses compositions to compose any algorithm to the client.
        
 ### Implemented Example:
 
 Cache can be implemented with various eviction policies/ replacement policies like MRU, LRU, FIFO. 
 Here Cache is Client and eviction policies are family of algorithms. Cache will be used interface object of EvictionPolicy which makes use of eviction policies interchangeable.       
        