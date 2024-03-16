package methods;
// Method signature is same,just change method body(same name, the same parameters or signature, and the same return type(or sub-type))
//Run Time Polymorphism.
//method that is executed will be determined by the object that is used to invoke it. If an object of a parent class is used to invoke the method, then the version in the parent class will be executed, but if an object of the subclass is used to invoke the method, then the version in the child class will be executed.
//Method overriding (metot ezme), bir alt sınıfın, üst sınıftan miras aldığı bir metodu kendi ihtiyaçlarına göre yeniden tanımlamasıdır.

public class MethodsOverriding extends SuperClass{
    public int telNumber;

    public MethodsOverriding(String name,int age,double money,int telNumber){
        super(name,age,money);
        this.telNumber= telNumber;
    }
    void show(){ //Overriding
        System.out.println("Child's show()");
    }
    public static void main(String[] args) {
        MethodsOverriding ob1=new MethodsOverriding("dfjdkfj",12,4.0,5843);

    }
 }

class SuperClass{
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
