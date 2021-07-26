# Week 2 Day 2
# Chapter 11 Exceptions

### The Comparable Interface
It is a common programming task to sort elements of an array or other data collections. In order for the built-in `sort()` method to work, objects created from a user-defined class must implement the `Comparible` interface, which declares the `compareTo()` method. Here we study how to implement `Comparible`, and in Chapter 13 we will see how a Java *arrayList* can sort comparible objects.

**Example**: Figure 10.5.2 Making `EmployeeData` comparible.

**Example**: Create class `Course` including `courseDept` and `courseNum`. Implement interface `Comparible` so that its `compareTo()` method first compare `courseDept`, and then compare `courseNum`.

**Polymorphism**: Create class `Person` and derived class `Employee`. `Person` implements `Comparible` such that objects are compared by `birthYear`. `Empolyee` also implements `Comparible` so that objects are compared by `employeeID`. Create a `Person` object and an `Employee` object.
- Can they be compared?
- Which implementation is used when comparing them?

## Midterm Exam and Project Unveiling

**Midterm Exam**:
- Date and Time: **Monday, August 2nd 2:00 - 5:25 PM**
- Format: submit your code to Zybooks before the deadline
- Unlimited amount of submissions before 4:00pm.
- Covered topics: Chapter 8 - Chapter 11 (you should also be familiar with Chapter 1 - 7)
- You can ask me questions during the exam on Slack.

**Midterm Project**:
- Instructions: Section 12.4
- Deadline: **Tuesday, August 3rd at 11:59PM**
- Format: code + video explanation
- Project instructions
- Grading rubrics
- Create an explanation video using Zoom


## Chapter 11 
**Error-checking code** is code a programmer writes to detect and handle errors that occur during program execution. An exception is a circumstance that a program was not designed to handle, such as if the user enters a negative height.
