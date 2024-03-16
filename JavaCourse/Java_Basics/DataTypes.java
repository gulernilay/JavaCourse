package Java_Basics;

import javax.xml.crypto.Data;

public class DataTypes{
    public static void main(String[] args) {
        //Primitive Data Types: stores data value directly
        boolean isJavaFun = true; // true or false
        byte age=30; // Stores 8-bit integers (-128 to 127)
        short year = 2024;  // Stores 16-bit integers (-32,768 to 32,767).
        long distance = 10000000000L;  //long: Stores 64-bit integers (-2^63 to 2^63-1).
        float price = 10.99f; // Stores 32-bit floating-point numbers.
        double pi = 3.14159; // Stores 64-bit floating-point numbers.
        char grade = 'A'; // Stores a single 16-bit Unicode character.

        // Reference Data Types: do not store variable value directly, only contains memory address of variables
        int[] numbers = {1, 2, 3, 4, 5}; // array is subclass of Object class
        System.out.println(numbers); // memory space of array is printed
        String s1 = new String("GeeksforGeeks");
        DataTypes myObject = new DataTypes();

    }
}
interface Animal {
    void eat(); //only method signature, no body
    void sleep();
}
abstract class Dog implements Animal{  // if class does not implements all methods in interface, so sign it as ABSTRACT CLASS
    @Override
    public void eat() {
        System.out.println("Dog is an animal");
    }

}
class Cat implements Animal{ // if implements all methods , so class is not abstract
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}





/*
Data types in Java are of different sizes and values that can be stored in the variable
    Primitive Data Type: such as boolean, char, int, short, byte, long, float, and double
    Non-Primitive Data Type = Object Data type =  Reference Data Type : Interface ,Classes and objects, String, Array, etc// The Reference Data Types will contain a memory address of variable values because the reference types won’t store the variable value directly in memory.



*/
