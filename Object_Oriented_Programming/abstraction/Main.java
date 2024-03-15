package Object_Oriented_Programming.abstraction;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // "Bark" çıktısını verir
        myDog.sleep();     // "Zzz" çıktısını verir
        Cat myCat = new Cat();
        myCat.makeSound(); // "Meow" çıktısını verir
        myCat.sleep();     // "Zzz" çıktısını veri
    }
}
abstract class Animal{
    abstract void makeSound(); // Soyut metod ,gövdesi yok
    void sleep() {
        System.out.println("Zzz");
    }
}
class Dog extends Animal{
    // Soyut metodun somutlaştırılması
    void makeSound() {
        System.out.println("Bark");
    }

    @Override
    void sleep() {
        super.sleep();
    }
}
class Cat extends Animal {
    // Soyut metodun somutlaştırılması
    void makeSound() {
        System.out.println("Meow");
    }

    @Override
    void sleep() {
        super.sleep();
    }
}











/*
Data Abstraction is the property by virtue of which only the essential details are displayed to the user.
The trivial or the non-essential units are not displayed to the user. Ex: A car is viewed as a car rather than its individual components.
Data Abstraction may also be defined as the process of identifying only the required characteristics of an object ignoring the irrelevant details.
 The properties and behaviors of an object differentiate it from other objects of similar type and also help in classifying/grouping the objects.


Abstract class: Nesne oluşturulamayan sınıfdır. Doğrudan nesne oluşturulamaz. Soyut sınıflar, alt sınıfların ortak özelliklerini ve davranışlarını tanımlamak için kullanılır.Soyut sınıflar, soyut metodlar içerebilir veya içermeyebilir.

Abstract Methods: Gövdesi yoktur. Metodun nasıl çalıştığını tanımlamazlar , sadece imza(ad ,parametre ,dönüş tipi) tanımlarlar.
Soyut bir sınıfın alt sınıfı, soyut metodları mutlaka somutlaştırmalı (override) ve metodun gövdesini tanımlamalıdır.

----------------------------------------------------------
Kullanılma Senaryoları :
Ortak Arayüz Tanımlama:

Farklı sınıfların ortak bir arayüzü paylaşmasını sağlamak için soyut sınıflar ve metodlar kullanılabilir. Bu, farklı sınıfların aynı metod imzalarını kullanarak farklı işlemler gerçekleştirmesine olanak tanır.
Örneğin, bir oyun içinde farklı türde karakterler için Character adında bir soyut sınıf tanımlayabilir ve bu sınıf içinde attack, defend gibi soyut metodlar oluşturabilirsiniz. Her karakter sınıfı bu metodları kendi özelliklerine göre somutlaştırır.
Sistem Genişletilebilirliği:

Soyut sınıflar, sistemin genişletilebilirliğini artırır. Yeni sınıflar eklemek veya mevcut sınıfları değiştirmek, soyut sınıflara bağlı olan diğer sınıfları etkilemez.
Örneğin, bir veritabanı uygulamasında DatabaseConnection adında bir soyut sınıf oluşturabilir ve bu sınıftan türeyen MySQLConnection, SQLiteConnection gibi alt sınıflar oluşturabilirsiniz. Uygulamanıza yeni bir veritabanı desteği eklemek istediğinizde, sadece yeni bir alt sınıf eklemeniz yeterlidir.
Kodun Yeniden Kullanılabilirliği:

Soyut sınıflar, kodun yeniden kullanılabilirliğini artırır. Ortak özellikler ve davranışlar soyut sınıflarda tanımlanır ve alt sınıflar bu özellikleri ve davranışları miras alır.
Örneğin, bir araç kiralama sisteminde Vehicle adında bir soyut sınıf oluşturabilir ve bu sınıfta rent, returnVehicle gibi metodlar tanımlayabilirsiniz. Car, Truck, Bike gibi alt sınıflar bu metodları somutlaştırır.
Gizleme ve Güvenlik:

Soyutlama, uygulamanın iç yapısını gizleyerek güvenliği artırabilir. Kullanıcılar, sınıfların nasıl çalıştığını bilmek zorunda kalmadan sadece dış arayüzlerini kullanır.
Örneğin, bir ödeme sisteminde PaymentProcessor adında bir soyut sınıf oluşturabilir ve bu sınıfta ödeme işlemlerini gerçekleştiren soyut metodlar tanımlayabilirsiniz. Alt sınıflar bu metodları somutlaştırarak farklı ödeme yöntemlerini (kredi kartı, banka havalesi, PayPal vb.) destekler.


-----------------------------------------------------




 Abstraction vs Encapsulation :
Abstraction is the process or method of gaining the information.
While encapsulation is the process or method to contain the information.

In abstraction, problems are solved at the design or interface level.
While in encapsulation, problems are solved at the implementation level.

Abstraction is the method of hiding the unwanted information.
Whereas encapsulation is a method to hide the data in a single entity or unit along with a method to protect information from outside.

We can implement abstraction using abstract class and interfaces.
Whereas encapsulation can be implemented using by access modifier i.e. private, protected and public.

In abstraction, implementation complexities are hidden using abstract classes and interfaces.
While in encapsulation, the data is hidden using methods of getters and setters.

The objects that help to perform abstraction are encapsulated.
Whereas the objects that result in encapsulation need not be abstracted.

Abstraction provides access to specific part of data.
Encapsulation hides data and the user can not access same directly (data hiding.

Abstraction focus is on “what” should be done.
Encapsulation focus is on “How” it should be done.





 */
