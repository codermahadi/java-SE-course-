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

#### Arrays in Java

>An array is a group of like-typed variables that are referred to by a common name.Arrays in Java work differently than they do in C/C++. Following are some important point about Java arrays.

- In Java all arrays are dynamically allocated.(discussed below) 
- Since arrays are objects in Java, we can find their length using member length. This is different from C/C++ where we find length using sizeof.
- A Java array variable can also be declared like other variables with [] after the data type.
- The variables in the array are ordered and each have an index beginning from 0.
- Java array can be also be used as a static field, a local variable or a method parameter.
- The size of an array must be specified by an int value and not long or short.
- The direct superclass of an array type is Object.
- Every array type implements the interfaces Cloneable and java.io.Serializable.

> Array can contains primitives data types as well as objects of a class depending on the definition of array. In case of primitives data types, the actual values are stored in contiguous memory locations. In case of objects of a class, the actual objects are stored in heap segment. 

##### Creating, Initializing, and Accessing an Array

One-Dimensional Arrays : 
> The general form of a one-dimensional array declaration is

```java
type var-name[];
OR
type[] var-name;
```

>An array declaration has two components: the type and the name. type declares the element type of the array. The element type determines the data type of each element that comprises the array. Like array of int type, we can also create an array of other primitive data types like char, float, double..etc or user defined data type(objects of a class).Thus, the element type for the array determines what type of data the array will hold.

Example:
```java
// both are valid declarations
int intArray[]; 
or int[] intArray; 

byte byteArray[];
short shortsArray[];
boolean booleanArray[];
long longArray[];
float floatArray[];
double doubleArray[];
char charArray[];

// an array of references to objects of
// the class MyClass (a class created by
// user)
MyClass myClassArray[]; 

Object[]  ao,        // array of Object
Collection[] ca;  // array of Collection
                     // of unknown type
```

#### Instantiating an Array in Java 
> When an array is declared, only a reference of array is created. To actually create or give memory to array, you create an array like this:The general form of new as it applies to one-dimensional arrays appears as follows:
```java
var-name = new type [size];
OR
int intArray[];    //declaring array
intArray = new int[20];  // allocating memory to array
```

#### Accessing Java Array Elements using for Loop

> Each element in the array is accessed via its index. The index begins with 0 and ends at (total array size)-1. All the elements of array can be accessed using Java for Loop.

```java
// accessing the elements of the specified array
for (int i = 0; i < arr.length; i++)
  System.out.println("Element at index " + i + 
                                " : "+ arr[i]);
```
Implementation:
```java

// Java program to illustrate creating an array 
// of integers,  puts some values in the array, 
// and prints each value to standard output. 
  
class GFG  
{ 
    public static void main (String[] args)  
    {          
      // declares an Array of integers. 
      int[] arr; 
          
      // allocating memory for 5 integers. 
      arr = new int[5]; 
          
      // initialize the first elements of the array 
      arr[0] = 10; 
          
      // initialize the second elements of the array 
      arr[1] = 20; 
          
      //so on... 
      arr[2] = 30; 
      arr[3] = 40; 
      arr[4] = 50; 
          
      // accessing the elements of the specified array 
      for (int i = 0; i < arr.length; i++) 
         System.out.println("Element at index " + i +  
                                      " : "+ arr[i]);           
    } 
} 

```
Output:

```java
Element at index 0 : 10
Element at index 1 : 20
Element at index 2 : 30
Element at index 3 : 40
Element at index 4 : 50
```

### Arrays of Objects

> An array of objects is created just like an array of primitive type data items in the following way.

