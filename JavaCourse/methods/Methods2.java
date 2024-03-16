package methods;
import java.util.*;

public class Methods2{
    public String name;
    public float age;
    //Constructor is a method
    public Methods2(String name,float _age){
          this.name=name;
          _age=age;
    }
    //Static Methods - no need to create object  , directly call these methods in main.
    static void ChangeManagement(){
        System.out.println("Bu bir static metodtur ve nesne oluşturmadan çağrılabilir.");
    }
    //Variable Arguments in a method :
    public static int topla(int... sayilar){ // istenilen kadar parametre gönderilebilir.
        int toplam=0;
        for (int i :sayilar){
            toplam+=i;
        }
        return toplam;
    }
    //Instance methods: bir sınıfın nesneleri tarafından çağrılan ve genellikle nesnenin durumunu değiştiren veya nesne üzerinde bir işlem gerçekleştiren metodlardır.
    public void start() {
        age=4;
        System.out.println(name + " isimli method çalıştırıldı.");
    }
    // Instance metodu: Metotu durdur
    public void stop() {
        age=5;
        System.out.println(name + " isimli metot durduruldu.");
    }




    public static void main(String[] args) {
        ChangeManagement(); // it is called without creating object
        int toplam2=topla(2,3,4,5);
        int toplam3=topla(1,2,67,88,99);

        Methods2 obj1=new Methods2("object1",15);
        obj1.start();

        Example obj2=new Example("Araba",13);
        obj2.displayMessage();
        // Class2 obj2=new Class2("Araba"); There is an error because of abstract class structure.
    }
}

abstract class Class2{ // abstract class initial variable ve constructor bulundurur ancak direkt olarak obje yaratılamaz, subclasslardan yaratılabilir.
    String name;

    // Constructor
    public Class2(String name) {
        this.name = name;
    }
    public abstract void displayMessage();
}

class Example extends Class2{
    int time;
    public Example(String name,int time){
        super(name);
        this.time=time;
    }
    // Abstract method implementation
    public void displayMessage() {
        System.out.println("Bu bir abstract metottur ve " + name + " tarafından uygulanmıştır.");
    }
}

