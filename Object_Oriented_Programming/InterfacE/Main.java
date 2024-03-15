package Object_Oriented_Programming.InterfacE;

interface Animal {
    void eat();
    void sleep();
}

abstract class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }
     // arayüzde belirtilen tüm fonksiyonlar için yöntem gövdeleri sağlamazsa, o sınıf soyut (abstract) olarak tanımlanmalıdır.
    // sleep() metodunu uygulamadık, bu yüzden Dog sınıfı soyut olmalıdır.
}

class Labrador extends Dog {
    public void sleep() {
        System.out.println("Labrador is sleeping");
    }

    // Labrador sınıfı, Dog sınıfından türetilmiştir ve eksik olan sleep() metodunu uygulamıştır, bu yüzden abstract değildir.
}

public class Main {
    public static void main(String[] args) {
        Labrador myLabrador = new Labrador();
        myLabrador.eat();
        myLabrador.sleep();


        // create anonymous inner class object
        new Thread(new Runnable() {  // Runnable interface= functional interface
            @Override public void run()
            {
                System.out.println("New thread created");
            }
        }).start();

        // lambda expression to create the object = functional interface
        new Thread(() -> {
            System.out.println("New thread created");
        }).start();



        int a = 5;
        // lambda expression to define the calculate method
        Square s = (int x) -> x * x;
        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = s.calculate(a);
        System.out.println(ans);

    }
    @FunctionalInterface
    interface Square {
        int calculate(int x);
    }

}

/*
An Interface cannot be instantiated i.e. objects cannot be created.
The interface supports multiple inheritance. / Classes don't support multipe inheritance
Class  can be inherited from another class. Interface  cannot inherit a class.
Classes can be inherited by another class using the keyword ‘extends’. / Interfaces can be inherited by a class by using the keyword ‘implements’ and it can be inherited by an interface using the keyword ‘extends’
Interfaces cannot contain constructors  , contain abstract methods only / no private variables or methods / all variables are static and final
an interface can have methods and variables, but the methods declared in the interface are by default abstract (only method signature, nobody).
Interfaces specify what a class must do and not how. It is the blueprint of the class
If a class implements an interface and does not provide method bodies for all functions specified in the interface, then the class must be declared abstract.

Class B implements interface C == multiple inheritance is not supported by classes.
interface C extends interface a ,interface D ==multiple inheritance is supported bw interfaces

A functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit.Runnable, ActionListener, and Comparable are some of the examples of functional interfaces.
In Functional interfaces, there is no need to use the abstract keyword as it is optional to use the abstract keyword because, by default, the method defined inside the interface is abstract only. We can also call Lambda expressions as the instance of functional interface.
Runnable –> This interface only contains the run() method.
Comparable –> This interface only contains the compareTo() method.
ActionListener –> This interface only contains the actionPerformed() method.
Callable –> This interface only contains the call() method.
 */
