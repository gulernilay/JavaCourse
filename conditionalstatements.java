/*Conditional Statements:
{if-else if -else}  structure
switch case structure 
*/
import java.util.Scanner


class statement1 {  //if -else usage 
  public static void main(String[] args) {
         int a = 10, b = 20, c = 30;

        if (a >= b && a >= c) {
            System.out.println(a + " en büyük sayıdır.");
        } else if (b >= a && b >= c) {
            System.out.println(b + " en büyük sayıdır.");
        } else {
            System.out.println(c + " en büyük sayıdır.");
        }
    }
}


class Statement2{
    public static void main(String[] args) {
         int day = 4;

        switch (day) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Geçersiz gün numarası");
                break;
        }
    }




}