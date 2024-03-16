package Generics;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();
        AlisverisSepeti<String>ÜRÜNLER=new AlisverisSepeti<>();
        ÜRÜNLER.urunEkle("meyve");

        AlisverisSepeti<Customer>liste2=new AlisverisSepeti<Customer>();
        liste2.urunEkle(new Customer());
    }
}
/*
Generics (Jenerikler), Java programlama dilinde, sınıf, arayüz ve metodlar için tür parametreleri kullanmayı sağlayan bir özelliktir.
Generics, kodun daha tip güvenli ve yeniden kullanılabilir olmasını sağlar.
Generics'in temel amacı, bir veri yapısının veya bir sınıfın farklı veri tipleriyle çalışabilmesini sağlamaktır. Böylece, aynı kod parçalarını farklı türlerle kullanabilir ve tip uyumsuzluğundan kaynaklanan hataları önleyebilirsiniz.
Generics, tür güvenliğini artırır ve istenmeyen tür dönüşümlerinden kaynaklanan hataları derleme zamanında tespit edebilir.
Generics, bir sınıf, arayüz veya metodun tür parametresini belirlemek için açıktan okunabilir ve takip eden <> işaretleriyle ifade edilir.
Bu tür parametreleri, harfle veya harflerle temsil edilen bir isimle belirleyebilirsiniz. Genellikle "T" (Type), "E" (Element), "K" (Key) ve "V" (Value) gibi yaygın olarak kullanılan isimler tercih edilir, ancak herhangi bir geçerli Java tanımlayıcısı kullanılabilir.
Arraylist bir class dır , new lenir. Class da tip verilebilir, ya da kendi classı kullanılabilir.
arraylist generic bir classdır, farklı türlerle çalışabilir. Tip güvenli çalışma sağlar.

Generics, Java programlama dilinde genellikle koleksiyon sınıflarında (ArrayList, LinkedList, HashSet vb.) ve veri yapılarında yaygın olarak kullanılır.
Örneğin, bir ArrayList sınıfını generik olarak kullanmak için şu şekilde tanımlanabilir:
ArrayList<String> liste = new ArrayList<>();


 */
