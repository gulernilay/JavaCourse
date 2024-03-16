package Object_Oriented_Programming.accessModifiers;

public class Main {


    public String name;//public : accessible from everywhere
    private int age; // private: accesible only within related class *********** applicable for METHODS /CONSTRUCTOR/VARIABLE
    protected float experienceYear; // protected: accessible within package + subclasses ******* applicable for METHODS /CONSTRUCTOR/VARIABLE
    String surname; // default: asccesible within package  ********* applicable for CLASS/VARIABLE/METHODS /CONSTRUCTOR

    String fullName() { // default method
        // Concatenation of strings
        return name + surname;
    }

    public static void main(String[] args) {

    }
}


/*

------------------------------------PROTECTED------------------------------------------------------------------------
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

------------------------------------------------------------------------------------------------------------

 */