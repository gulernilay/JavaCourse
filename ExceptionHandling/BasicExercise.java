package ExceptionHandling;
import java.util.*;

public class BasicExercise {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter a number");
        double num1=x.nextInt();
        System.out.println("Enter a number");
        double num2=x.nextInt();
        double y=divide(num1,num2);
        System.out.println(y);
        x.close();
    }

    public static double divide(double num1,double num2){
        double result = 0;
        try{
           result= num1/num2;
            System.out.println(result);
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Exception type: " + e.getClass().getName());
            System.out.println("Exception message: " + e.getMessage());
        }
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return result;
    }

}


// double değerler olduğunda exception atmaz, infinity döndürür