```java
Student[] arr = new Student[7]; //student is a user-defined class
```
> The studentArray contains seven memory spaces each of size of student class in which the address of seven Student objects can be stored.The Student objects have to be instantiated using the constructor of the Student class and their references should be assigned to the array elements in the following way.
```java
Student[] arr = new Student[5];

// Java program to illustrate creating an array of 
// objects 
  
class Student 
{ 
    public int roll_no; 
    public String name; 
    Student(int roll_no, String name) 
    { 
        this.roll_no = roll_no; 
        this.name = name; 
    } 
} 
  
// Elements of array are objects of a class Student. 
public class GFG 
{ 
    public static void main (String[] args) 
    { 
        // declares an Array of integers. 
        Student[] arr; 
  
        // allocating memory for 5 objects of type Student. 
        arr = new Student[5]; 
  
        // initialize the first elements of the array 
        arr[0] = new Student(1,"aman"); 
  
        // initialize the second elements of the array 
        arr[1] = new Student(2,"vaibhav"); 
  
        // so on... 
        arr[2] = new Student(3,"shikar"); 
        arr[3] = new Student(4,"dharmesh"); 
        arr[4] = new Student(5,"mohit"); 
  
        // accessing the elements of the specified array 
        for (int i = 0; i < arr.length; i++) 
            System.out.println("Element at " + i + " : " + 
                        arr[i].roll_no +" "+ arr[i].name); 
    } 
}
```

#### What happens if we try to access element outside the array size?

> Compiler throws ArrayIndexOutOfBoundsException to indicate that array has been accessed with an illegal index. The index is either negative or greater than or equal to size of array.
```java

class GFG 
{ 
    public static void main (String[] args) 
    { 
        int[] arr = new int[2]; 
        arr[0] = 10; 
        arr[1] = 20; 
  
        for (int i = 0; i <= arr.length; i++) 
            System.out.println(arr[i]); 
    } 
} 

```
### Multidimensional Arrays

> Multidimensional arrays are arrays of arrays with each element of the array holding the reference of other array. These are also known as Jagged Arrays. A multidimensional array is created by appending one set of square brackets ([]) per dimension. Examples:


>int[][] intArray = new int[10][20]; //a 2D array or matrix
 int[][][] intArray = new int[10][20][10]; //a 3D array
 
 ```java

class multiDimensional 
{ 
    public static void main(String args[]) 
    { 
        // declaring and initializing 2D array 
        int arr[][] = { {2,7,9},{3,6,1},{7,4,2} }; 
  
        // printing 2D array 
        for (int i=0; i< 3 ; i++) 
        { 
            for (int j=0; j < 3 ; j++) 
                System.out.print(arr[i][j] + " "); 
  
            System.out.println(); 
        } 
    } 
} 

```
Output:
 ```java
2 7 9 
3 6 1 
7 4 2 
```
#### Passing Arrays to Methods
> Like variables, we can also pass arrays to methods.For example, below program pass array to method sum for calculating sum of array’s values.

```java

// Java program to demonstrate  
// passing of array to method 
  
class Test 
{     
    // Driver method 
    public static void main(String args[])  
    { 
        int arr[] = {3, 1, 2, 5, 4}; 
          
        // passing array to method m1 
        sum(arr); 
      
    } 
  
    public static void sum(int[] arr)  
    { 
        // getting sum of array values 
        int sum = 0; 
          
        for (int i = 0; i < arr.length; i++) 
            sum+=arr[i]; 
          
        System.out.println("sum of array values : " + sum); 
    } 
} 

```
output:
sum of array values : 15

##### Returning Arrays from Methods

>As usual, a method can also return an array. For example, below program returns an array from method m1.

```java

// Java program to demonstrate  
// return of array from method 
  
class Test 
{     
    // Driver method 
    public static void main(String args[])  
    { 
        int arr[] = m1(); 
          
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i]+" "); 
      
    } 
  
    public static int[] m1()  
    { 
        // returning  array 
        return new int[]{1,2,3}; 
    } 
} 

```

Output:
1 2 3

#### Class Objects for Arrays
> Every array has an associated Class object, shared with all other arrays with the same component type.

