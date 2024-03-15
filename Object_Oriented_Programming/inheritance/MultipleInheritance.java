package Object_Oriented_Programming.inheritance;

import java.io.*;
class Parent1 { //Parent Class
    void fun() {
        System.out.println("Parent1");
    }
}
class Parent2 { // Parent Class
    void fun() {
        System.out.println("Parent2");
    }
}
/*
class MultipleInheritance extends Parent1, Parent2 { // subclass of 2 parent class is not allowed
    // Main driver method
    public static void main(String args[]) {
        MultipleInheritance t = new MultipleInheritance();
        t.fun();// Error is thrown as this class is inheriting multiple classes
    }
}




Multiple Inheritance is a feature of an object-oriented concept, where a class can inherit properties of more than one parent class.
The problem occurs when there exist methods with the same signature in both the superclasses and subclass.
On calling the method, the compiler cannot determine which class method to be called and even on calling which class method gets the priority.
Note: Java doesn’t support Multiple Inheritance
 */
