package Input_Ouput_in_Java;
import java.io.*;

public class Exercise3 {
    public static void main(String[] args) {
        String filePath = "exercise.txt";
        int start = 10; // Okumaya başlanacak karakterin indeksi (0'dan başlar)
        int end = 20;   // Okumanın bitirileceği karakterin indeksi

        try {
            FileReader fileReader = new FileReader(filePath);
            char[] buffer = new char[end - start + 1];
            fileReader.skip(start); // İlk 'start' karakterini atla
            fileReader.read(buffer, 0, buffer.length); // Belirli aralıktaki karakterleri oku
            fileReader.close();

            System.out.println("Selected characters: " + new String(buffer));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error occurred while reading the file: " + e.getMessage());
        }

    }
}
