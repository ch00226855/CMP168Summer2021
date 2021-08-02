# Week 3 Day 2
# Chapter 13 2D Arrays and ArrayLists

## Two-Dimensional Arrays

A **two-dimensional** array is used to contains values across multiple rows and columns. 

![](https://media.geeksforgeeks.org/wp-content/uploads/two-d.png)

**Declaration**:
```java
int[][] ary = new int[3][5];
```
- `int[][]` declares a 2D array of integers.
- `[3]` defines the number of rows.
- `[5]` defines the number of columns

**Assignment**: p13.1.1

Under the hood, a 2D array is implemented as an array of arrays. For example, `int[][] ary = new int[2][3]` allocates a 2-element array, where each array element is itself a 3-element array.

**Exercise**: Create a table of driving distances.
  |          | Boston | Chicago | Los Angeles |
  |----------|--------|---------|-------------|
  |Boston    |0       | 960     | 2960        |
  |Chicago   |960     | 0       | 2011        |
  |LA        |2960    | 2011    | 0           |
  
  
