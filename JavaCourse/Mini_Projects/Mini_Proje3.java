package Mini_Projects;

import java.util.Scanner;

public class Mini_Proje3 {
    // mükemmel sayı bulma: 6 sayısı : 1-23 e bölünür ve toplamları 6 dır
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] bölünenler=new int[15];
        int total=0;
        System.out.println("Enter a number");
        int c = scanner.nextInt();
        for(int a=1;a<=c;a++){
            if(c%a==0){
                bölünenler[a-1]=a;
            }
        }
        for(int bölen:bölünenler){
            System.out.println(bölen);
            total=total+bölen;
        }
        if((total-c)==c){
            System.out.println("Mükemmel sayıdır");
        }
        else{
            System.out.println("Mükemmel sayı değildir.");
        }

    }
}
