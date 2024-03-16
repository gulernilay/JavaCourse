package Collections;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
    public static void main(String[] args) {

        ArrayList list1=new ArrayList();
        System.out.println(list1.size());
        list1.add(10);
        list1.add("Nilay");
        System.out.println(list1.get(0)); //  0.elemanı okuma
        //list1.set(0,100); // 0.elemanı 100 olarak atıyorum
        //list1.remove(0);// 0.indexi silmek kalan diğer indeksler 0.eleman olarak kayıyor
        //list1.clear();
        for(Object i:list1){
            System.out.println(i);
        }


        //ArrayList<String> liste = new ArrayList<>();
        //ArrayList<Integer> sayilar = new ArrayList<>(10);
        //List<String> kaynakListe = new ArrayList<>();
        //kaynakListe.add("Eleman 1");
        //kaynakListe.add("Eleman 2");

        //ArrayList<String> hedefListe = new ArrayList<>(kaynakListe);
//Yukarıdaki örneklerde ArrayList, belirli bir türle (generics) parametreleştirilmiştir.Ancak, türü belirlemek yerine ArrayList'i herhangi bir nesne türünü tutabilecek şekilde tanımlayabilirsiniz:
        // ArrayList<Object> liste3 = new ArrayList<>();

    }
}
