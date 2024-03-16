package Object_Oriented_Programming.keywords;

public class Super {
}
// Base class vehicle
class Vehicle {
    int maxSpeed = 120;
    void message() {
        System.out.println("This is vehicle class\n");
    }
    Vehicle(){
        System.out.println("Person class Constructor");
    }

}

// sub class Car extending vehicle
class Car extends Vehicle {
    int maxSpeed = 180;
    void display() {
        System.out.println("Maximum Speed: " + super.maxSpeed);  // super with variable
    }
    void message()
    {
        System.out.println("This is car class");
    }
    void display2() // super keyword with methods
    {
        message(); // Class car 's message method
        super.message(); // Parent class's message method
    }
    Car() {  // super keyword with constructor
        super(); //call parent class constructor
        System.out.println("Student class Constructor"); }

}

class Test {
    public static void main(String[] args) {
        Car small = new Car();
        small.display(); // 120 basılacak
    }
}

