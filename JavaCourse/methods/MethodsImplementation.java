package methods;

import java.util.*;


public  class MethodsImplementation{
    public static void main(String[] arg){
        Scanner x=new Scanner(System.in);        
       
        int result= Summation(5,3);  // return x+y
        System.out.println(result);
        Hello(); // no return type

    }
    public static int Summation(int x, int y){  // return type: int   , static tanımlanmasaydı main 'de çağrılamazdı.
        return x+y ;

    }
    public static void Hello(){  // return type: void
        System.out.println("Hello ");
    }  // Not need to create Class object





}