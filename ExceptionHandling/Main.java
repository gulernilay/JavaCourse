package ExceptionHandling;
import java .util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        /*
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
        try {
            String a = null; //null value
            System.out.println(a.charAt(0));
        } catch(NullPointerException e) {
            System.out.println("NullPointerException..");
        }
        try {
            String b = "This is like chipping "; // length is 22
            char c = b.charAt(24); // accessing 25th element
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
        try {

            // Following file does not exist
            File file = new File("E://file.txt");

            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
        try {
            // "akki" is not a number
            int num = Integer.parseInt ("akki") ;

            System.out.println(num);
        } catch(NumberFormatException e) {
            System.out.println("Number format exception");
        }
        try{
            int a[] = new int[5];
            a[6] = 9; // accessing 7th element in an array of
            // size 5
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds");
        }
        // Create a new scanner with the specified String
        // Object
        Scanner scan = new Scanner("Hello Geek!");

        // Print the line
        System.out.println("" + scan.nextLine());

        // Check if there is an IO exception
        System.out.println("Exception Output: "
                + scan.ioException());

        scan.close();
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
/*
To handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc so that the regular flow of the application can be preserved.
In Java, Exception is an unwanted or unexpected event, which occurs during the execution of a program, i.e. at run time, that disrupts the normal flow of the program’s instructions. Exceptions can be caught and handled by the program.
When an exception occurs within a method, it creates an object. This object is called the exception object. It contains information about the exception, such as the name and description of the exception and the state of the program when the exception occurred.
Major reasons why an exception Occurs
Invalid user input
Device failure
Loss of network connection
Physical limitations (out-of-disk memory)
Code errors
Opening an unavailable file
Errors represent irrecoverable conditions such as Java virtual machine (JVM) running out of memory, memory leaks, stack overflow errors, library incompatibility, infinite recursion, etc. Errors are usually beyond the control of the programmer, and we should not try to handle errors.

Difference between Error and Exception
Let us discuss the most important part which is the differences between Error and Exception that is as follows:
  Error: An Error indicates a serious problem that a reasonable application should not try to catch.
  Exception: Exception indicates conditions that a reasonable application might try to catch.

https://www.geeksforgeeks.org/exceptions-in-java/?ref=lbp

Built-in Exceptions:

Built-in exceptions are the exceptions that are available in Java libraries. These exceptions are suitable to explain certain error situations. Below is the list of important built-in exceptions in Java.

ArithmeticException: It is thrown when an exceptional condition has occurred in an arithmetic operation.
ArrayIndexOutOfBoundsException: It is thrown to indicate that an array has been accessed with an illegal index. The index is either negative or greater than or equal to the size of the array.
ClassNotFoundException: This Exception is raised when we try to access a class whose definition is not found
FileNotFoundException: This Exception is raised when a file is not accessible or does not open.
IOException: It is thrown when an input-output operation failed or interrupted
InterruptedException: It is thrown when a thread is waiting, sleeping, or doing some processing, and it is interrupted.
NoSuchFieldException: It is thrown when a class does not contain the field (or variable) specified
NoSuchMethodException: It is thrown when accessing a method that is not found.
NullPointerException: This exception is raised when referring to the members of a null object. Null represents nothing
NumberFormatException: This exception is raised when a method could not convert a string into a numeric format.
RuntimeException: This represents an exception that occurs during runtime.
StringIndexOutOfBoundsException: It is thrown by String class methods to indicate that an index is either negative or greater than the size of the string
IllegalArgumentException : This exception will throw the error or error statement when the method receives an argument which is not accurately fit to the given relation or condition. It comes under the unchecked exception.
IllegalStateException : This exception will throw an error or error message when the method is not accessed for the particular operation in the application. It comes under the unchecked exception.

 */
