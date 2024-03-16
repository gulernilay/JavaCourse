package Java_Basics;



public class VariablesImplementation{
    //Instance Variables
    private String name; // default value: null
    public int age;// default value: 0
    protected float favnumber; // default value: 0.0f


    public static void main(String[] args) {
        int age=20 ; // variable initialization

        // Types of variables:
              //1.Local Variables:The scope of these variables exists only within the block ,These variables are created when the block is entered, or the function is called , initialization of local variable is mandatory and not need to ue access modifiers.
              int result=localVar();
              //2.Instance Variables: As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed. / use acce specifiers / initialization is not mandatory / Its default value is dependent on the data type of variable. For String it is null, for float it is 0.0f, for int it is 0  /Instance variables can be accessed only by creating objects.
              //3.Static Variables: Bir methodu mainde çağırabilmek için kullanılır/We can only have one copy of a static variable per class, irrespective of how many objects we create./Bir sınıfa ait olan ve o sınıfın tüm nesneleri tarafından paylaşılan değişkenlerdir.  Bir static değişkenin değeri, sınıfın tüm nesneleri arasında ortaktır ve bir nesne tarafından yapılan herhangi bir değişiklik, diğer tüm nesneler tarafından görülebilir.Static değişkenler, sınıf düzeyinde tanımlanır ve bu yüzden nesne düzeyinde değil, sınıf düzeyinde bellekte yer kaplarlar.Obje yratmana gerek kalmadan metotları mainde çağırabilirsin.
    }
    public static int localVar(){
        int a=15; //local variables, accessible only within this method
        return a;
    }
}

class GFG {
    // Declared static variable
    public static String geek = "Shubham Jain";
   
    public static void main(String[] args) {
 
        // geek variable can be accessed without object
        System.out.println("Geek Name is : " + GFG.geek);
 
        // static int c=0; will throw an error as static variables cannot be declared locally.
    }
}

class Counter {
    static int count = 0;  // static değişken
    Counter() {
        count++;  // Her nesne oluşturulduğunda count artar
        System.out.println(count);
    }

    public static void main(String args[]) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}

/*
SCOPE OF VARIABLES:part of the program where the variable is accessible.

1- Class variable: declare class variables anywhere in class, but outside methods. /Access specified of member variables doesn’t affect scope of them within a class. / 
Modifier      Package  Subclass  World

public          Yes      Yes     Yes

protected       Yes      Yes     No   // accessible within 

Default (no
modifier)       Yes       No     No

private         No        No     No   // accessible within class 


2- Local Variables (Method Level Scope) : 
Variables declared inside a method have method level scope and can’t be accessed outside the method. 


3-Loop Variable: A variable declared inside pair of brackets “{” and “}” in a method has scope within the brackets only.
        for (int x = 0; x < 4; x++){
            System.out.println(x);
        }
*/