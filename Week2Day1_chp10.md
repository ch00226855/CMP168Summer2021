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

Start
