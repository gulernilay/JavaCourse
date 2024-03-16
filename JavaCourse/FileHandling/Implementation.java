package FileHandling;
import java.io.File;
import java.io.IOException;
// Dosya oluşturma
public class Implementation {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\nilay\\IdeaProjects\\JAVA_COURSE\\src\\students.txt");
        // file yarattık
        try {
            // oluşturur sonuç olarak true false döner
            if(file.createNewFile()){
                System.out.println("Dosya oluşturuldu");
            }
            else{
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException e) {
            e.printStackTrace(); // hata mesajı yazdırmayı sağlar
        }

    }

}
/*

 */
