/*
Data types in Java are of different sizes and values that can be stored in the variable
Primitive Data Type: such as boolean, char, int, short, byte, long, float, and double
Non-Primitive Data Type or Object Data type or Reference Data Type : Interface ,Classes and objects, String, Array, etc.

*/


/*

boolean isJavaFun = true; // true or false
byte age=30; // Stores 8-bit integers (-128 to 127)
short year = 2024;  // Stores 16-bit integers (-32,768 to 32,767).
int population = 100000; // Stores 32-bit integers (-2^31 to 2^31-1).
long distance = 10000000000L;  //long: Stores 64-bit integers (-2^63 to 2^63-1).
float price = 10.99f; // Stores 32-bit floating-point numbers.
double pi = 3.14159; // Stores 64-bit floating-point numbers.
char grade = 'A'; // Stores a single 16-bit Unicode character. 

// Reference Data Types: The Reference Data Types will contain a memory address of variable values because the reference types won’t store the variable value directly in memory.
int[] numbers = {1, 2, 3, 4, 5}; // array
// Declare String without using new operator 
String s = "GeeksforGeeks"; 
// Declare String using new operator 
String s1 = new String("GeeksforGeeks"); 
//A class is a user-defined blueprint or prototype from which objects are created. It represents the set of properties or methods that are common to all objects of one type.
MyClass myObject = new MyClass();
//Object :  real-life entities.
//Array:  dynamically allocated , size of an array must be specified by an int value , direct superclass of an array type is Object




//An interface can have methods and variables, but the methods declared in an interface are by default abstract (only method signature, no body).   
//If a class implements an interface and does not provide method bodies for all functions specified in the interface, then the class must be declared abstract.   
interface Animal {
    void eat();
    void sleep();
}

// Arayüzü uygulayan ancak tüm metotları tanımlamayan bir sınıf
abstract class Dog implements Animal {
    // 'eat' metodu için bir gövde sağlandı
    public void eat() {
        System.out.println("Köpek yemek yiyor.");
    }

    // 'sleep' metodu için bir gövde sağlanmadı, bu yüzden sınıf soyut olarak tanımlandı
}

// Arayüzü uygulayan ve tüm metotları tanımlayan bir sınıf
class Labrador extends Dog {
    // 'Dog' sınıfından kalıtılan 'sleep' metodunu uygulama
    public void sleep() {
        System.out.println("Labrador uyuyor.");
    }
}
public class DataTypes {
    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        labrador.eat();   // "Köpek yemek yiyor." çıktısını verir
        labrador.sleep(); // "Labrador uyuyor." çıktısını verir
    }
}


*/
