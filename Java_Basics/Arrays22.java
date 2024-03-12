import java.util.*;

public class Arrays22 {
    public static void main(String[] args) {
        //Array Declaration Types:

        //Type 1:
        String [] studentList=new String[10];
        int[] numbers = new int[5]; // 5 elemanlı bir dizi, tüm elemanlar 0 ile doldurulur.
        numbers[1]=6;// change element of array
        numbers[0]=5;
        for (int x:numbers){
            System.out.println(x);
        }
        for (int a=0;a<=numbers.length;a++){
            System.out.println(numbers[a]);
        }

        //Type2 :
        int[] numbers2 = {1, 2, 3, 4, 5};

        //Multidimensional Array :
        int[][] numbers3=new int[5][3];  // create 5*3 matrix
        int[][] numbers4={  // 3*3 matrix
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        numbers3[0][0]=1; // add elements to array
        numbers3[0][1]=6;
        numbers3[1][0]=10; // add elements to array
        numbers3[1][1]=45;
        numbers3[2][0]=67; // add elements to array
        numbers3[2][1]=35;
        
        /*
        for (int i =0;i<=2;i++){
            for (int j =0;j<=1;j++){
                System.out.println(numbers[i][j]);

            }
        }
        */

        
        // Different types of variables
        Object[] mixedArray = new Object[5];
        mixedArray[0] = "Hello";       // String
        mixedArray[1] = 42;            // Integer
        mixedArray[2] = 3.14;          // Double
        mixedArray[3] = true;          // Boolean
        mixedArray[4] = new int[]{1, 2, 3}; // int dizisi


    }
}





