package FileHandling;

import java.io.*;
import java.util.Scanner;

public class DosyaOkuma {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
    }
    public static void createFile(){
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
    public static void getInfo(){
        File file=new File("C:\\Users\\nilay\\IdeaProjects\\JAVA_COURSE\\src\\students.txt");
        if(file.exists()){
            System.out.println("Dosya adı : " + file.getName());
            System.out.println("Dosya path : " + file.getAbsolutePath()) ;
            System.out.println("Dosya yazılabilir mi : " + file.canWrite());
            System.out.println("Dosya okunabilir mi " + file.canRead());
            System.out.println("Dosya boyutu : " + file.length()); // byte cinsinden

        }
    }
    public static void readFile(){
        File file=new File("C:\\Users\\nilay\\IdeaProjects\\JAVA_COURSE\\src\\students.txt");
        try {
            Scanner scanner=new Scanner(file); // file reading
            while(scanner.hasNextLine()){ // okuyabildiği sürece devam eder
                String line= scanner.nextLine(); // satır satır okur ve bastırır
                System.out.println(line);
            }
            scanner.close();// bellekten dosya silinir
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // eğer dosya olmazsa
        }

    }
    public static void writeFile(){
        try{
            FileWriter fileWriter= new FileWriter("C:\\Users\\nilay\\IdeaProjects\\JAVA_COURSE\\src\\students.txt");
            BufferedWriter bw=new BufferedWriter(fileWriter,1); // true yazmazsak siler içeriği
            bw.newLine(); // en sona bitişik yazmaz ayrı satıra geçer
            bw.write("Ahmet"); // dosyanın üzerine yazar
            System.out.println("Dosyaya yazıldı");
            bw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
