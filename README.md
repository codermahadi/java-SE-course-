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

### Abstraction in Java
> Data Abstraction is the property by virtue of which only the essential details are displayed to the user.The trivial or the non-essentials units are not displayed to the user. Ex: A car is viewed as a car rather than its individual components. Data Abstraction may also be defined as the process of identifying only the required characteristics of an object ignoring the irrelevant details.The properties and behaviors of an object differentiate it from other objects of similar type and also help in classifying/grouping the objects.
Consider a real-life example of a man driving a car. The man only knows that pressing the accelerators will increase the speed of car or applying brakes will stop the car but he does not know about how on pressing the accelerator the speed is actually increasing, he does not know about the inner mechanism of the car or the implementation of accelerator, brakes etc in the car. This is what abstraction is.
In java, abstraction is achieved by interfaces and abstract classes. We can achieve 100% abstraction using interfaces.

#### Abstract classes and Abstract methods : 

- An abstract class is a class that is declared with abstract keyword.
- An abstract method is a method that is declared without an implementation.
- An abstract class may or may not have all abstract methods. Some of them can be concrete methods
- A method defined abstract must always be redefined in the subclass,thus making overriding compulsory OR either make subclass itself abstract.
- Any class that contains one or more abstract methods must also be declared with abstract keyword.
- There can be no object of an abstract class.That is, an abstract class can not be directly instantiated with the new operator.
- An abstract class can have parametrized constructors and default constructor is always present in an abstract class.

```java

// Java program to illustrate the 
// concept of Abstraction 
abstract class Shape  
{ 
    String color; 
      
    // these are abstract methods 
    abstract double area(); 
    public abstract String toString(); 
      
    // abstract class can have constructor 
    public Shape(String color) { 
        System.out.println("Shape constructor called"); 
        this.color = color; 
    } 
      
    // this is a concrete method 
    public String getColor() { 
        return color; 
    } 
} 
class Circle extends Shape 
{ 
    double radius; 
      
    public Circle(String color,double radius) { 
  
        // calling Shape constructor 
        super(color); 
        System.out.println("Circle constructor called"); 
        this.radius = radius; 
    } 
  
    @Override
    double area() { 
        return Math.PI * Math.pow(radius, 2); 
    } 
  
    @Override
    public String toString() { 
        return "Circle color is " + super.color +  
                       "and area is : " + area(); 
    } 
      
} 
class Rectangle extends Shape{ 
  
    double length; 
    double width; 
      
    public Rectangle(String color,double length,double width) { 
        // calling Shape constructor 
        super(color); 
        System.out.println("Rectangle constructor called"); 
        this.length = length; 
        this.width = width; 
    } 
      
    @Override
    double area() { 
        return length*width; 
    } 
  
    @Override
    public String toString() { 
        return "Rectangle color is " + super.color +  
                           "and area is : " + area(); 
    } 
  
} 
public class Test  
{ 
    public static void main(String[] args) 
    { 
        Shape s1 = new Circle("Red", 2.2); 
        Shape s2 = new Rectangle("Yellow", 2, 4); 
          
        System.out.println(s1.toString()); 
        System.out.println(s2.toString()); 
    } 
} 

```
Output:
```java
Shape constructor called
Circle constructor called
Shape constructor called
Rectangle constructor called
Circle color is Redand area is : 15.205308443374602
Rectangle color is Yellowand area is : 8.0
```

#### Encapsulation vs Data Abstraction
- Encapsulation is data hiding(information hiding) while Abstraction is detail hiding(implementation hiding).
- While encapsulation groups together data and methods that act upon the data, data abstraction deals with exposing the interface to the user and hiding the details of implementation.

#### Advantages of Abstraction

- It reduces the complexity of viewing the things.
- Avoids code duplication and increases reusability.
- Helps to increase security of an application or program as only important details are provided to the user.

#### Interfaces in Java

> Like a class, an interface can have methods and variables, but the methods declared in interface are by default abstract (only method signature, no body).  

