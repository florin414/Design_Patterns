# Design_Patterns

This repo provides examples and short explanations for the 23 design patterns from the book "[Design Patterns : Elements of Reusable Object-Oriented Software by 
Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides](https://en.wikipedia.org/wiki/Design_Patterns)".

## Creational design patterns

### [Abstract factory:](https://github.com/BalanAdelinCristian/Design_Patterns/tree/master/src/Creational/AbstractFactory)
1. Used when we need to create a group of interdependent classes, without specifying their concrete classes.
2. The first thing the Abstract Factory pattern suggests is to explicitly declare interfaces for each distinct 
product of the product family. Then you can make all variants of products that follow those interfaces.

### [Builder:](https://github.com/BalanAdelinCristian/Design_Patterns/tree/master/src/Creational/Builder)
1. Used when the algorithm for creating a complex object should be independent of the parts that make up the object.
2. The cosntruction process must allow different representations for the object that is constructed
3. **We should not use this pattern if we want a mutable object.**

### [Factory Method:](https://github.com/BalanAdelinCristian/Design_Patterns/tree/master/src/Creational/FactoryMethod)
1. Useed when a class needs to insantiate a subclass of another class, but doesn't know which one. It lets the subclasses decide which class to instantiate.
2. Creates objects without exposing the creation logic of the client (Creator) and refers to the newly created object using a common interface (Product).

### [Prototype:](https://github.com/BalanAdelinCristian/Design_Patterns/tree/master/src/Creational/Prototype)
1. Used when creation of an object is costly, requires a lot of time and resources, and you have a similar object already existing.
2. It provides a mechanism to copy the original object to a new object and then modify it acording to our needs.

### [Singleton:](https://github.com/BalanAdelinCristian/Design_Patterns/tree/master/src/Creational/Singleton)
1. Used when we want a single instance of an object and want to provide a global access to it.

## Structural design patterns

### [Adapter:](https://github.com/BalanAdelinCristian/Design_Patterns/tree/master/src/Structural/Adapter)
1. Used when we need to convert an interface of a class into another interface that the client expects.

### [Bridge:](https://github.com/BalanAdelinCristian/Design_Patterns/tree/master/src/Structural/Bridge)
1. Used when we want to avoid a permanent binding between an abstraction and its implementation, when the implementation must be selected or switched at runtime.
2. When we have a lot of implementation classes. A class hierarchy indicates the need of splitting objects into two parts.

### [Composite:](https://github.com/BalanAdelinCristian/Design_Patterns/tree/master/src/Structural/Composite)
1. Used when we can organize the objects in a tree-like structure. 
2. Used when we can use multiple objects in the same way with nearly identical code to handle them.
3. Used when the clients need to ignore the difference between composition of objects and individual objects.

### [Decorator:](https://github.com/BalanAdelinCristian/Design_Patterns/tree/master/src/Structural/Decorator)
1. Used when we want to attach additional responsibilities to an object dynamically.
2. This pattern provides flexible alternative to sub-classing for extending functionality.

### [Facade:](https://github.com/BalanAdelinCristian/Design_Patterns/tree/master/src/Structural/Facade)
1. Used when we want to hide the complexity of calls between classes.
2. This design pattern allows us to create a class which takes care of the objects calls so the client doesn't need to make them itself. 
In this way, the system is simplified and the 'facade' methods help us to make higher level calls.

### [Flyweight:](https://github.com/BalanAdelinCristian/Design_Patterns/tree/master/src/Structural/Flyweight)
1. This pattern is primarily used to reduce the amount of objects created, so in consequence, to reduce the memory usage and increase performance. 
It tries to reuse already existing similar objects.
2. It is similar to the [singleton](#singleton) pattern, but it is scaled to multiple object instantiations.

### [Proxy:](https://github.com/BalanAdelinCristian/Design_Patterns/tree/master/src/Structural/Proxy)
1. This pattern allows us to create a real object only when necessary. The creation of the real object is done by dynamically binding the real
object to the reference inside the proxy. 
2. It is used when the creation of an object is too costly, so its instantiation is done only when it is necessary.

## Behavioral design patterns

### [Chain Of Responsibility:](https://github.com/BalanAdelinCristian/Design_Patterns/tree/master/src/Behavioral/ChainOfResponsibility)
1. This pattern lets you send requests to an object implicitly through a chain of candidate objects. After one's processing is done, if anything is still 
pending, it can be forwarded to the next object in the chain. The try-catch is such a case.

### [Command:](https://github.com/BalanAdelinCristian/Design_Patterns/tree/master/src/Behavioral/Command)
1. Used when we want to parametrize clients with different requests. This pattern also allows us to queue or log requests, as well as supporting "undoing"
this requests.
2. It is useful for undo/redo operations, when we model transactions (which can be responsible for changes in data).

### [Interpreter:](https://github.com/BalanAdelinCristian/Design_Patterns/tree/master/src/Behavioral/Interpreter)
1. This design pattern is used just for natural language interpretations. It can be used to create a language interpreter in a development environment.

### [Iterator:](https://github.com/BalanAdelinCristian/Design_Patterns/tree/master/src/Behavioral/Iterator)
1. Used when we want to provide a way of access of elements of an aggregate object sequentially without exposing its underlying representation.
2. Iterators are used to traverse a container to access its elements.

### [Mediator:](https://github.com/BalanAdelinCristian/Design_Patterns/tree/master/src/Behavioral/Mediator)
1. Used when we want to keep objects from referring each other explicitly. 
2. The mediator takes the responsibility of communication among a group of objects.
3. It acts as an intermediary who can track the communication between two objects.
4. The other objects in the system are also aware of this mediator, and they need to go through the mediator if they want to communicate among themselves.

### [Memento:](https://github.com/BalanAdelinCristian/Design_Patterns/tree/master/src/Behavioral/Memento)
1. Used when we want to capture and externalize an object's internal state so that the object can be restored to a previous state, without violating encapsulation.
2. This pattern us usefull when we want to be able to return an object to one of its previous states.

###  [Observer:](https://github.com/BalanAdelinCristian/Design_Patterns/tree/master/src/Behavioral/Observer)
1. This pattern defines a one-to-many dependency between objects, so when one object changes its state, all of its dependents are notified and updated automatically.
2. This design pattern is used when we want to notify a group o objects automatically when an event occurs.
3. The observers can unregister from the subject when they lose interest in that subject.

### [State:](https://github.com/BalanAdelinCristian/Design_Patterns/tree/master/src/Behavioral/State)
1. This design pattern allows an object to alter its behaviour when its internal state changes.
2. It removes the dependencies on if/else or switch/case statements by using a systematic and loosly coupled way to achieve state changes through a Context and
State implementations

### [Strategy:](https://github.com/BalanAdelinCristian/Design_Patterns/tree/master/src/Behavioral/Strategy)
1. This design pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
2. It allows the algorithm to vary independently from client to client, dynamically, at runtime.

### [Template Method:](https://github.com/BalanAdelinCristian/Design_Patterns/tree/master/src/Behavioral/TemplateMethod)
1. This design pattern defines a skeleton of an algorithm in an operation, referring some steps to the subclasses.
2. It lets the subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

### [Visitor:](https://github.com/BalanAdelinCristian/Design_Patterns/tree/master/src/Behavioral/Visitor)
1. It helps us to add new functionalities to an existing object structure in such a way that the old structure remains unaffected by this changes.
