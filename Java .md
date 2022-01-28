# Java

## **Printing Text**

- Hello World

```java
class MyClass {
    public static void main(String[ ] args) {
        System.out.println("Hello World");
    }
}
```

**Explanation on printing text**

- Every program in Java must have a **class**
- Every Java program starts from the
    - **main** method
        - `public static void main(String[] args) {`
        - **public**: anyone can access it
        - **static**: method can be run without creating an instance of the class containing the main method
        - **void**: method doesn't return any value
        - **main**: the name of the method
    
    **How to declare a method**
    
    - `void + method´s name + ()`
    - Example to declare a method named “Hello”
        - `void hello()`

**Explanation part.2**

- `System.out.println()` for printing text
- The **println** method prints a line of text to the screen.
- The **System** class and its **out** stream are used to access the **println** method

<aside>
❗ In classes, methods, and other flow-control structures code is always enclosed in curly braces { }.

</aside>

- After every text a semicolon (;) must be inputed

**Comments**

- Single Line Comments
    - They can be on a line just by itself
    - They can be after the code
    - Symbol is : `//`
    - Example:
        - `// single line comment`
        - `x = 5 ; // comment after code`
- Multi-Line Comments or Block Comment
    - To start `/*`
    - To end `*/`
    - Example:
        
        ```java
        /*
        This is a multi line comment
        It works this way
        */
        ```
        
- Documentation Comments
    - Generate external documentation of your source code
    - To start `/**`
    - To end `*/`
    - Example:
        
        ```java
        /** This is a documentation comment */
        
        /**This is 
        also a documentation 
        comment */
        ```
        
    - It can also be like a box
        
        ```java
        /****************************************
        Another type of comment
        ****************************************/
        ```
        

## Variables

- Variables store data
- Variable types
    - int: integers (whole numbers)
        - `int age = 42;`
    - double: (floats)
        - `double score = 15.9;`
    - Strings: (texts)
        - `String name = “David”;`
    - char: single characters
        - `char group = “Z”;`
    - boolean: true or false
        - `boolean online = true;`
- Declaring Variables
    - `String Name = “David”;`
- Another way of creating variables of the specified type
    - `int a = 42, b = 11;`

## Getting User Input

While Java provides many different methods for getting user input, the **Scanner** object is the most common, and perhaps the easiest to implement.

‘Import the **Scanner** class to use the **Scanner** object, as seen here:

**`import**ava.util.Scanner;`

In order to use the **Scanner** class, create an instance of the class by using the following syntax:

**`Scanner** myVar = new **Scanner**(System.in);`

- Methods available
    - Read a byte - nextByte()
    - Read a short - nextShort()
    - Read an int - nextInt()
    - Read a long - nextLong()
    - Read a float - nextFloat()
    - Read a double - nextDouble()
    - Read a boolean - nextBoolean()
    - Read a complete line - nextLine()
    - Read a word - next()
- Example

```java
import java.util.Scanner;

class MyClass {
    public static void main(String[ ] args) {
        Scanner myVar = new Scanner(System.in);
        System.out.println(myVar.nextLine());        
    }
}
```

## Math Operators

Java provides a rich set of operators to use in manipulating variables. A value used on either side of an operator is called an **operand**

`int x = 6 + 3;`

For example, in the expression below, the numbers 6 and 3 are operands of the plus operator:

Java arithmetic operators:

- + **addition**
- - **subtraction**
- * **multiplication**
- / **division**
- % **modulo**

- *Examples*
- Basics Operators
    
    ```java
    int sum1 = 50 + 10; 
    int sum2 = sum1 + 66; 
    int sum3 = sum2 + sum2
    ```
    
    ```java
    int sum1 = 1000 - 10;
    int sum2 = sum1 - 5;
    int sum3 = sum1 - sum2;
    ```
    
    ```java
    int sum1 = 1000 * 2;
    int sum2 = sum1 * 10;
    int sum3 = sum1 * sum2;
    ```
    
    ```java
    int sum1 = 1000 / 5;
    int sum2 = sum1 / 2;
    int sum3 = sum1 / sum2;
    ```
    
- More uses of operators
    
    ```java
    int = 2; int y = 4;
    int result = x + y;
    System.out.println(result);
    ```
    
    ```java
    int test = 5;
    ++test;
    //test is now 6
    ```
    
    ```java
    int test = 5;
    --test;
    //test is now 6
    ```
    
    ```java
    int x = 34;
    int y = ++x;
    // y rn is 35
    ```
    

## Assignment Operator

- Addition and assignment (+=)

```java
int num1 = 4;
int num2 = 8;
num2 += num1; //num2 = num2 + num1;
//num2 is 12 and num1 is 4
```

```java
int num1 = 4;
int num2 = 8;
num2 -= num1; //num2 = num2 + num1;
//num2 is 4 and num1 is 4
```

- Substraction and assignment (-=)