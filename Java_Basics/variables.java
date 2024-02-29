int age=20 ; // variable initialization
/*
Types of Variables in Java : 
Local Variables : The scope of these variables exists only within the block ,These variables are created when the block is entered, or the function is called , initialization of local variable is mandatory and not need to ue access modifiers.

Instance Variables : As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed. / use acce specifiers / initialization is not mandatory / Its default value is dependent on the data type of variable. For String it is null, for float it is 0.0f, for int it is 0  /Instance variables can be accessed only by creating objects. 

Static Variables :declared using the static keyword within a class outside of any method, constructor, or block./Eğer CLASS veya constructor private ise kullanılır / we can only have one copy of a static variable per class, irrespective of how many objects we create. / 
Java'da static değişkenler, bir sınıfa ait olan ve o sınıfın tüm nesneleri tarafından paylaşılan değişkenlerdir. static değişkenler, sınıf düzeyinde tanımlanır ve bu yüzden nesne düzeyinde değil, sınıf düzeyinde bellekte yer kaplarlar. Bir static değişkenin değeri, sınıfın tüm nesneleri arasında ortaktır ve bir nesne tarafından yapılan herhangi bir değişiklik, diğer tüm nesneler tarafından görülebilir.
Neden Kullanılır?
Hafıza Tasarrufu: Her nesne için ayrı bir kopya oluşturmak yerine, static değişkenler tüm nesneler arasında paylaşılır, bu da bellek kullanımını azaltır.
Sınıf Düzeyinde Bilgi Paylaşımı: static değişkenler, sınıfın tüm nesneleri arasında ortak bilgileri saklamak ve paylaşmak için kullanılır.
obje yaratmana gerek kalmıyor.
*/

//Local Variable: 
class GFG {
    public static void main(String[] args)
    {
        // Declared a Local Variable
        int var = 10;
 
        // This variable is local to this main method only
        System.out.println("Local Variable: " + var);
    }
}

//Instance Variable:
class GFG {

    // Declared Instance Variable
    public String geek;
    public int i;
    public Integer I;
    public GFG()
    {
        // Default Constructor
        // initializing Instance Variable
        this.geek = "Shubham Jain";
    }
 
    // Main Method
    public static void main(String[] args)
    {
        // Object Creation
        GFG name = new GFG();
 
        // Displaying O/P
        System.out.println("Geek name is: " + name.geek);
        System.out.println("Default value for int is "
                           + name.i); //0
       
        // toString() called internally
        System.out.println("Default value for Integer is "
                           + name.I); // null 
    }
}


// Static Variables :  1-Mainde ağırabilmek için , 1-tüm objeler için aynı değere ahip bir attribute, 

//static methodlar ancak mainde bir obje üzerinden çağırılabilirler. :  obj1.method1();
import java.io.*;
 
class GFG {
    // Declared static variable
    public static String geek = "Shubham Jain";
   
    public static void main(String[] args)
    {
 
        // geek variable can be accessed without object
        // creation Displaying O/P GFG.geek --> using the
        // static variable
        System.out.println("Geek Name is : " + GFG.geek);
 
        // static int c=0;
        // above line,when uncommented,
        // will throw an error as static variables cannot be
        // declared locally.
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
*/


//Local Variables:
public class Test
{
    void method1() 
    {
       // Local variable (Method level scope)
       int x;
    }
}

//Loop Variable: 
class Test
{
    public static void main(String args[])
    {
        int x;
        for (x = 0; x < 4; x++)
        {
            System.out.println(x);
        }
 
       System.out.println(x);
    }
}



