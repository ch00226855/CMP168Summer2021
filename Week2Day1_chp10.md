# Week 2 Day 1
# Chapter 10 Abstract Class and Interfaces

### Abstract Classes

An **abstract class** is a class that guides the design of subclasses but cannot itself be instantiated as an object. 

**Ex:** An abstract `Shape` class might also specify that any subclass must define a `computeArea()` method. (p10.1.1, p10.1.2)

- An **abstract method** is a method that is not implemented in the base class, thus all derived classes must override the function.
- An abstract method is denoted by the keyword `abstract` in front of the method signature. Ex: `abstract double computeArea();`
- A **concrete class** is a class that is not abstract, and hence can be instantiated.

### Syntax

![](https://i.stack.imgur.com/GDPOs.png)

UML uses *italics* for abstract classes and methods. (p10.3.3, p10.3.4)

**Example**: Pets
![](https://github.com/ch00226855/CMP168Summer2021/raw/main/images/chp10_AbstractClass.png)

In the `main` method of `Tester` class, do the following:

1. Create 2 instances of the Dog using the overloaded constructor
2. Create 2 instances of the Cat using the overloaded constructor
3. Try to create an instance of a Pet to see that it CANNOT be instantiated. Comment it out and move on to the next step
4. Create an array of type Pet and populate it with references to all the Dog and Cat instances created earlier
5. Iterate through the array and print the content of each element by using the toString() method
6. Call the play method on each element to ensure it performs the appropriate behavior

### Interfaces


