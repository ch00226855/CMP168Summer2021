# Week 4 Day 2
# Chapter 15 Recursion 

## Memory Regions: Heap / Stack

A program's memory usage typically includes four different regions:
- **Code**: The region where the program instructions are stored.
- **Static memory**: The region where static fields are allocated. 
  - The static fields are alocated once and last for the duration of a program's execution.
  - Their memory addresses do not change during the execution.
- **Call stack**: The region where a method's local variables are allocated during a method call.
  - A method call adds local variables to the stack
  - Local variables include primitive type variables (storing the values) and reference type variables (storing the references)
  - When the method call finishes, a value is returned (if the return type is not void), and other local variables are removed.
  - The memory is allocated automatically for these variables.
- **The heap**: The region where the **new** operator allocates memory for objects.

Figure 15.1.1: Use of the four memory regions.

## Garbage Collection
Because the amount of memory available to a program is finite, objects allocated to the heap must eventually be removed when they are no longer needed. Java uses a mechanism called **garbage collection** to automatically free memory locations in order to enable momery reuse.
- The Java virtual machine keeps a **reference count** for the number of reference variables of every object. 
- If the reference count becomes zero, the object is considered an **unreachable object**, and will be removed when the Java virtual machine invokes the garbage collector.

## Recursive Methods
A methods that calls itself is a **recursive method**

**Example**:
```java
public static void countDown(int countInt) {
      if (countInt <= 0) {
         System.out.println("Go!");
      }
      else {
         System.out.println(countInt);
         countDown(countInt - 1);
      }
   }
```

**What will happen if the `main` method calls `countDown(2)`?**


