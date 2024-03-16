package Mini_Projects;

import java.util.Scanner;
import java.util.Random;
public class Mini_Proje1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random=  new Random();
        int input=random.nextInt(101);
        System.out.println(input);
        int counter=0;
        // 2-3-5-7-9-11-13-17-19 1 ve kendisi dışında sayılara bölünemeyen
        for(int a=2;a<=input;a++){
            if(input%a==0){
                counter++;
                System.out.println(counter);
            }
        }
        if(counter==1){
            System.out.println("Asal sayıdır.");
        }
        else{
            System.out.println("Asal sayı değildir.");
        }
    }
}
