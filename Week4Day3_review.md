# Week 4 Day 3
# Review and Q & A

## Binary Search for Objects

**Exercise**: 
- Create the `Person` class that implements `Comparable<Person>` interface. Two people are compared by their date of birth.
- Create an array of `Person` objects.
- Write a `binarySearch()` method that searches a particular person from a sorted array.

## Selection Sort
**Sorting** is the process of converting a list of elements into ascending (or descending) order. **Selection sort algorithm** is a process that sorts the array by repeatedly selecting the next smallest values and placing them in increasing order. (p15.14.1 Sorting by swapping)

- Selection sort requires O(n^2) comparisons in the best-case, worst-case, and on average.
- Selection sort is done **in-place**, meaning that it does not require additional memory space for the process.
- It is considered as a slow sorting algorithm, as optimal sorting algorithms only requires O(n log n) comparisons.

**Exercise**: Implement selection sort for integer arrays.

## Merge Sort
Merge sort is a sorting algorithm that has O(n log n) complexity. It is widely used for sorting large arrays of values.
- Merge sort divides a list into two halves, recursively sorts each half, and then merges the sorted halves to produce a sorted list. 
- The recursive partitioning continues until a list of 1 element is reached, as list of 1 element is already sorted.
- To conduct a merge, the program need to temporarily maintain a new array to store the sorted values, and then copy the values to the original array.
- Illustration: p15.15.1

**Exercise**: Implement merge sort for integer arrays.

## Review

- OOP: class, object, extending a class, implementing an interface, defining abstract classes and interfaces, `equals()`, `toString()`, `compareTo()`, `copy()`.
- Exception handling: try-catch-finally block, throw an exception, handle an exception, define a new exception type.
- File I/O
- Two-dimensional arrays: array declaration, passing values to array, going through array elements with a nested loop.
- GUI
- Recursion: typical recursive methods, binary search methods.

**Exercises**:
- Section 8.18: Salary calculation with classes
- Section 9.8: Employees and overriding class methods
- Section 10.6: Employees and instantiating from an abstract class
- Section 11.4: Generate number format exception
- Recursion: List all files in a folder and its subfolders.
