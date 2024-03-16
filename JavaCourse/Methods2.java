
/*

abstract class AbstractMethods {
    // Abstract metodu: Bu metodun gövdesi alt sınıflarda tanımlanmalıdır
    public abstract void displayMessage();
}

public class Methods extends AbstractMethods {
    String name;
    int time;

    //Instance methods: bir sınıfın nesneleri tarafından çağrılan ve genellikle nesnenin durumunu değiştiren veya nesne üzerinde bir işlem gerçekleştiren metodlardır.
    public void start() {
        time = 4;
        System.out.println(name + " isimli method çalıştırıldı.");
    }

    // Instance metodu: Metotu durdur
    public void stop() {
        time = 5;
        System.out.println(name + " isimli metot durduruldu.");
    }

    //Constructor
    public Methods(String name, int time) {
        this.name = name;
        this.time = time;
    }

    //Static Methods
    static void ChangeManagement() {
        System.out.println("Bu bir static metodtur ve nesne oluşturmadan çağrılabilir.");
    }

    // Abstract method implementation
    public void displayMessage() {
        System.out.println("Bu bir abstract metottur ve " + name + " tarafından uygulanmıştır.");
    }


    public static void main(String[] args) {
        Methods m1 = new Methods("Metot1", 4);
        m1.start();
        m1.stop();
        //Static Methods çağrılması:
        ChangeManagement();
        Methods.ChangeManagement();
        int result = topla(2, 4, 5, 6, 7, 7);
        System.out.println(result);
    }

    //Variable Arguments: 
    public static int topla(int... sayilar) { // istenilen kadar parametre gönderilebilir.
        int toplam = 0;
        for (int i : sayilar) {
            toplam += i;
        }
        return toplam;
    }
}

*/