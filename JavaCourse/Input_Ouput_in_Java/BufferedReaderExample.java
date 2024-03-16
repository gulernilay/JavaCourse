package Input_Ouput_in_Java;
// Importing required classes 
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 
import java.util.*;


public class BufferedReaderExample{

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("exercise.txt");
        BufferedReader br = new BufferedReader(fr); 
  
        char c[] = new char[20]; 
  
        // Illustrating markSupported() method 
        if (br.markSupported()) { 
  
            // Print statement 
            System.out.println("mark() method is supported");
  
            // Illustrating mark method 
            br.mark(100); 
        } 
  
        // File Contents is as follows: 
        // This is first line 
        // this is second line 
  
        // Skipping 8 characters 
        br.skip(8); 
  
        // Illustrating ready() method 
        if (br.ready()) { 
  
            // Illustrating readLine() method 
            System.out.println(br.readLine()); 
  
            // Illustrating read(char c[],int off,int len) 
            br.read(c); 
  
            for (int i = 0; i < 20; i++) { 
                System.out.print(c[i]); 
            } 
  
            System.out.println(); 
  
            // Illustrating reset() method 
            br.reset(); 
            for (int i = 0; i < 8; i++) { 
  
                // Illustrating read() method 
                System.out.print((char)br.read()); 
            } 
        } 
    } 
}

/*
Buffered Raeder Methods:
  close()	Closes the stream and releases any system resources associated with it.Once the stream has been closed, further read(), ready(), mark(), reset(), or skip() invocations will throw an IOException. Closing a previously closed stream has no effect.
  mark()	Marks the present position in the stream. Subsequent calls to reset() will attempt to reposition the stream to this point.
  markSupported()	Tells whether this stream supports the mark() operation, which it does.
  read()	Reads a single character.
  read(char[] cbuf, int off, int len)	Reads characters into a portion of an array. This method implements the general contract of the corresponding read method of the Reader class. As an additional convenience, it attempts to read as many characters as possible by repeatedly invoking the read method of the underlying stream.
  readLine()	Reads a line of text. A line is considered to be terminated by any one of a line feed (‘\n’), a carriage return (‘\r’), or a carriage return followed immediately by a line feed.
  ready()	Tells whether this stream is ready to be read.
  reset()	Resets the stream to the most recent mark.
  skip(long)	Skips characters.


BufferedReader is synchronous while Scanner is not. BufferedReader should be used if we are working with multiple threads.
BufferedReader has a significantly larger buffer memory than Scanner.
The Scanner has a little buffer (1KB char buffer) as opposed to the BufferedReader (8KB byte buffer), but it’s more than enough.
BufferedReader is a bit faster as compared to Scanner because the Scanner does the parsing of input data and BufferedReader simply reads a sequence of characters.

*/



