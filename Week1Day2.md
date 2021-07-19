# Week 1 Day 2
# Review of Chapter 5 - 7

## Chapter 5 Loops

### While Loop Examples

**Chat Bot**

```java
import java.util.Scanner;

public class Conversation {

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int randNum;       // Random number 0 to 3
      String userText;      // User input

      System.out.println("Tell me something about yourself.");
      System.out.println("You can type \"Goodbye\" at anytime to quit.\n");
      System.out.println();
      System.out.print("> ");

      userText = scnr.nextLine();

      while (!userText.equals("Goodbye")) {
         randNum = userText.length() % 4; // "Random" num. %4 ensures 0-3
         System.out.println();

         if (randNum == 0) {
            System.out.println("Please explain further.");
         }
         else if (randNum == 1) {
            System.out.println("Why do you say: \"" + userText + "\"?");
         }
         else if (randNum == 2) {
            System.out.println("I don't think that's right.");
         }
         else if (randNum == 3) {
            System.out.println("What else can you share?");
         }
         else {
            System.out.println("Uh-oh, something went wrong. Try again.");
         }
         System.out.println();
                   System.out.print("> ");
         userText = scnr.nextLine();
      }
      System.out.println();

      System.out.println("It was nice talking with you. Goodbye.");
   }
}
```

The loop checks whether userText is "Goodbye"; if not, the loop body executes. The loop body generates a "random" number between 0 and 3, by getting the length of the user's text (which is sort of random) and mod'ing by 4. The loop body then prints one of four messages, using an if-else statement.

**Answer questions in p5.3.2.**

**Getting input until a sentinel is seen**

Loops are commonly used to process an input list of values. A **sentinel value** is a special value indicating the end of a list, such as a list of positive integers ending with 0, as in 10 1 6 3 0. The example below computes the average of an input list of positive integers, ending with 0. The 0 is not included in the average.

```java
import java.util.Scanner;

public class ListAverage {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int currValue;
      int valuesSum;
      int numValues;
      
      valuesSum = 0;
      numValues = 0;
      
      currValue = scnr.nextInt();
      
      while (currValue > 0) { // Get values until 0 (or less)
         valuesSum = valuesSum + currValue;
         numValues = numValues + 1;
         currValue = scnr.nextInt();
      }

      System.out.println("Average: " + (valuesSum / numValues));
   }
}
```

**Answer questions in p5.3.3.**

**Exercise**: c5.3.3 Insect Growth

### For Loop Examples

**Comparison of while loops and for loops:** p5.4.1

Generally, a programmer uses a for loop when the number of iterations is known (like loop 5 times, or loop numItems times), and a while loop otherwise.

**A standard way to loop N times**
```java
for (int i = 0; i < N; i++) {
  \\ loop body
}

**Exercise**: p5.4.2, p5.4.3 For loops

**Computing the average of a list of input values**
```java

import java.util.Scanner;

public class ListAverage {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int currValue;
      int valuesSum;
      int numValues;
      int i;
      
      numValues = scnr.nextInt(); // Gets number of values in list
      
      valuesSum = 0;
      
      for (i = 0; i < numValues; ++i) {
         currValue = scnr.nextInt(); // Gets next value in list
         valuesSum += currValue;
      }
      
      System.out.println("Average: " + (valuesSum / numValues));
   }
}
```
**Exercise**: p5.4.5

**Finding the max**

```java

import java.util.Scanner;

public class ListMax {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int maxSoFar = 0;
      int currValue;
      int numValues;
      int i;

      numValues = scnr.nextInt();

      for (i = 0; i < numValues; i++) {
         currValue = scnr.nextInt();

         if (i == 0) { // First iteration
            maxSoFar = currValue;
         }
         else if (currValue > maxSoFar) {
            maxSoFar = currValue;
         }
      }

      if (numValues > 0) {
         System.out.println("Max: " + maxSoFar);
      }
   }
}
```

**Exercise**: p5.5.1 Finding the max

**Outputting multiples of 5 from 10 to 50**

```java
public class MultiplesOfFive {
   public static void main(String [] args) {
      int i;

      for (i = 10; i <= 50; i = i + 5) {
         System.out.print(i + " ");
      }

      System.out.println("");
   }
}
```

**Exercise**: p5.5.2 For loops beyong iterating N times.

**Loop style issues**
- Starting with 0 rather than 1
- `i++` vs. `++i`
- **Do not declare variables in the loop body**

### Loops and Strings

A programmer commonly iterates through a string, examining each character. The following example counts the number of letters in a string:
```java
import java.util.Scanner;

public class CountLetters {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String inputWord;
      int numLetters;
      int i;

      System.out.print("Enter a word: ");
      inputWord = scnr.next();

      numLetters = 0;
      for (i = 0; i < inputWord.length(); ++i) {
         if (Character.isLetter(inputWord.charAt(i))) {
            numLetters += 1;
         }
      }

      System.out.println("Number of letters: " + numLetters);
   }
}
```

**Exercise**: p5.7.1 Iterating through a string

### Nested Loops

A **nested loop** is a loop that appears in the body of another loop. The nested loops are commonly referred to as the **inner loop** and **outer loop**.

**Example**:
```java
import java.util.Scanner;

public class DomainNamePrinter {

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      char letter1;
      char letter2;

      System.out.println("Two-letter domain names:");

      letter1 = 'a';
      while (letter1 <= 'z') {
         letter2 = 'a';
         while (letter2 <= 'z') {
            System.out.println("" + letter1 + "" + letter2 + ".com");
            ++letter2;
         }
         ++letter1;
      }
   }
}
```

**Exercise**: p5.8.2 What is the output

**Exercise**: c5.8.1 Indent text

**Exercise**: c5.8.2 Print seats

## Review of Chapter 6 User-Defined Methods

A **method** is a named list of statements. It prevents the program from being large and confusing.

**Example:**

```java
c1 = (f1 - 32.0) * (5.0 / 9.0);
c2 = (f2 - 32.0) * (5.0 / 9.0);
c3 = (f3 - 32.0) * (5.0 / 9.0);
c4 = (f4 - 32.0) * (5.0 / 9.0);
c5 = (f5 - 32.0) * (5.0 / 9.0);
```


```java
public double F2C(f) {
  c = (f - 32.0) * (5.0 / 9.0);
  return c;
}

c1 = F2C(f1);
c2 = F2C(f2);
c3 = F2C(f3);
c4 = F2C(f4);
c5 = F2C(f5);
```

- A **method definition** consists of the new method's name and a block of statements. Ex: `public static double calcPizzaArea() { /* block of statements */ }`
- A **method call** is an invocation of a method's name, causing the method's statements to execute.
- The method's name can be any valid identifier. A **block** is a list of statements surrounded by braces.
- Methods must be defined within a class.
- The **access modifier** `public` indicates the method may be called from any class in the program.
- The access modifier `static` indicates the method only uses values that are passed to the method.

**Exercise**: p6.1.4 Method basics

- A method may return one value using a **return statement**. 
