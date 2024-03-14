package ExceptionHandling;
import java .util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {

        int a=5;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(Exception e){
            e.printStackTrace(); // prints exception information in the form of the Name of the exception
            System.out.println(e.toString()); //prints exception information in the format of the Name of the exception: description of the exception.
            System.out.println(e.getMessage()); //prints only the description of the exception.
        }

        /*
        try {
            String a = null; //null value
            System.out.println(a.charAt(0));
        } catch(NullPointerException e) {
            System.out.println("NullPointerException..");
        }

        ----------------------------------------------------------------------------------------

        try {
            String b = "This is like chipping "; // length is 22
            char c = b.charAt(24); // accessing 25th element
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
        ----------------------------------------------------------------------------------------


        try {
            // Following file does not exist
            File file = new File("E://file.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
        ----------------------------------------------------------------------------------------



        try {
            // "akki" is not a number
            int num = Integer.parseInt ("akki") ;

            System.out.println(num);
        } catch(NumberFormatException e) {
            System.out.println("Number format exception");
        }
        ----------------------------------------------------------------------------------------


        try{
            int a[] = new int[5];
            a[6] = 9; // accessing 7th element in an array of
            // size 5
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds");
        }

        ----------------------------------------------------------------------------------------

        // Create a new scanner with the specified String
        // Object
        Scanner scan = new Scanner("Hello Geek!");

        // Print the line
        System.out.println("" + scan.nextLine());

        // Check if there is an IO exception
        System.out.println("Exception Output: "
                + scan.ioException());

        scan.close();

        ----------------------------------------------------------------------------------------


        try{
            Class.forName("Class1");   // Class1 is not defined
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
            System.out.println("Class Not Found...");
        }

*/

    }
}
