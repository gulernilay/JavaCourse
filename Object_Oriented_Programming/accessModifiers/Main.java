package Object_Oriented_Programming.accessModifiers;

public class Main {
}


/*
Public : accessible from anywhere ( from different packeges ...)

Protected: applicable for variable, methods,constructor / not applicable for classes and interfaces
Within the same class in which it is declared.
By subclasses (child classes) of the class in which it is declared, regardless of the package in which the subclass resides.
By other classes in the same package in which the member is declared.

// In file A.java
package package1;

public class A {
    protected int protectedMember = 10;
}

// In file B.java
package package1;

public class B extends A {
    void display() {
        // Accessing protected member within the same package
        System.out.println(protectedMember);
    }
}

// In file C.java  - farklı package daama subclassı
package package2;

import package1.A;

public class C extends A {
    void display() {
        // Accessing protected member in a subclass outside the package
        System.out.println(protectedMember);
    }
}





private :This modifier is not applicable for top-level classes or interfaces. It is only applicable to constructors, methods, and fields inside the classes. If a variable or methods or constructor is declared as private then we can access them only from within the class i.e from outside the class we can’t access them.



Package(Default) Access Modifier   : A class or method or variable declare without any access modifier then is considered that it has a package(default)access modifier
The default modifier act as public within the same package and acts as private outside the package.
// Java Program to illustrate Package Level Access Modifier

// Importing utility classes
// Importing input output classes
import java.io.*;
import java.util.*;

// Main Class
class GFG {

    // Declaring default variables that is
    // having no access modifier
    String s = "Geeksfor";
    String s1 = "Geeks";

    // Method 1
    // To declare a default method
    String fullName()
    {

        // Concatenation of strings
        return s + s1;
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {

        // Creating an object of main class(GFG)
        // in the main() method
        GFG g = new GFG();

        // Calling method1 using class instance
        // and printing the concatenation of strings
        System.out.println(g.fullName());
    }
}
 */