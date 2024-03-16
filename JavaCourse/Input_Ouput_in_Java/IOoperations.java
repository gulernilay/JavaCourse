package Input_Ouput_in_Java;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOoperations {

    public static void main(String[] args) {
        // Dosyaya veri yazmak için FileOutputStream örneği
        String dataToWrite = "Java IO ile dosya işlemleri!";
        try (FileOutputStream fileOutputStream = new FileOutputStream("output.txt")) {
            fileOutputStream.write(dataToWrite.getBytes());
            System.out.println("Veri başarıyla yazıldı.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Veri okumak için FileInputStream örneği
        try (FileInputStream fileInputStream = new FileInputStream("output.txt")) {
            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Verimli yazmak için BufferedOutputStream örneği
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("output_buffered.txt"))) {
            bufferedOutputStream.write(dataToWrite.getBytes());
            System.out.println("\nBuffered ile veri başarıyla yazıldı.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*

Java'da, FileReader ve FileInputStream ile FileWriter ve FileOutputStream sınıfları dosya işlemleri için kullanılır ancak farklı senaryolar ve veri türleri için tercih edilirler.
İşte ana farkları:

FileReader vs FileInputStream:

Veri Türü:
FileReader: Karakter tabanlı veri okumak için kullanılır. Metin dosyalarını okurken kullanışlıdır çünkü otomatik olarak karakter kodlaması yapar.
FileInputStream: Bayt tabanlı veri okumak için kullanılır. Resimler, ses dosyaları gibi ikili dosyaları veya belirli bir karakter kodlaması gerektirmeyen herhangi bir veriyi okumak için uygundur.

Kod Çözme:
FileReader: Sistem varsayılan karakter setini kullanarak okunan baytları karakterlere dönüştürür. Özel bir karakter seti gerektiren durumlarda, InputStreamReader kullanarak karakter seti belirtilebilir.
FileInputStream: Kod çözme yapmaz, ham baytları olduğu gibi okur ve döndürür.

Verimlilik:
FileReader: Metin verileri için daha verimlidir çünkü karakter tabanlı işlemler yapar ve büyük veri bloklarını işlemek için optimize edilmiştir.
FileInputStream: Bayt düzeyinde işlem yapar ve tamponlama kullanılmadığında her read() çağrısında yalnızca bir bayt okur, bu nedenle büyük dosyalar için daha az verimli olabilir.



FileWriter vs FileOutputStream:

Veri Türü:
FileWriter: Karakter tabanlı veri yazmak için kullanılır. Metin verileri yazarken tercih edilir.
FileOutputStream: Bayt tabanlı veri yazmak için kullanılır. İkili verileri, örneğin resim veya video dosyalarını yazarken kullanılır.

Kod Çözme:
FileWriter: Yazma işlemi sırasında veriyi sistem varsayılan karakter setine göre kodlar. Belirli bir karakter seti ile yazmak için OutputStreamWriter kullanılabilir.
FileOutputStream: Kodlama yapmaz; verileri ham bayt olarak yazdırır.

Verimlilik:
FileWriter: Karakter verileri için optimize edilmiştir ve tamponlamayı dahili olarak yönetir.
FileOutputStream: Daha düşük seviyeli bir sınıftır ve büyük veri bloklarını yazarken BufferedOutputStream ile kullanılması daha verimli olabilir.
Kısacası, FileReader/FileWriter ikilisi karakterlerle çalışmak için, FileInputStream/FileOutputStream ise ham baytlarla çalışmak için daha uygundur. Metin dosyalarını işlerken FileReader/FileWriter kullanılırken, ikili dosyaları işlerken FileInputStream/FileOutputStream kullanılmalıdır.







 */
