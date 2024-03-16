package Object_Oriented_Programming.abstraction;



public class Main2  {  //Driver Class
    public static void main(String[] args) {
         Teacher t1=new Teacher("FKLJ",4,"yILMAZER");
         t1.printInfo();
         t1.sayBye();
         t1.sayHello();


    }

}


abstract class Person implements Student{
    String name; //instance variables
    int age;
    abstract void printInfo(); // abstract method

    Person(String name,int age){ // abstract classes can have constructor
        this.name=name;
        this.age=age;
    }
    void sayHello(){
        System.out.println("Merhabalar"); // concrete method
    }
    @Override
    public void sayBye(){   // abstract classes can implements interface
        System.out.println("Bye");
    }

}
interface Student{
     void sayBye();
}

class Teacher extends Person{
    String school;
    Teacher(String name,int age,String school){
        super(name,age);
        this.school=school;
    }

    @Override
    void printInfo() {
        System.out.println("The name :" +name +" age: "+ age + "working on :" +school);
    }

    @Override
    void sayHello() {
        super.sayHello();
        System.out.println("Metota eklenebilirler");
    }

    @Override
    public void sayBye() {
        super.sayBye();
        System.out.println("Metota eklenebilirler22222");
    }
}











/*
abstract keyword is a non-access modifier , applicable for classes and methods ,not variables
abstract classes can't be instantiated direclty ,only subclass which extends abstract class can create objects
abstract methods doesn't have a body , only signature.Subclasses of an abstract class must provide a concrete implementation of all abstract methods
Abstract classes can have both abstract (only signature) and concrete methods(signature +body)
abstract classes has constructors for their concrete subclasses
Abstract classes can contain instance variables, subclasses can access these instance variables
abstract classes can implement interfaces ,the abstract class must provide concrete implementations of all methods defined in the interface.

abstract methods: no implementation in super-class , subclass must override them
!any class hat contains abstract methods shoul be abstract class
 -abstract static, abstract private ......


abstract classes can creatable without abstract methods
final abstract method olamaz
statik methodlar abstract class içinde tanımlanabilir.

Elements abstract class can have data member,abstract method,method body , constructor, main() method

final keyword: prevents overriding
 */
