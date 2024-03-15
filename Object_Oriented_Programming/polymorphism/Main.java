package Object_Oriented_Programming.polymorphism;


class A {
    int a, b, c;

    public void add(int x, int y)
    {
        a = x;
        b = y;
        System.out.println("addition of a+b is:" + (a + b));
    }

    public void add(int x, int y, int z) // add function is overloaded
    {
        a = x;
        b = y;
        c = z;
        System.out.println("addition of a+b+c is:" + (a + b + c));
    }

    public void print()
    {
        System.out.println("Class A's method is running");
    }
};

// Soyut bir üst sınıf tanımlıyoruz.
abstract class Shape {
    // Soyut bir metod tanımlıyoruz.
    abstract void draw();
}

// Shape sınıfından türeyen bir alt sınıf.
class Circle extends Shape {
    // Üst sınıfın soyut metodunu uyguluyoruz.
    void draw() {
        System.out.println("Çember çiziliyor.");
    }
}

// Shape sınıfından türeyen bir başka alt sınıf.
class Square extends Shape {
    // Üst sınıfın soyut metodunu uyguluyoruz.
    void draw() {
        System.out.println("Kare çiziliyor.");
    }
}


class B extends A {
    public void print()
    {
        System.out.println("Class B's method is running");
    }

    // Driver Code
    public static void main(String[] args)
    {
        A a1 = new A();

        // method overloading (Compile-time polymorphism)
        a1.add(6, 5);

        // method overloading (Compile-time polymorphism)
        a1.add(1, 2, 3);

        B b1 = new B();

        // Method overriding (Run-time polymorphism) =signature same
        b1.print();


        // Shape tipinde bir dizi oluşturuyoruz.
        Shape[] shapes = new Shape[2];

        // Diziye farklı alt sınıf türünden nesneler ekliyoruz.
        shapes[0] = new Circle();
        shapes[1] = new Square();

        // Polimorfizmi kullanarak her şekli çiziyoruz.
        for (Shape shape : shapes) {
            shape.draw();
        }




    }
}


/*
Compile Time Polymorphism: Whenever an object is bound with its functionality at the compile time, this is known as the compile-time polymorphism. At compile-time, java knows which method to call by checking the method signatures. So this is called compile-time polymorphism or static or early binding. Compile-time polymorphism is achieved through method overloading. Method Overloading says you can have more than one function with the same name in one class having a different prototype. Function overloading is one of the ways to achieve polymorphism but it depends on technology and which type of polymorphism we adopt. In java, we achieve function overloading at compile-Time. The following is an example where compile-time polymorphism can be observed.
Run-Time Polymorphism: Whenever an object is bound with the functionality at run time, this is known as runtime polymorphism. The runtime polymorphism can be achieved by method overriding. Java virtual machine determines the proper method to call at the runtime, not at the compile time. It is also called dynamic or late binding. Method overriding says the child class has the same method as declared in the parent class. It means if the child class provides the specific implementation of the method that has been provided by one of its parent classes then it is known as method overriding. The following is an example where runtime polymorphism can be observed.

Compile Time Polymorphism	Run time Polymorphism
In Compile time Polymorphism, the call is resolved by the compiler.	In Run time Polymorphism, the call is not resolved by the compiler.
It is also known as Static binding, Early binding and overloading as well.	It is also known as Dynamic binding, Late binding and overriding as well.
Method overloading is the compile-time polymorphism where more than one methods share the same name with different parameters or signature and different return type.	Method overriding is the runtime polymorphism having the same method with same parameters or signature but associated withcompared, different classes.
It is achieved by function overloading and operator overloading.	It is achieved by virtual functions and pointers.
It provides fast execution because the method that needs to be executed is known early at the compile time.	It provides slow execution as compare to early binding because the method that needs to be executed is known at the runtime.
Compile time polymorphism is less flexible as all things execute at compile time.	Run time polymorphism is more flexible as all things execute at run time.
Inheritance is not involved. 	Inheritance is involved.




Polimorfizm iki temel şekilde gerçekleştirilebilir:

Ad Hoc Polimorfizm: Aynı fonksiyonun farklı veri tipleri için ayrı ayrı tanımlanmasıdır. Bu tür polimorfizm genellikle aşırı yükleme (overloading) ve şablonlar (templates) ile sağlanır.

Alt Sınıf Polimorfizmi (Soyut Sınıf Polimorfizmi): Bir üst sınıfın metodunun alt sınıflar tarafından farklı şekillerde uygulanmasıdır. Bu tür polimorfizm genellikle soyut sınıflar (abstract classes) ve arayüzler (interfaces) ile sağlanır.










 */