package Generics;
import java.util.List;
import java.util.ArrayList;

public class AlisverisSepeti<T>{
    private List<T> urunler;

    public AlisverisSepeti() {

        urunler = new ArrayList<>();
    }

    public void urunEkle(T urun) {

        urunler.add(urun);
    }
    public void remove(T urun){
        urunler.remove(urun);
    }

    public void urunleriListele() {
        for (T urun : urunler) {
            System.out.println(urun.toString());
        }
    }

}
/*
Yukarıdaki örnek, AlisverisSepeti sınıfını generik bir sınıf olarak tanımlar.
Bu sınıf, farklı türlerde ürünleri urunler listesinde tutar.
urunEkle metodu, alışveriş sepetine yeni bir ürün eklerken, urunleriListele metodu da sepetteki ürünleri listelerken generik türü kullanır.
"AlisverisSepeti" adında bir generics sınıfı oluşturduk ve sınıfın tür parametresi olan "T" yi tanımladık. Bu, sınıfın farklı türde ürünleri depolayabilmesini sağlar.

"urunEkle" yöntemi, belirtilen türde bir ürünü sepete ekler. "getUrunler" yöntemi, sepetin içindeki tüm ürünleri bir List olarak döndürür.

Main metodu içinde, "AlisverisSepeti" sınıfını String türüyle örneklendiririz. Daha sonra sepete bazı ürünler ekleriz ve sepetin içindeki ürünleri döngü kullanarak ekrana yazdırırız.
Bu örnekte generics kullanarak, alışveriş sepeti sınıfımızın tür güvenliği sağlanır ve sepete yanlışlıkla farklı bir türde bir ürün eklemek gibi hataların önüne geçilir.





 */