package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist2 {
    public static void main(String[] args) {
      // arraylist i generic hale getirmek
        ArrayList<String> harfler=new ArrayList<>(10);
        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        harfler.remove("B");
        for(String i:harfler){
            System.out.println(i);
        }
        Collections.sort(harfler);

    }
}
