package Object_Oriented_Programming.inheritance;

// Multilevel inheritance
// Class C ---> Class B ---> Class A
// Class C is derived from Class B which in correspondence derived from Class A

class A {
    int a;
    void set_A(int x) {
        a = x;
    }
}

// Child of Class A
class B extends A {
    int b;
    void set_B(int x) {
        b = x;
    }
}

// Child of Class B but have access to methods of both classes, i.e., Class A and B
class C extends B {
    int c, product;
    void cal_Product()
    {
        product = a * b;
        System.out.println("Product = " + product);
    }
    public static void main(String[] args)
    {
        C c = new C();
        // Class C accesses methods of both class A and B
        c.set_A(5);
        c.set_B(5);
        c.cal_Product();
    }
}
