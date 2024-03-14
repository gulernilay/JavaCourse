package Java_Basics;


public class ArraysImplementation {
    public static void main(String[] args) {
        //Array Declaration Types:

                //Type 1 Declaration:
                String [] studentList=new String[10];
                int[] numbers = new int[5];
                //Type2 Declaration:
                int[] numbers2 = {1, 2, 3, 4, 5};
                //Multidimensional Array :
                int[][] numbers3=new int[5][3];  // create 5*3 matrix
                int[][] numbers4={  // 3*3 matrix
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };



        // Adding elements to array :

                numbers[1]=6;
                numbers[0]=5;
                //Multidimensional Array
                numbers3[0][0]=1;
                numbers3[0][1]=6;
                numbers3[1][0]=10;
                numbers3[1][1]=45;
                numbers3[2][0]=67;
                numbers3[2][1]=35;


        //print elements of array in 2 different ways
        for (int x:numbers){
            System.out.println(x);
        }
        for (int a=0;a<=numbers.length;a++){
            System.out.println(numbers[a]);
        }

        for (int i =0;i<=4;i++){
            for (int j =0;j<=2;j++){
                System.out.println(numbers3[i][j]); //numbers3=  5*3 matrix - 5row ,3 column var ise : 0....4 arası row dolaşmak ,0...2 arası columns dolaşmak

            }
        }


        // A mixed array declaration
        Object[] mixedArray = new Object[5];
        mixedArray[0] = "Hello";       // String
        mixedArray[1] = 42;            // Integer
        mixedArray[2] = 3.14;          // Double
        mixedArray[3] = true;          // Boolean
        mixedArray[4] = new int[]{1, 2, 3}; // int dizisi


        for(Object x: mixedArray){
            System.out.println(x);
        }


    }
}





