package Object_Oriented_Programming.ClassesObjects;

public class Main {
}

/*
Class:Classes: A class is a user defined blueprint or prototype from which objects are created. It represents the set of properties or methods
Classes are required in OOPs because:
-It provides template for creating objects,
-It has definitions of methods and data
-It supports inheritance property of Object Oriented Programming and hence can maintain class hierarchy.
-It helps in maintaining the access specifications of member variables.


Object:it represents the real life entities. ( has 2 characteristics: identity=name, attributes=state, methods=functions=behaviour=)
Objects are required in OOPs because they can be created to call a non-static function which are not present inside the Main Method but present inside the Class and also provide the name to the space which is being used to store the data.
Declaring a object : When an object of a class is created, the class is said to be instantiated. All the instances share the attributes and the behavior of the class. But the values of those attributes, i.e. the state are unique for each object.
Initializing an Object using new : The new operator instantiates a class by allocating memory for a new object and returning a reference to that memory. The new operator also invokes the class constructor.


 Dog tuffy = new Dog("tuffy", "papillon", 5, "white");    Tuffy 100.adrese koyuldu , name / breed / age / color da 100.adrese kour
 All classes have at least one constructor. If a class does not explicitly declare any, the Java compiler automatically provides a no-argument constructor, also called the default constructor.

 Creating objects:
 -using new : ClassName ReferenceVariable = new ClassName();
 -Using Class.newInstance() method::
class Kalem {
    String renk;
    Kalem() {
        this.renk = "Mavi";
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("Kalem");
            Kalem kalem = (Kalem) c.newInstance();
            System.out.println("Renk: " + kalem.renk);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

 -newInstance() method for Constructor class:
Constructor constructor = ClassName.class.getConstructor();
ClassName ReferenceVariable = constructor.newInstance();
 -Using clone() method: ClassName ReferenceVariable = (ClassName) ReferenceVariable.clone();
class Telefon implements Cloneable {
    String model;
    Telefon(String model) {
        this.model = model;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Telefon telefon1 = new Telefon("iPhone");
            Telefon telefon2 = (Telefon) telefon1.clone();
            System.out.println("Telefon 1 Model: " + telefon1.model);
            System.out.println("Telefon 2 Model: " + telefon2.model);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

-----------------------------------------------------------------------------------------------------------------------
Object Class :  Java'da Object sınıfı, Java'nın sınıf hiyerarşisinin en üstündeki sınıftır. Tüm Java sınıfları doğrudan veya dolaylı olarak Object sınıfından türetilir. Bu nedenle, Object sınıfı tüm Java sınıflarının ortak temelidir ve tüm nesnelerin temel davranışlarını tanımlar.

Object sınıfı, Java'nın java.lang paketinde bulunur ve birçok temel metot içerir. Bu metotlar arasında equals(), hashCode(), toString(), clone(), getClass(), notify(), notifyAll() ve wait() gibi metotlar bulunur. Bu metotlar, Java'daki tüm nesnelerin ortak davranışlarını tanımlar ve gerektiğinde sınıflar tarafından geçersiz kılınabilir (override edilebilir).
class Araba {
    String marka;
    int yil;

    Araba(String marka, int yil) {
        this.marka = marka;
        this.yil = yil;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "marka='" + marka + '\'' +
                ", yil=" + yil +
                '}';
    }

    public static void main(String[] args) {
        Araba araba = new Araba("Toyota", 2020);
        System.out.println(araba.toString());  // Araba{marka='Toyota', yil=2020}
        System.out.println(araba);  // Araba{marka='Toyota', yil=2020} (toString() otomatik olarak çağrılır)
    }
}


equals(Object obj):

Bir nesnenin başka bir nesneyle eşit olup olmadığını belirler.
Genellikle, iki nesnenin aynı veriye sahip olup olmadığını kontrol etmek için geçersiz kılınır (override).
Örnek: nesne1.equals(nesne2) iki nesnenin eşit olup olmadığını kontrol eder.
hashCode():

Bir nesnenin bellekteki adresini temsil eden bir tamsayı değeri döndürür.
equals() metodu ile birlikte kullanıldığında, eşit nesnelerin aynı hash koduna sahip olması beklenir.
Örnek: nesne.hashCode() nesnenin hash kodunu döndürür.
toString():

Bir nesnenin dize (string) temsilini döndürür.
Genellikle, nesnenin içeriğini anlamlı bir dize olarak göstermek için geçersiz kılınır.
Örnek: nesne.toString() nesnenin dize temsilini döndürür.
clone():

Bir nesnenin kopyasını oluşturur.
Nesnenin sınıfı Cloneable arayüzünü uygulamalıdır; aksi takdirde CloneNotSupportedException fırlatılır.
Örnek: nesne.clone() nesnenin bir kopyasını döndürür.
getClass():

Bir nesnenin çalışma zamanı sınıfını döndürür.
Döndürülen Class nesnesi, nesnenin türü hakkında bilgi sağlar.
Örnek: nesne.getClass() nesnenin sınıfını döndürür.
notify():

Bir nesne üzerinde bekleyen tek bir thread'i uyandırır.
Nesne üzerindeki synchronized bloğunda kullanılır.
Örnek: nesne.notify() nesne üzerinde bekleyen bir thread'i uyandırır.
notifyAll():

Bir nesne üzerinde bekleyen tüm thread'leri uyandırır.
Nesne üzerindeki synchronized bloğunda kullanılır.
Örnek: nesne.notifyAll() nesne üzerinde bekleyen tüm thread'leri uyandırır.
wait():

Bir thread'in nesne üzerindeki synchronized bloğunda beklemesine neden olur.
notify() veya notifyAll() metodu tarafından uyandırılana kadar thread bekler.
Örnek: nesne.wait() thread'in nesne üzerinde beklemesine neden olur.




Inner Classes : Java'da iç sınıflar (inner classes), bir sınıfın içinde tanımlanan sınıflardır.
İç sınıflar, gruplama ve kodun okunabilirliğini artırmak için kullanılır.
-Nested Inner Class (İç İçe Geçmiş İç Sınıf):Bir sınıfın içinde tanımlanan ve başka bir sınıfa ait olan sınıftır.
Dış sınıfın özel üyelerine erişebilir.
class DisSinif {
    class IcSinif {
        void goster() {
            System.out.println("İç içe geçmiş iç sınıf");
        }
    }
}


Method Local Inner Classes (Metot Yerel İç Sınıflar):Bir metot içinde tanımlanan iç sınıflardır.
Yalnızca tanımlandıkları metot içinde kullanılabilirler.

class DisSinif {
    void disMetot() {
        class YerelIcSinif {
            void goster() {
                System.out.println("Metot yerel iç sınıf");
            }
        }
        YerelIcSinif ic = new YerelIcSinif();
        ic.goster();
    }
}


Static Nested Classes (Statik İç İçe Geçmiş Sınıflar): Bir sınıfın içinde tanımlanan ve static anahtar kelimesiyle işaretlenen sınıflardır.
Dış sınıfın örnek üyelerine doğrudan erişemezler, ancak statik üyelere erişebilirler.

class DisSinif {
    static class StatikIcSinif {
        void goster() {
            System.out.println("Statik iç içe geçmiş sınıf");
        }
    }
}

Anonymous Inner Classes (Anonim İç Sınıflar):İsmi olmayan iç sınıflardır.
Genellikle, arayüzleri veya soyut sınıfları uygulamak için kullanılırlar.

interface Mesaj {
    void gosterMesaj();
}

class DisSinif {
    void disMetot() {
        Mesaj mesaj = new Mesaj() {
            @Override
            public void gosterMesaj() {
                System.out.println("Anonim iç sınıf");
            }
        };
        mesaj.gosterMesaj();
    }
}








 */
