/*    Types of Operators in Java : 
Arithmetic Operators
Unary Operators
Assignment Operator
Relational Operators
Logical Operators
Ternary Operator
Bitwise Operators
Shift Operators
instance of operator
*/

//arithmetic operators:  * , / , % , + , -
import java.io.*;
 
// Drive Class
class GFG {
      // Main Function
    public static void main (String[] args) {
           
        // Arithmetic operators
        int a = 10;
        int b = 3;
       
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
           
    }
}

//unary operators  : - , + , -- , ++ 
import java.io.*;
 
// Driver Class
class GFG {
      // main function
    public static void main(String[] args)
    {
        // Interger declared
        int a = 10;
        int b = 10;
 
        // Using uniary operators
        System.out.println("Postincrement : " + (a++)); // 10 Value is first used for computing the result and then incremented. 
        System.out.println("Preincrement : " + (++a)); // 12 Value is incremented first, and then the result is computed. 
 
        System.out.println("Postdecrement : " + (b--)); // 10 Value is first used for computing the result and then decremented. 
        System.out.println("Predecrement : " + (--b)); // 8 The value is decremented first, and then the result is computed.
    }
}


//assignment operator: += , -= , *= , /= , %= 

//relational operators: 
import java.io.*;
class GFG {
    public static void main(String[] args)
    {
        int a = 10;
        int b = 3;
        int c = 5;
        System.out.println("a > b: " + (a > b)); //true
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a != c: " + (a != c));
    }
}


//Logical Operators
import java.io.*;
 
// Driver Class
class GFG {
      // Main Function
    public static void main (String[] args) {
        // Logical operators
        boolean x = true;
        boolean y = false;
       
        System.out.println("x && y: " + (x && y));  //logical AND - false
        System.out.println("x || y: " + (x || y)); //logical OR -true
        System.out.println("!x: " + (!x)); //logical NOT -false
    }
}


//instanceof operator : used to test if an object is an instance of a class, a subclass, or an interface
class operators {
    public static void main(String[] args)
    {
 
        Person obj1 = new Person();
        Person obj2 = new Boy();
 
        // As obj is of type person, it is not an
        // instance of Boy or interface
        System.out.println("obj1 instanceof Person: "
                           + (obj1 instanceof Person));
        System.out.println("obj1 instanceof Boy: "
                           + (obj1 instanceof Boy));
        System.out.println("obj1 instanceof MyInterface: "
                           + (obj1 instanceof MyInterface));
 
        // Since obj2 is of type boy,
        // whose parent class is person
        // and it implements the interface Myinterface
        // it is instance of all of these classes
        System.out.println("obj2 instanceof Person: "
                           + (obj2 instanceof Person));
        System.out.println("obj2 instanceof Boy: "
                           + (obj2 instanceof Boy));
        System.out.println("obj2 instanceof MyInterface: "
                           + (obj2 instanceof MyInterface));
    }
}
 
class Person {
}
 
class Boy extends Person implements MyInterface {
}
 
interface MyInterface {
}












