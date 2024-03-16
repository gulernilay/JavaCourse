package Object_Oriented_Programming.inheritance;

// Hierarchical inheritance
// Class C ---> Class A <--- Class B
// Both Class B and C inherits Class A

class D {
    int a;
    void set_D(int x) {
        a = x;
        System.out.println("Setting A's value to = " + x);
    }
}

// Class B derived from Class A
class E extends D {
    int b;
    void set_B(int x) {
        b = x;
        System.out.println("Setting B's value to = " + b);
    }
}

// Class C also derived from Class A
class F extends D {
    int c;
    void set_C(int x) {
        c = x;
        System.out.println("Setting C's value to = " + c);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        D c = new D();
        c.set_D(5);
        c.set_D(50);

        B b = new B();
        b.set_B(10);
        b.set_A(15);
    }
}






/*
When two or more classes inherit a single class, it is known as hierarchical inheritance.
 */
