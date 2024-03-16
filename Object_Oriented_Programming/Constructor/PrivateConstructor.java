package Object_Oriented_Programming.Constructor;

public class PrivateConstructor {  //Singleton Pattern + bir sınıfın dışarıdan direk örneklendirilmesini engeller.
    double width, height, depth;
    int boxNo;

    private PrivateConstructor(double width,double height,double depth,int boxNo){
        this.width=width;
        this.height=height;
        this.depth=depth;
        this.boxNo=boxNo;
    }
}


/* Private Constructors extends edilemezler .
public class Subclass extends PrivateConstructor{
    String name;
    public static void main(String[] args) {
          Subclass s1=new Subclass();

    }
}

*/














/*
There are various scenarios where we can use private constructors. The major ones are

Internal Constructor chaining
Singleton class design pattern :bir sınıftan yalnızca bir örnek oluşturulmasını sağlamak için kullanılır.
Java'da private constructor'lar, bir sınıfın dışarıdan doğrudan örneklenmesini engellemek için kullanılır.


Private constructor, bu sınıfın dışarıdan yeni örneklerinin oluşturulmasını engeller ve genellikle bir getInstance() metoduna sahip olur.Bu metot, sınıfın tek örneğini döndürür.


Usage Scenarios:
1-Singleton Pattern
public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {} // Private constructor

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}


2-Utility Sınıfları :
public class MathUtils {
    private MathUtils() {} // Private constructor

    public static int add(int a, int b) {
        return a + b;
    }
}


3-) Factory Method Sınıfları  :
public class ShapeFactory {
    private ShapeFactory() {} // Private constructor

    public static Shape createCircle() {
        return new Circle();
    }

    public static Shape createSquare() {
        return new Square();
    }
}


4-) Sınıfın Yanlışlıkla Örneklenmesini Önleme:
public class Constants {
    public static final String APP_NAME = "MyApp";
    public static final int VERSION = 1;

    private Constants() {} // Private constructor to prevent instantiation
}







 */




