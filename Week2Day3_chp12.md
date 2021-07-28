# Week 2 Day 3
# Chapter 12 Files I/O

## Reading from Files
A program sometimes need to read data from files rather than from a user typing on a keyboard. Java provides several ways to interact with files on the machine's hard drive.

**Input Sources:**
- `InputStream`: An abstract class representing an input stream of bytes.
- `System.in`: A predefined input stream associated with the system's standard input (keyboard).
- `File`: A class representation of files.
- `FileInputStream`: A class obtaines input bytes from a file in the file system.

**A File vs. A File Object**
- A **computer file** stores data in a computer storage device (hard drive). Files can be edited and transfered from one computer system to another.
- A computer file has a name that uniquely identifies the file. A file name includes:
  - **Base name**: such as `Scanner`, `README`, `HelloWorld`.
  - **Extension**: indicates the type of content, such as `.txt`, `.java`, `.html`.
  - **Path**: indicates the directory of the file, such as `/user/username/home/Downloads/` or `C:\Users\Username\Downloads`
- A **file object** in java is a reference variable representing a computer file. It has useful methods for a Java programme to read and write on the file.
- A file name must be provided when the program defines a file object.

![](https://www.linuxtrainingacademy.com/wp-content/uploads/2014/03/linux-folders.jpg)

![](https://mail.codejava.net/images/articles/javase/fileio/list-directory/a%20directory.png)

**Absolute Path vs. Relative Path**
- An **absolute path** indicates the path to reach a file from the **root** directory.
- A **relative path** indicates the path to reach a file from the current working directory. 
  - The current working directory of a java project can be found in Properties.
  - For files in the current working directory, no path is needed. Ex: `Text.txt`
  - For files in a sub-directory, show the name of sub-directory. Ex: `src/week2day3/FileDemo.java`
  - Use `..` to refer the higher-level directory. Ex: `../../Downloads/file.txt`
- The absolute path of a file is independent of the current working directory.


**Example**: p12.1.1, p12.1.2 Read a file using `Scanner` and `FileInputStream`.
- Import `java.util.Scanner`, `java.io.FileInputStream`, and `java.io.IOException`.
- Create a `FileInputStream` object representing a computer file.
- Create a `Scanner` object listening to the file input stream.
- Use methods like `nextInt()`, `nextDouble()`, or `nextLine()` to read from the file.
- Close the file input stream afterwards (otherwise the file cannot be accessed by another program).
- Close the scanner to release memory space.

**Exercise**: Create a TXT file and read the file in Java.

**Reading until the end of the file**
The `Scanner` class offers `hasNext()` method to detect whether the scanner has reached the end the file. It has several variants such as `hasNextInt()` and `hasNextDouble()` for specific types.

**Example**: Figure 12.1.1 Reading a varying amount of data from a file

**Exercise**: Counting instances of a specific word in a file

**Class `FileReader`**
The `FileReader` class provides a convenient way to read character files. It provides a `read()` method that reads one character at a time. If there is no more characters, the method will return -1.
