###Factory

#Also known as:
1. Simple Factory
2. Static Factory Method

Factory pattern provides a static encapsulated in class called Factory, in order to hide the implementation logic and make client focus on other important logic rather than initialization of new objects.

#Explanation
Real world example

    Lets say we have a web application connected to SQLServer, but now we want to switch to Oracle. To do so without modifying existing source code, we need to implements Simple Factory pattern, in which a static method can be invoked to create connection to a given database.

### OO Principles which this pattern follows:
1. Encapsulates states which varies
        
        Class intialization can be vary as project ivolves. With every change in Class construction, all place which uses construction needs to be change. 
        Factory pattern encapsulates this object intiation part into static method and other part of project uses this static method to intialize object. Hence whenever any change happens in object creation, only one part of project needs to be chnaghe.
     
### Implemented Example:

In Pizza store, various types of pizza is getting served. We have created `FoodItemInterface` interface which is implemented by all food items and `FoodItemFactory.getFoodItem` is responsible for intializing objects of given food type. 
   
    
