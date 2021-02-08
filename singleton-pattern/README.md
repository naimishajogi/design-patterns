###Singleton pattern

Ensure a class only has one instance, and provide a global point of access to it.

### Implemented Example:
Here implemented Logger class with various way to ensure, only one logger object is created which initialize logger file.

###Applicability
~~~
1)Use the Singleton pattern when
2)There must be exactly one instance of a class, and it must be accessible to clients from a well-known access point
When the sole instance should be extensible by subclassing, and clients should be able to use an extended instance without modifying their code
~~~

###Typical Use Case
1)The logging class
2)Managing a connection to a database
3)File manager

###Real world examples
1)java.lang.Runtime#getRuntime()
2)java.awt.Desktop#getDesktop()
3)java.lang.System#getSecurityManager()