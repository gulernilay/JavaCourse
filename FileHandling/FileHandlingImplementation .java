package FileHandling;
import java.io.*;
// geeksfor geeks bak     - IO ve File Handling bak


class FileHandlingImplementation {

    public static void main(String[] args) {
        File myfile = new File("niloya.txt");
        File myfile2 = new File("C:\\Users\\nilay\\Desktop\\JavaCourse\\JavaCourse\\FileHandling\\info.txt");

        //Okuma
        try {
            BufferedReader br = new BufferedReader(new FileReader(myfile));
            String line=br.readLine();
            while(line!=null){
                System.out.println(line);
                line=br.readLine();
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Dosyadan okunurken bir hata oluştu.");
            e.printStackTrace();
        }finally{
            System.out.println("Dosya okuma işlemi başarıyla gerçekleştirildi");
        }
        //Dosya Silme
        if (myfile2.delete()) {
            System.out.println("Dosya silindi: " + myfile2.getName());
        } else {
            System.out.println("Dosya silinemedi.");
        }

        // Dosya oluşturma
        File myFile = new File("myFile.txt");
        try {
            if (myFile.createNewFile()) {
                System.out.println("Dosya oluşturuldu: " + myFile.getName());
            } else {
                System.out.println("Dosya zaten var.");
            }
        } catch (IOException e) {
            System.out.println("Dosya oluşturulurken bir hata oluştu.");
            e.printStackTrace();
        }
        // Dosyaya yazma
        try {
            FileWriter writer = new FileWriter("myFile.txt");
            writer.write("Merhaba, Java ile dosya işlemleri yapıyorum!");
            writer.close();
            System.out.println("Dosyaya başarıyla yazıldı.");
        } catch (IOException e) {
            System.out.println("Dosyaya yazılırken bir hata oluştu.");
            e.printStackTrace();
        }



    }
}



/*
Soru: Dosya İşlemleri
Bir metin dosyası üzerinde bazı temel dosya işlemleri gerçekleştiren bir Java programı yazın. Programınız dosya oluşturma, dosyaya yazma, dosyadan okuma ve dosya silme işlevlerini içermelidir.

Adımlar:
Dosya Oluşturma: myFile.txt adında bir dosya oluşturun. Eğer dosya zaten varsa, kullanıcıya bir mesaj gösterin.

Dosyaya Yazma: Oluşturduğunuz dosyaya "Merhaba, Java ile dosya işlemleri yapıyorum!" metnini yazın.

Dosyadan Okuma: Dosyadan içeriği okuyun ve konsola yazdırın.

Dosya Silme: Dosyayı silin. Dosyanın silinip silinmediğini kontrol edin ve sonucu kullanıcıya bildirin.

BufferedReader
BufferedReader sınıfı, metin dosyalarından veri okumak için kullanılır. Bu sınıf, verileri bir tampon (buffer) aracılığıyla okur, bu da okuma işleminin daha verimli olmasını sağlar. BufferedReader genellikle bir FileReader veya başka bir Reader nesnesi ile birlikte kullanılır.
BufferedReader br = new BufferedReader(new FileReader("dosya.txt"));
String satir = br.readLine();
while (satir != null) {
    System.out.println(satir);
    satir = br.readLine();
}
br.close();


BufferedWriter sınıfı, metin dosyalarına veri yazmak için kullanılır. Bu sınıf, verileri bir tampona yazar ve tampon dolunca verileri dosyaya yazar. Bu, yazma işleminin daha verimli olmasını sağlar. BufferedWriter genellikle bir FileWriter veya başka bir Writer nesnesi ile birlikte kullanılır.
BufferedWriter bw = new BufferedWriter(new FileWriter("dosya.txt"));
bw.write("Merhaba, Java!");
bw.newLine();
bw.write("Dosya işlemleri öğreniyorum.");
bw.close();

FileReader
FileReader sınıfı, dosyalardan karakter bazında veri okumak için kullanılır. Bu sınıf, dosyadan doğrudan veri okur ve genellikle bir BufferedReader ile birlikte kullanılır.
FileReader fr = new FileReader("dosya.txt");
BufferedReader br = new BufferedReader(fr);
String satir = br.readLine();
while (satir != null) {
    System.out.println(satir);
    satir = br.readLine();
}
br.close();
fr.close();




FileWriter sınıfı, dosyalara karakter bazında veri yazmak için kullanılır. Bu sınıf, verileri doğrudan dosyaya yazar ve genellikle bir BufferedWriter ile birlikte kullanılır.
FileWriter fw = new FileWriter("dosya.txt");
BufferedWriter bw = new BufferedWriter(fw);
bw.write("Merhaba, Java!");
bw.newLine();
bw.write("Dosya işlemleri öğreniyorum.");
bw.close();
fw.close();

















 */