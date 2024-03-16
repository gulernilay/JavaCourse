package Object_Oriented_Programming.Constructor;

public class TypesOfConstructor {
    String name;
    int age;

    TypesOfConstructor() {
    } // No parameters - default constructor type

    TypesOfConstructor(String name, int age) {  // With parameters
        this.name = name;
        this.age = age;
    }

    TypesOfConstructor(TypesOfConstructor t1) { //Copy Constructor
        this.age = t1.age;
        this.name = t1.name;
    }


    public void bilgileriYazdir() {
        System.out.println("İsim: " + name + ", Yaş: " + age);
    }
    public static void main(String[] args) {
        TypesOfConstructor kisi1 = new TypesOfConstructor("Ahmet", 25); // With parameters
        TypesOfConstructor kisi2 = new TypesOfConstructor(kisi1); // Copy constructor

        kisi1.bilgileriYazdir();
        kisi2.bilgileriYazdir();
    }

}




