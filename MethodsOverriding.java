public class MethodsOverriding extends SuperClass { //child class
 public double price;
  
   public MethodsOverriding(String name,int age,double money,double price){ // sub class constructor 
    super(name,age,money); //inherited attributes 
    this.price=price;
   }
   @Override
   void show() {
       System.out.println("Child's show()");  //Method overriding 
  }
}

public class SuperClass{
  public String name;
  private int age;
  protected double money;

  public SuperClass(String name,int age,double money){
    this.name=name;
    this.age=age;
    this.money=money;
  }
  void show() {
       System.out.println("Parent's show()"); 
  }


}

/*
In Java, Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes. When a method in a subclass has the same name, the same parameters or signature, and the same return type(or sub-type) as a method in its super-class, then the method in the subclass is said to override the method in the super-class.
Method overriding is one of the ways by which Java achieves Run Time Polymorphism. The version of a method that is executed will be determined by the object that is used to invoke it. If an object of a parent class is used to invoke the method, then the version in the parent class will be executed, but if an object of the subclass is used to invoke the method, then the version in the child class will be executed. In other words, it is the type of the object being referred to (not the type of the reference variable) that determines which version of an overridden method will be executed.
Method overriding (metot ezme), bir alt sınıfın, üst sınıftan miras aldığı bir metodu kendi ihtiyaçlarına göre yeniden tanımlamasıdır. Overriding yapılan metod, üst sınıftaki metot ile aynı isme, dönüş tipine ve parametre listesine sahip olmalıdır. Overriding, polimorfizmin bir örneğidir ve çalışma zamanında (runtime) gerçekleşir.


*/


