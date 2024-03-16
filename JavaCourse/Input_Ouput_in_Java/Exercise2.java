package Input_Ouput_in_Java;

import java.io.*;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        File file1 = new File("C:\\Users\\nilay\\Desktop\\denemeee\\src\\exercise.txt");
        try{
            System.out.println("Write something to file");
            String text=x.nextLine();
            FileWriter fw=new FileWriter(file1);
            BufferedWriter bw =new BufferedWriter(fw);
            bw.write(text);
            bw.close();

            FileReader fr=new FileReader(file1);
            BufferedReader br=new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }



    }
}

/*
Program, kullanıcıdan alınan bir metni, belirtilen bir dosyaya yazacak. Eğer dosya mevcut değilse, yeni bir dosya oluşturacak.

 */

