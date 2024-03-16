package Collections;
import java.util.*;


public class CollectionsTutorial {
    public static void main(String[] args) {
         //Listeler (Lists): Sıralı koleksiyonlardır ve aynı elemanların birden fazla kez yer almasına izin verirler.

        //1.  ArrayList: Dizi tabanlı bir liste sunar, elemanlara hızlı rastgele erişim sağlar.
        ArrayList<Object> list = new ArrayList<>();
        list.add("Elma");
        list.add("Muz");
        list.add("Kiraz");
        list.add(5);
        System.out.println(list);

        // 2.LinkedList: Hem Liste hem de Kuyruk arabirimlerini uygular, eleman ekleme ve silme işlemleri için optimize edilmiştir.
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Elma");
        linkedList.add("Muz");
        linkedList.add("Kiraz");
        System.out.println(linkedList); // [Elma, Muz, Kiraz]


        //Sets:(Kümeler) - Benzersiz elemanları depolar, yani aynı elemanı iki kez içermezler.
        //1. HashSet : Hash tablosu kullanarak elemanları depolar, en hızlı performansı sunar.

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Elma");
        hashSet.add("Muz");
        hashSet.add("Elma");
        System.out.println(hashSet); // [Elma, Muz]

        //2.TreeSet: Elemanları sıralı bir şekilde tutar ve NavigableSet arabirimini uygular.

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Elma");
        treeSet.add("Muz");
        treeSet.add("Armut");
        System.out.println(treeSet); // [Armut, Elma, Muz]

        // Haritalar (Maps): Anahtar-değer çiftlerini depolar, her anahtar benzersizdir ve bir değere karşılık gelir.
        //1. HashMap: Anahtar-değer çiftlerini hash tablosunda depolar, sıralama sunmaz.

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Elma", 10);
        hashMap.put("Muz", 20);
        hashMap.put("Kiraz", 30);
        System.out.println(hashMap); // {Muz=20, Elma=10, Kiraz=30}

        //2.TreeMap: Anahtarları sıralı tutar.
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Elma", 10);
        treeMap.put("Muz", 20);
        treeMap.put("Armut", 30);
        System.out.println(treeMap); // {Armut=30, Elma=10, Muz=20}


        //Kuyruklar (Queues): Elemanları işleme sırasına göre depolar.
        //1.LinkedList: Kuyruk işlevselliği sağlar ve elemanları sıraya göre ekler veya çıkarır.

        Queue<String> queue = new LinkedList<>();
        queue.add("Elma");
        queue.add("Muz");
        queue.add("Kiraz");
        System.out.println(queue); // [Elma, Muz, Kiraz]
        System.out.println("Kuyruktan çıkan: " + queue.poll()); // Elma
        System.out.println(queue); // [Muz, Kiraz]

        //2.PriorityQueue: Elemanları verilen bir karşılaştırıcıya göre sıralar.
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(5);
        priorityQueue.add(20);
        System.out.println(priorityQueue); // [5, 10, 20]
        System.out.println("Kuyruktan çıkan: " + priorityQueue.poll()); // 5


        //Stack: Elemanları yığın olarak tutar ve LIFO mantığına göre çalışır.
        Stack<String> stack = new Stack<>();
        stack.push("Elma");
        stack.push("Muz");
        stack.push("Kiraz");
        System.out.println("Stack'ten çıkan: " + stack.pop()); // Kiraz
        System.out.println(stack); // [Elma, Muz]

    }
}
