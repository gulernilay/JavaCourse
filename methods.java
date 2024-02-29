import java.util.*;

public  class Exercise{
    public static void main(String[] arg){
        Scanner x=new Scanner(System.in);        
       
        int result= Summation(5,3); 
        System.out.println(result);
        Hello();

    }
    public static int Summation(int x, int y){  // return type: int   , static tanımlanmasaydı main 'de çağrılamazdı.
        return x+y ;

    }
    public static void Hello(){  // return type: void
        System.out.println("Hello ");
    }





}