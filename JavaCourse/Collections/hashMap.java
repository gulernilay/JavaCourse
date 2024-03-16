package Collections;
import java.util.HashMap;
public class hashMap {
    public static void main(String[] args) {
        HashMap<String,String> sözlük= new HashMap<String,String>();
        sözlük.put("book","kitap"); // book :key , kitap: value
        sözlük.put("table","masa");
        sözlük.put("computer","bilgisayar");
        System.out.println(sözlük);
        sözlük.remove("table"); // sonuç olarak değerine null atanır
        sözlük.clear();
        sözlük.size(); // 3 eleman var ilk başta
        sözlük.keySet();// keyleri array olarak vericek
        sözlük.get("book"); // book değeri basılır


    }
}
/*
Hashmap:
Java'da HashMap, anahtar-değer çiftlerini saklamak için kullanılan bir sınıftır. Bu sınıf, key-value (anahtar-değer) ilişkisini temsil eden verileri depolamak ve hızlı bir şekilde erişmek için kullanılır. HashMap, Java Collections Framework'ün bir parçasıdır ve java.util paketinde yer alır.
HashMap'in temel özellikleri şunlardır:

Anahtar-değer çiftleri: HashMap, her bir anahtar-değer çiftini saklar. Anahtarlar benzersiz olmalıdır, yani her anahtar sadece bir kez kullanılabilir. Değerler ise tekrarlanabilir olabilir.

Null değerler: HashMap, hem anahtar hem de değer olarak null değerlerini kabul eder. Yani null bir anahtar veya null bir değer HashMap içinde saklanabilir.

Sıralama: HashMap, elemanları ekleme sırasına göre saklamaz. Elemanlar, hashCode() yöntemine dayalı olarak sıralanır ve bu nedenle ekleme sırasına bağlı olarak değişebilir.

Hızlı erişim: HashMap, hash tablosu veri yapısını kullanarak elemanlara hızlı bir şekilde erişim sağlar. Bu nedenle, büyük miktarda veri üzerinde etkili bir performans sergiler.
 */
