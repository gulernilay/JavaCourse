package Object_Oriented_Programming.keywords;
import java.util.*;

public class AllKeywords {

}



/*
1- abstract - method or class
2- enum :	A Java keyword is used to declare an enumerated type. Enumerations extend the base class.
class Counter {
    private int count = 0;

    synchronized void increment() {
        count++;
    }
}
3- final :indicates that a variable holds a constant value or that a method will not be overridden
final int MAX_VALUE = 100;

class Base {
    final void display() {
        System.out.println("This method cannot be overridden");
    }
}


4- finally : try -catch - finally
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
} finally {
    System.out.println("This block is always executed");
}


5- instanceof :Indicates whether an object is an instance of a specific class or implements an interface
class Animal {}
class Dog extends Animal {}

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        if (a instanceof Dog) {
            System.out.println("a is an instance of Dog");
        }
    }
}


6- synchronized:Specifies critical sections or methods in multithreaded code
class Counter {
    private int count = 0;

    synchronized void increment() {
        count++;
    }
}


7- throw: Creates an exception
void checkAge(int age) {
    if (age < 18) {
        throw new ArithmeticException("Not eligible for voting");
    } else {
        System.out.println("Eligible for voting");
    }
}


8- volatile:  This indicates that a variable may change asynchronously
class SharedObject {
    volatile int sharedVariable = 0;
}



boolean , break ,byte , case ( switch ) , catch ,tr , char , class,continue, do , double , else , extends ,
float ,for , if ,implements , import , int  ,interface , long , ew , null , package, private, protected , public ,void ,while  return, short ,  super , switch ,
 */