```java

// Java program to demonstrate  
// Class Objects for Arrays 
  
class Test 
{  
    public static void main(String args[])  
    { 
        int intArray[] = new int[3]; 
        byte byteArray[] = new byte[3]; 
        short shortsArray[] = new short[3]; 
          
        // array of Strings 
        String[] strArray = new String[3]; 
          
        System.out.println(intArray.getClass()); 
        System.out.println(intArray.getClass().getSuperclass()); 
        System.out.println(byteArray.getClass()); 
        System.out.println(shortsArray.getClass()); 
        System.out.println(strArray.getClass()); 
    } 
} 

```

Output:
```java
class [I
class java.lang.Object
class [B
class [S
class [Ljava.lang.String;
```
Explanantion :

- The string “[I” is the run-time type signature for the class object “array with component type int“
- The only direct superclass of any array type is java.lang.Object.
- The string “[B” is the run-time type signature for the class object “array with component type byte“.
- The string “[S” is the run-time type signature for the class object “array with component type short“.
- The string “[L” is the run-time type signature for the class object “array with component type of a Class”. The Class name is then followed.

#### Array Members

> Now as you know that arrays are object of a class and direct superclass of arrays is class Object.The members of an array type are all of the following:
- The public final field length, which contains the number of components of the array. length may be positive or zero.
- All the members inherited from class Object; the only method of Object that is not inherited is its clone method.
- The public method clone(), which overrides clone method in class Object and throws no checked exceptions.

#### Cloning of arrays
>When you clone a single dimensional array, such as Object[], a “deep copy” is performed with the new array containing copies of the original array’s elements as opposed to references

```java

// Java program to demonstrate  
// cloning of one-dimensional arrays 
  
class Test 
{     
    public static void main(String args[])  
    { 
        int intArray[] = {1,2,3}; 
          
        int cloneArray[] = intArray.clone(); 
          
        // will print false as deep copy is created 
        // for one-dimensional array 
        System.out.println(intArray == cloneArray); 
          
        for (int i = 0; i < cloneArray.length; i++) { 
            System.out.print(cloneArray[i]+" "); 
        } 
    } 
} 

```

#### Inner class in java

> Inner class means one class which is a member of another class. There are basically four types of inner classes in java.

- Nested Inner class
- Method Local inner classes
- Anonymous inner classes
- Static nested classes

> Nested Inner class can access any private instance variable of outer class. Like any other instance variable, we can have access modifier private, protected, public and default modifier.
  Like class, interface can also be nested and can have access specifiers.
  Following example demonstrates a nested class.
  
  ```java

class Outer { 
   // Simple nested inner class 
   class Inner { 
      public void show() { 
           System.out.println("In a nested class method"); 
      } 
   } 
} 
class Main { 
   public static void main(String[] args) { 
       Outer.Inner in = new Outer().new Inner(); 
       in.show(); 
   } 
} 

```
Output: 
```java
In a nested class method
```
> As a side note, we can’t have static method in a nested inner class because an inner class is implicitly associated with an object of its outer class so it cannot define any static method for itself. For example the following program doesn’t compile. 
```java

class Outer { 
   void outerMethod() { 
      System.out.println("inside outerMethod"); 
   } 
   class Inner { 
      public static void main(String[] args){ 
         System.out.println("inside inner class Method"); 
      } 
   } 
}

Output:

Error illegal static declaration in inner class 
Outer.Inner public static void main(String[] args) 
modifier ‘static’ is only allowed in constant 
variable declaration 
```

#### Method Local inner classes

> Inner class can be declared within a method of an outer class. In the following example, Inner is an inner class in outerMethod().

```java

class Outer { 
    void outerMethod() { 
        System.out.println("inside outerMethod"); 
        // Inner class is local to outerMethod() 
        class Inner { 
            void innerMethod() { 
                System.out.println("inside innerMethod"); 
            } 
        } 
        Inner y = new Inner(); 
        y.innerMethod(); 
    } 
} 
class MethodDemo { 
    public static void main(String[] args) { 
        Outer x = new Outer(); 
        x.outerMethod(); 
    } 
} 

```