- Interfaces specify what a class must do and not how. It is the blueprint of the class.
- An Interface is about capabilities like a Player may be an interface and any class implementing Player must be able to (or must implement) move(). So it specifies a set of methods that the class has to implement.
- If a class implements an interface and does not provide method bodies for all functions specified in the interface, then class must be declared abstract. 
- A Java library example is, Comparator Interface. If a class implements this interface, then it can be used to sort a collection.

##### Why do we use interface ?
- It is used to achieve total abstraction.
- Since java does not support multiple inheritance in case of class, but by using interface it can achieve multiple inheritance .
- It is also used to achieve loose coupling.
- Interfaces are used to implement abstraction. So the question arises why use interfaces when we have abstract classes?

```java

// A simple interface 
interface Player 
{ 
    final int id = 10; 
    int move(); 
} 

```

To implement an interface we use keyword: implement

```java

// Java program to demonstrate working of  
// interface. 
import java.io.*; 
  
// A simple interface 
interface in1 
{ 
    // public, static and final 
    final int a = 10; 
  
    // public and abstract  
    void display(); 
} 
  
// A class that implements interface. 
class testClass implements in1 
{ 
    // Implementing the capabilities of 
    // interface. 
    public void display() 
    { 
        System.out.println("Geek"); 
    } 
  
    // Driver Code 
    public static void main (String[] args) 
    { 
        testClass t = new testClass(); 
        t.display(); 
        System.out.println(a); 
    } 
}
```

#### A real world example:
> Let’s consider the example of vehicles like bicycle, car, bike………,they have common functionalities. So we make an interface and put all these common functionalities. And lets Bicylce, Bike, car ….etc implement all these functionalities in their own class in their own way.

```java

import java.io.*; 
  
interface Vehicle { 
      
    // all are the abstract methods. 
    void changeGear(int a); 
    void speedUp(int a); 
    void applyBrakes(int a); 
} 
  
class Bicycle implements Vehicle{ 
      
    int speed; 
    int gear; 
      
     // to change gear 
    @Override
    public void changeGear(int newGear){ 
          
        gear = newGear; 
    } 
      
    // to increase speed 
    @Override
    public void speedUp(int increment){ 
          
        speed = speed + increment; 
    } 
      
    // to decrease speed 
    @Override
    public void applyBrakes(int decrement){ 
          
        speed = speed - decrement; 
    } 
      
    public void printStates() { 
         System.out.println("speed: " + speed 
              + " gear: " + gear); 
    } 
} 
  
class Bike implements Vehicle { 
      
    int speed; 
    int gear; 
      
    // to change gear 
    @Override
    public void changeGear(int newGear){ 
          
        gear = newGear; 
    } 
      
    // to increase speed 
    @Override
    public void speedUp(int increment){ 
          
        speed = speed + increment; 
    } 
      
    // to decrease speed 
    @Override
    public void applyBrakes(int decrement){ 
          
        speed = speed - decrement; 
    } 
      
    public void printStates() { 
         System.out.println("speed: " + speed 
             + " gear: " + gear); 
    } 
      
} 
class GFG { 
      
    public static void main (String[] args) { 
      
        // creating an inatance of Bicycle  
        // doing some operations  
        Bicycle bicycle = new Bicycle(); 
        bicycle.changeGear(2); 
        bicycle.speedUp(3); 
        bicycle.applyBrakes(1); 
          
        System.out.println("Bicycle present state :"); 
        bicycle.printStates(); 
          
        // creating instance of bike. 
        Bike bike = new Bike(); 
        bike.changeGear(1); 
        bike.speedUp(4); 
        bike.applyBrakes(3); 
          
        System.out.println("Bike present state :"); 
        bike.printStates(); 
    } 
} 

```

> Java 8

```java
// An example to show that interfaces can 
// have methods from JDK 1.8 onwards 
interface in1 
{ 
    final int a = 10; 
    default void display() 
    { 
        System.out.println("hello"); 
    } 
} 
  
// A class that implements interface. 
class testClass implements in1 
{ 
    // Driver Code 
    public static void main (String[] args) 
    { 
        testClass t = new testClass(); 
        t.display(); 
    } 
} 
```