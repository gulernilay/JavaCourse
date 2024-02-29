/*
Methods to Take Input in Java : 
There are two ways by which we can take Java input from the user or from a file
  BufferedReader Class
  Scanner Class


1. BufferedReader is a very basic way to read the input generally used to read the stream of characters. It gives an edge over Scanner as it is faster than Scanner because Scanner does lots of post-processing for parsing the input; as seen in nextInt(), nextFloat()
BufferedReader is more flexible as we can specify the size of stream input to be read. (In general, it is there that BufferedReader reads larger input than Scanner)
These two factors come into play when we are reading larger input. In general, the Scanner Class serves the input.
BufferedReader is preferred as it is synchronized. While dealing with multiple threads it is preferred.
For decent input, and easy readability. The Scanner is preferred over BufferedReader.
Reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines. The buffer size may be specified, or the default size may be used. The default is large enough for most purposes. In general, each read request made by a Reader causes a corresponding read request to be made of the underlying character or byte stream. It is therefore advisable to wrap a BufferedReader around any Reader whose read() operations may be costly, such as FileReaders and InputStreamReaders. Programs that use DataInputStreams for textual input can be localized by replacing each DataInputStream with an appropriate BufferedReader.
  Constructors of BufferedReader Class : 
  BufferedReader(Reader in)  :Creates a buffering character-input stream that uses a default-sized input buffer
  BufferedReader(Reader in, int sz) :Creates a buffering character-input stream that uses an input buffer of the specified size.
This is the Java classical method to take input, Introduced in JDK1.0. This method is used by wrapping the System.in (standard input stream) in an InputStreamReader which is wrapped in a BufferedReader, we can read input from the user in the command line. 
  The input is buffered for efficient reading.
  The wrapping code is hard to remember.

 
2. In Java, Scanner is a class in java.util package used for obtaining the input of the primitive types like int, double, etc. and strings.
nextBoolean(),-nextDouble() ,nextByte(),  nextFloat(),   nextLong(), nextShort()  
This is probably the most preferred method to take input. The main purpose of the Scanner class is to parse primitive types and strings using regular expressions, however, it is also can be used to read input from the user in the command line. 
Convenient methods for parsing primitives (nextInt(), nextFloat(), …) from the tokenized input.
Regular expressions can be used to find tokens.
The reading methods are not synchronized   


3. Console Class: It has been becoming a preferred way for reading user’s input from the command line. In addition, it can be used for reading password-like input without echoing the characters entered by the user; the format string syntax can also be used (like System.out.printf()). 
  Reading password without echoing the entered characters.
  Reading methods are synchronized.
  Format string syntax can be used.
  Does not work in non-interactive environment (such as in an IDE).

  public class Sample {
    public static void main(String[] args)
    {
        // Using Console to input data from user
        String name = System.console().readLine();
 
        System.out.println("You entered string " + name);
    }
} 


4.  Using Command line argument :Most used user input for competitive coding. The command-line arguments are stored in the String format. The parseInt method of the Integer class converts string argument into Integer. Similarly, for float and others during execution. The usage of args[] comes into existence in this input form. The passing of information takes place during the program run. The command line is given to args[]. These programs have to be run on cmd.
   if (args.length > 0) {
            System.out.println(
                "The command line arguments are:");
 
            // iterating the args array and printing
            // the command line arguments
            for (String val : args)
                System.out.println(val);
        }
        else
            System.out.println("No command line "
                               + "arguments found."); 
*/

import java.util.Scanner;

public class InputOutput{
   public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
 
        // input is a string ( one word )
        // read by next() function
        String str1 = scn.next();

        // input is a String ( complete Sentence )
        // read by nextLine()function
        String str2 = scn.nextLine();
 
        // print string
        System.out.println("Entered String str2 : " + str2);
 
        // input is an Integer
        // read by nextInt() function
        int x = scn.nextInt();
 
        // print integer
        System.out.println("Entered Integer : " + x);
 
        // input is a floatingValue
        // read by nextFloat() function
        float f = scn.nextFloat();
 
        // print floating value
        System.out.println("Entered FloatValue : " + f);
        // Character input
        char gender = sc.next().charAt(0);
      
    }
}
}

/*
// Working program using Scanner 
import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
public class Main { 
    public static void main(String[] args) 
    { 
        Scanner s = new Scanner(System.in); 
        int n = s.nextInt(); 
        int k = s.nextInt(); 
        int count = 0; 
        while (n-- > 0) { 
            int x = s.nextInt(); 
            if (x % k == 0) 
                count++; 
        } 
        System.out.println(count); 
    } 
}

// Working program using BufferedReader 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 
  
public class Main { 
    public static void main(String[] args) 
        throws IOException 
    { 
  
        BufferedReader br = new BufferedReader( 
            new InputStreamReader(System.in)); 
  
        StringTokenizer st 
            = new StringTokenizer(br.readLine()); 
        int n = Integer.parseInt(st.nextToken()); 
        int k = Integer.parseInt(st.nextToken()); 
        int count = 0; 
        while (n-- > 0) { 
            int x = Integer.parseInt(br.readLine()); 
            if (x % k == 0) 
                count++; 
        } 
        System.out.println(count); 
    } 
}

















