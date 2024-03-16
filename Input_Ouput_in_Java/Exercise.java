package Input_Ouput_in_Java;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Exercise {
    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\nilay\\Desktop\\denemeee\\src\\exercise.txt");
        int totallines = 0;

        try {
            FileReader fr = new FileReader(file1);
            BufferedReader br = new BufferedReader(fr);
            String metin;

            while ((metin = br.readLine()) != null) {
                totallines++;
                System.out.println(metin);
                String[] words = metin.split("\\s+"); // "\\s+" regex boşlukları ayırır.
                int wordCount = words.length;
                System.out.println("Line " + totallines+ " has " + wordCount + " words: " + metin);
            }

            System.out.println("Total line: " + totallines);
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}





/*
Bir metin dosyasından satır satır okuma yaparak, her satırdaki kelime sayısını hesaplayan ve sonuçları başka bir metin dosyasına yazan bir Java programı yazınız.
Programınız, kaynak dosyanın adını ve hedef dosyanın adını komut satırı argümanları olarak almalıdır.
 */