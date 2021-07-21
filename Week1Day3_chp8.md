# Week 1 Day 3
# Chapter 8 Classes and Objects

To keep programs understandable, programmers often deal with higher-level groupings of variables and methods known as **objects**. Programmers use **classes** to describe how different types of objects should be constructed.
 
**Example**: p8.1.1 The world is viewed not as materials, but rather as objects.
 
**Example**: Define a restaurant class

### Defining a Class

A class consists of:
- member variables (also called fields or instance variables): restaurant name, restaurant rating
- constructor(s): used to create a restaurant object
- methods: `setRating()`, `getRating()`, `setName()`, `getName()`, `printInfo()`

**How to create a class to represent an object?**
- Declare a class: `public class Restaurant`
- Declare (private) member variables:
```java
private String restaurantName;
private int restaurantRating;
```
- Define the default constructor: initialize the member variables to their default values
```java
public Restaurant() {
  restaurantName = "";
  restaurantRating = 0;
}
```
- Define overloaded constructors: create an object with specific values
```java
public Restaurant(String name, String rating) {
  restaurantName = name;
  restaurantRating = rating;
}
```
- Create public methods to modify the object's data: mutator (setter) methods
```java
public void setName(String name) {
  restaurantName = name;
}

public void setRating(int rating) {
  restaurantRating = rating;
}
```
- Create public methods to access the object's data: accessor (getter) methods
```java
public String getName() {
  return restaurantName;
}

public int getRating() {
  return restaurantRating;
}
```
- Create additional public methods: define the object's behaviors
```java
public void printInfo() {
  System.out.println("Name:" + restaurantName + " | Rating:" + restaurantRating);
}
```
- Create additional private helper methods
```java
private String starRating(int rating) {
  String output = "";
  for (int i = 0; i < rating; i++) {
    output += "*";
  }
  return output;
}
```
