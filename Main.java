

import java.util.Scanner;
import java.util.Random;
public class Main {
    // DÖNGÜ- ŞART BLOKLARI
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random= new Random();
        // IF-ELSE :
        String name ="Nilay";
        String input= scanner.nextLine();
        if(input==name){
            System.out.println("You entered correct name");
        }
        else{
            System.out.println("You entered wrong name");
        }
        // SWITCH CASE
        int age=scanner.nextInt();
        switch (age) {
            case 1:
                System.out.println("You entered correct age");
                break;
            case 2:
                System.out.println("You entered wrong age");
                break;
        }
        // DÖNGÜLER:
        int a;
        for(a=0;a<10;a++){
            System.out.println("A : " +a);
            System.out.println();
        }
        int b=0;
        while(b<15){
            System.out.println(b);
            System.out.println();
            b++;
        }
        int c=random.nextInt();
        do{
            System.out.println(c);
            System.out.println();
            c++;
        }
        while(c<100);
        //Diziler:

        String[] öğrenciler= new String[10]; // 10 elemanlı boş array yarattım
        String öğrenci1= "Engin";
        String öğrenci2="Nilay";
        öğrenciler[0]=öğrenci1;
        öğrenciler[1]=öğrenci2;
        // Array elemanları bastırma
        for(int j =0;j<öğrenciler.length;j++){
            System.out.println("Döngü elemanı :  " + öğrenciler[j] );
        }
        öğrenciler[0]=""; // 0.elemanı sıfırladım


        int[] number={1,2,3,4,5};
        for(int num:number){
            System.out.println(num);
        }
        System.out.println("--------------------------------------");
        double[] array1={1.4,2.4,8.8,6.2};
        double sum=0.0;
        for (Double array:array1){
            sum++;
            System.out.println(array);
        }
        System.out.println("Sum of array elements" + sum);










    }
}
