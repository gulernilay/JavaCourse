package Object_Oriented_Programming.keywords;
// An Enum class
import java.util.Scanner;
enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

public class Enum{
    Day day;

    // Constructor
    public Enum(Day day) { this.day = day; }

    // Prints a line about Day using switch
    public void dayIsLike()
    {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    // Driver method
    public static void main(String[] args)
    {
        String str = "MONDAY";
        Enum t1 = new Enum(Day.valueOf(str));
        t1.dayIsLike();
    }
}


/*
1- ) Enum  class dışında tanımlanabilri
2- ) enum Color {    enum içinde main metotu bulunabilri
    RED,
    GREEN,
    BLUE;

    // Driver method
    public static void main(String[] args)
    {
        Color c1 = Color.RED;
        System.out.println(c1);
    }
}

Java'da enum anahtar kelimesi, sabit değerler kümesini ifade etmek için kullanılır.
Bu sabitler, belirli bir sınıfa ait önceden tanımlanmış sabit nesneler olarak kabul edilir. enum kullanımı, kodun okunabilirliğini ve bakımını kolaylaştırır, ayrıca hataları azaltır çünkü sadece tanımlanmış değerler kullanılabilir.
 Enum and Inheritance
All enums implicitly extend java.lang.Enum class. As a class can only extend one parent in Java, an enum cannot extend anything else.
toString() method is overridden in java.lang.Enum class, which returns enum constant name.
enum can implement many interfaces.
Enum and Constructor
Enum can contain a constructor and it is executed separately for each enum constant at the time of the enum class loading.
We can’t create enum objects explicitly and hence we can’t invoke the enum constructor directly.
Enum and Methods
Enum can contain both concrete methods and abstract methods. If an enum class has an abstract method, then each instance of the enum class must implement it.



 */
