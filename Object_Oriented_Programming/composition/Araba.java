package Object_Oriented_Programming.composition;
class Motor {
    private int guc;

    Motor(int guc) {
        this.guc = guc;
    }

    public int getGuc() {
        return guc;
    }
}
public class Araba {// araba has a motor

    private String marka;
    private Motor motor;  // Araba sınıfı, Motor sınıfının bir örneğini içerir (Composition)

    Araba(String marka, int motorGucu) {
        this.marka = marka;
        this.motor = new Motor(motorGucu);
    }

    public void bilgileriGoster() {
        System.out.println("Marka: " + marka);
        System.out.println("Motor Gücü: " + motor.getGuc() + " beygir");
    }

    // Ana sınıf
    public class Main {
        public static void main(String[] args) {
            Araba araba = new Araba("Toyota", 120);
            araba.bilgileriGoster();
        }
    }
}


/*
Composition=  Has- a relationship , Composition, bir sınıfın başka sınıfların özelliklerini ve davranışlarını kendi içine entegre etmesini sağlar.
Bu örnekte, Araba sınıfı Motor sınıfının bir örneğini içerir. Bu, bir arabanın bir motoru olduğunu ("has-a" ilişkisi) ifade eder. Araba sınıfı, Motor sınıfının özelliklerine ve metodlarına kendi metodları aracılığıyla erişebilir. Bu, kodun yeniden kullanılabilirliğini ve modülerliğini artırır.
Alışveriş Merkezi - mağazalar : mağazalar alışveriş merkezi olmadan varolamaz.
is-a ilişkisi, bir sınıfın başka bir sınıfın alt türü olduğunu ifade eder
has-a ilişkisi, bir sınıfın başka bir sınıfın örneğini içermesi anlamına gelir.


 */
