package Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList22 {
    public static void main(String[] args) {
        // ArrayList oluşturma
        ArrayList<String> sehirler = new ArrayList<>();
        // ArrayList'e eleman ekleme
        sehirler.add("İstanbul");
        sehirler.add("Ankara");
        sehirler.add("İzmir");
        // ArrayList'ten eleman okuma
        System.out.println("İlk şehir: " + sehirler.get(0));
        // ArrayList'teki bir elemanı değiştirme
        sehirler.set(1, "Bursa");
        // ArrayList'teki bir elemanı silme
        sehirler.remove("İzmir");
        // ArrayList'i döngü ile yazdırma
        System.out.println("Şehirler listesi:");
        for (String sehir : sehirler) {
            System.out.println(sehir);
        }
        // ArrayList'i temizleme
        sehirler.clear();
        // Iterator ile ArrayList'i döngü ile yazdırma
        System.out.println("Şehirler listesi:");
        Iterator<String> iterator = sehirler.iterator();
        while (iterator.hasNext()) {
            String sehir = iterator.next();
            System.out.println(sehir);
        }

        // Iterator ile ArrayList'teki bir elemanı silme
        iterator = sehirler.iterator(); // Iterator'ı yeniden başlat
        while (iterator.hasNext()) {
            String sehir = iterator.next();
            if (sehir.equals("Ankara")) {
                iterator.remove(); // Ankara'yı listeden çıkar
            }
        }


    }

}
