
package Object_Oriented_Programming.abstraction;

public abstract class GameCalculator {

    public abstract void hesapla(); // her kullanıcı kendi puanını hesaplıycak, kendi classında implemente ediceksin

    public final void gameOver(){ // bütün kullanıcılarda aynı çıktı olsun -overwriding yapılamasın
        System.out.println("Oyun bitti");
    }
    public void show(int sayı){ // farklı kullanıcılarda farklı çıktı olsun -overwriding ile yapılabilir , diğer kullanımı da abstract class haline getirmek superclassı
        System.out.println("Puanınız :100");
    }



}
/*
Abstract class :
-Eğer bir sınıf bir inerface implemente ediyorsa ve tüm interface methodlarını override etmiyorsa, abstract olarak tanımlanır.
-Abstract classdan doğrudan obje tanımlanamaz
-Abstract class içerisinde instance variable , constructor ve methods yer alabilir.
-Abstract class içerisinde yer alan tüm methodlar abstract olucak diye bir durum yoktur.
-Başka bir class , abstract classı extend ederek  obje yaratabilir ve abstract class methodlarını kullanabilir.
-Abstract sınıflar, hem tamamlanmış (concrete) metodlar hem de tamamlanmamış (abstract) metodlar içerebilir.
-Eğer bir sınıf en az bir abstract metod içeriyorsa, o sınıf mutlaka abstract olarak tanımlanmalıdır.
-bir sınıf sadece bir abstract sınıfı inheirt edebilir



Abstract Methods:
-Abstract metodlar, türetilen alt sınıflar tarafından uygulanmak (override) zorundadır.
-Sadece method signature içerirler, body kısmı alt sınıflarda tanımlanır.
-Abstract metodlar, yalnızca abstract sınıflar içinde tanımlanabilir.
-Abstract metodların amacı, alt sınıflara belirli bir işlevselliği uygulama zorunluluğu getirmektir.


!!abstract olarak tanımlanan variable olamaz.
 */
