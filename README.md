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
     
### Inheritance in Java

> Inheritance is an important pillar of OOP(Object Oriented Programming). It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class
##### Important terminology:
- Super Class: The class whose features are inherited is known as super class(or a base class or a parent class).
- Sub Class: The class that inherits the other class is known as sub class(or a derived class, extended class, or child class). The subclass can add its own fields and methods in addition to the superclass fields and methods.
- Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.

##### Example 

```java
//Java program to illustrate the  
// concept of inheritance 
  
// base class 
class Bicycle  
{ 
    // the Bicycle class has two fields 
    public int gear; 
    public int speed; 
          
    // the Bicycle class has one constructor 
    public Bicycle(int gear, int speed) 
    { 
        this.gear = gear; 
        this.speed = speed; 
    } 
          
    // the Bicycle class has three methods 
    public void applyBrake(int decrement) 
    { 
        speed -= decrement; 
    } 
          
    public void speedUp(int increment) 
    { 
        speed += increment; 
    } 
      
    // toString() method to print info of Bicycle 
    public String toString()  
    { 
        return("No of gears are "+gear 
                +"\n"
                + "speed of bicycle is "+speed); 
    }  
} 
  
// derived class 
class MountainBike extends Bicycle  
{ 
      
    // the MountainBike subclass adds one more field 
    public int seatHeight; 
  
    // the MountainBike subclass has one constructor 
    public MountainBike(int gear,int speed, 
                        int startHeight) 
    { 
        // invoking base-class(Bicycle) constructor 
        super(gear, speed); 
        seatHeight = startHeight; 
    }  
          
    // the MountainBike subclass adds one more method 
    public void setHeight(int newValue) 
    { 
        seatHeight = newValue; 
    }  
      
    // overriding toString() method 
    // of Bicycle to print more info 
    @Override
    public String toString() 
    { 
        return (super.toString()+ 
                "\nseat height is "+seatHeight); 
    } 
      
} 
  
// driver class 
public class Test  
{ 
    public static void main(String args[])  
    { 
          
        MountainBike mb = new MountainBike(3, 100, 25); 
        System.out.println(mb.toString()); 
              
    } 
} 

```
