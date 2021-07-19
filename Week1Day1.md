# Week 1 Day 1
# Introduction and Review of Chapter 2 - 5

## Course Introduction
- [Syllabus](https://github.com/ch00226855/CMP168Summer2021/blob/main/CMP326%20Syllabus.pdf)
- Blackboard
- Slack: [Invitation Link](https://join.slack.com/t/cuny-lehman-college/shared_invite/zt-tcg997kx-dvLgu23ZSzHsBGdC1Nwb6A)
- Github

## Chapter 1 Review: Introduction to Java
- Hello World program: class, method, statements, `public static void main(String[] args)`.

## Chapter 2 Review: Variables / Assignments

A **variable** is a named item used to hold a value. An **assignment** assigns a variable with a value. It means that the variable keeps the value until it is assigned again.

A **variable declaration** is a statement that declares a new variable, specifying the variable's name and type. Although not required, a value is often assigned to a variable when it is declared.

When an assignment statement executes, the processor writes the value intot he variable's memory location.

**Example:**
```java
int x;
int x = 5;
int y = x * 2;
double piVal = 3.14;
String myName = "Liang";
```

**Illustration:** p2.1.2

A variable may appear on both the left and the right side of an assignment statement. The variable on the right side uses the current value, while the variable on the left receives the updated value.

**Example:**
```java
int x = 1;
x = x * 20; // x is now 20
x = x * 2;  // x is now 40
```

**Exercise**: c2.2.4 Adding a number to a variable

**Common errors**:
- Read a variable that has not yet been assigned a value.
- Write an assignment statement in reverse, such as `numKids + numAdults = numPeople` or `9 = beansCount`.

### Input / Output Basics

- Print: `System.out.print()` and `System.out.println()`.
- Read user input with `Scanner`. Example:
```java
import java.util.Scanner; // import Scanner class from java.util package

Scanner scnr = new Scanner(System.in); // create a scanner object that listens to keyboard input

int userInt = scnr.nextInt(); // use nextInt() method to read the next integer
```

### Identifiers
A name created by a programmer for an item like a variable or method is called an **identifier**. An identifier must
1. be a sequence of letters (a-z, A-Z), underscore (\_), dollar sign ($), and digits (0-9);
2. not start with a digit;
3. not be a **reserved word** such as `int` or `public`.

- Identifiers are case sensitive.
- Java's naming convention for variables is **camel casing**, like `numApples` or `peopleOnBus`.
- A good practice is to create meaning ful identifier names that descirbes the variable's purpose.

**Exercise**: p2.3.2 Valid Identifiers

### Arithmetic Expressions
- `+, -, *, /`
- `()`
- **Modulo operator `%`**: checking divisibility, even/odd.
- **Compound operators `+=, -=, *=, /=`**
- **`i++`**
- `int` vs. `double`
- Division by zero
- Format floating-point numbers: `System.out.printf("%.2f", myFloat); ` **Watch p2.7.5 Reducing the output of pi**.
- Scientific notation: `7.2e-4`
- Final variables: variables whose values cannot change after initialization.

**Exercise**: c2.7.1 Sphere volume.

### Math Methods
- A **method** is a list of statements executed by invoking the method's name. Such action is known as a **method call**. 
- Useful math methods: `Math.sqrt()`, `Math.pow()`, `Math.pow()`, `Math.random()`.
- Input values (called **arguments**) appear within `()`. 
**Exercise**: 2.10.3 Distance between two points.

### Type Conversions

A **type conversion** is a conversion of one data type to another, such as an int to double.

**Implicit Conversion**
- For an arithmetic operator like `+` or `*`, if either operand is a double, the other is automatically converted to double, and then a floating-point operation is performed.
- For assignments, the right side type is converted to the left side type if the conversion is possible without loss of precision. Example: `double x = 25;`

**Type Casting**
A **type cast** explicitly converts a value of one type to another type.

**Example**: 
```java
double myDouble = 5.2;
int myInt = (int)myDouble; // What value does myInt receive?
```