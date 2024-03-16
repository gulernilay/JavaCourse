package Java_Basics;
import java.util.*;
/*
Loops: For, while, do-while
*/

public class Loops {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //For -usage
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Toplam: " + sum);


        //while-usage
        int x=5;
        while(x <= 10){
            System.out.println(x);
            x++;
        }
        //do-while usage:
            int a=5;
            do{
                System.out.println(a);
                x++;
            }
            while(a <= 10);

        //infinite loop :
            // Method 1:
            for(;;){
                System.out.println("Bu bir sonsuz döngüdür.");
                System.out.println("Bir eleman gir ");
                int sayı= scanner.nextInt();
                if(sayı==6){
                    System.exit(1);  //Exit from the program
                }
            }

            //Method 2:while(true){}

        //Nested Loops:
         for(int d = 0; d < 3; d++){ // Desen Çizimi , multidimensional arrays
                for(int j = 0; j < 2; j++){
                    System.out.println(d);
                }
                System.out.println();
            }

        //for-each loop :
        String array[] = { "Ron", "Harry", "Hermoine" };
        for (String y : array) {System.out.println(y);}





        // Example :
        int[] marks = { 125, 132, 95, 116, 110 };
        int highest_marks = maximum(marks);
        System.out.println("The highest score is " + highest_marks);

    }
    public static int maximum(int[] numbers)
    {
        int maxSoFar = numbers[0];

        // for each loop
        for (int num : numbers)
        {
            if (num > maxSoFar)
            {
                maxSoFar = num;
            }
        }
        return maxSoFar;
    }
    //return keyword: It is used to exit from a method, with or without a value.
    static void  demofunction(double j)  // j=5.5için sonuç =6.0
    {
        if (j < 9)
            return;
        ++j;
    }
}

