/*
String :
-store character of values 
-every character is stored in 16 bits i,e using UTF 16-bit encoding
-A string acts the same as an array of characters

*/
public class string {
    public static void main(String[] args) {

        String mesaj ="Hava çok güzel";
        System.out.println(mesaj.length());   // char sayısı
        System.out.println(mesaj.charAt(5)); //4.index eleman
        System.out.println(mesaj.concat(" değil mi?")); //concatenation
        System.out.println(mesaj.startsWith("T")); //false
        System.out.println(mesaj.endsWith("?")); //false
        char [] karakterler= new char[5];
        mesaj.getChars(0,4,karakterler,0); //0.indeksten itibaren 0-4 arası karakterleri char arraye aktar
        System.out.println(mesaj.indexOf("a")); // 1 verir, ilk a nın olduğu indekestir
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("e")); // aramaay sağdan başlar
      //Ways of Creating a String

      //String Literal :To make Java more memory efficient (because no new objects are created if it exists already in the string constant pool). 
      String demoString = “GeeksforGeeks”;

      //Using new keyword:   JVM will create a new string object in normal (non-pool) heap memory and the literal “Welcome” will be placed in the string constant pool. The variable s will refer to the object in the heap (non-pool) 
      String demoString = new String (“GeeksforGeeks”);
        mesaj.replace("a","y");
        mesaj.replace("","-");
        mesaj.substring(2);// 2.indexten itibaren alır.
        mesaj.substring(2,5);// 2.index ile 5.index arası alır.
        for (String kelime:mesaj.split("")){ // kelimeleri ayırır.
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase()); // database search operations
        System.out.println(mesaj.toUpperCase());



    }
}


