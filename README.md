# java-SE-course-
Java SE Course Description

## command mode
### > javac FirstCode.java
### > set path="c:\..."
### > javac FirstCode.java
### > java FirstCode

# Variables
> A variable is a container which holds the value while the java program is executed. A variable is assigned with a datatype.

> Variable is a name of memory location. There are three types of variables in java: local, instance and static. There are two types of data types in java: primitive and non-primitive.

> Variable is name of reserved area allocated in memory. In other words, it is a name of memory location. It is a combination of "vary + able" that means its value can be changed.

```
int data=50;//Here data is variable  
```

## Types of Variables
> There are three types of variables in java:
- local variable
- instance variable
- static variable

#### local variable
> A variable declared inside the body of the method is called local variable. You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists. 
A local variable cannot be defined with "static" keyword.

#### Instance Variable
> A variable declared inside the class but outside the body of the method, is called instance variable. It is not declared as static. It is called instance variable because its value is instance specific and is not shared among instances.

#### Static variable
> A variable which is declared as static is called static variable. It cannot be local. You can create a single copy of static variable and share among all the instances of the class. Memory allocation for static variable happens only once when the class is loaded in the memory.

### Example
```
class A{  
int data=50;//instance variable  
static int m=100;//static variable  
void method(){  
int n=90;//local variable  
}  
}//end of class 
```

#### Java Variable Example: Widening
```java
    class Simple{  
    public static void main(String[] args){  
    int a=10;  
    float f=a;  
    System.out.println(a);  
    System.out.println(f);  
    }}  
```
#### Java Variable Example: Narrowing (Typecasting)
```java
    class Simple{  
    public static void main(String[] args){  
    float f=10.5f;  
    //int a=f;//Compile time error  
    int a=(int)f;  
    System.out.println(f);  
    System.out.println(a);  
    }
}   
```

#### Java Variable Example: Overflow
```java
    class Simple{  
    public static void main(String[] args){  
    //Overflow  
    int a=130;  
    byte b=(byte)a;  
    System.out.println(a);  
    System.out.println(b);  
    } 
}   
```
#### Java Variable Example: Adding Lower Type
```java
    class Simple{  
    public static void main(String[] args){  
    byte a=10;  
    byte b=10;  
    //byte c=a+b;//Compile Time Error: because a+b=20 will be int  
    byte c=(byte)(a+b);  
    System.out.println(c);  
    }
} 
```

## Data Types in Java

> Data types specify the different sizes and values that can be stored in the variable. There are two types of data types in Java:
- Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.
- Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.

### Primitive data type
 
 > There are 8 types of primitive data types: 
 - boolean data type  1 bit
 - byte data type 2 byte
 - char data type 1 byte
 - short data type 2 byte
 - int data type 4 byte
 - long data type 8 byte
 - float data type 4 byte
 - double data type 8 byte
 
 ### Constructors in Java
 > In Java, a constructor is a block of codes similar to the method. It is called when an instance of the object is created, and memory is allocated for the object.
  It is a special type of method which is used to initialize the object. 

#### Types of Java constructors

> There are two types of constructors in Java:

     - Default constructor (no-arg constructor)
     - Parameterized constructor
