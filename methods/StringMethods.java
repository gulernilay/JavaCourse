/*
String :
-store character of values 
-every character is stored in 16 bits i,e using UTF 16-bit encoding
-A string acts the same as an array of characters
*/
package methods;

public class StringMethods {
    public static void main(String[] args) {

        String mesaj ="Hava çok güzel";
        System.out.println(mesaj.length());   // char sayısı
        System.out.println(mesaj.charAt(5)); //4.index eleman
        System.out.println(mesaj.concat(" değil mi?")); //concatenation
        System.out.println(mesaj.startsWith("T")); //false
        System.out.println(mesaj.endsWith("?")); //false
        mesaj.replace("a","y");
        mesaj.replace("","-");
        mesaj.substring(2);// 2.indexten itibaren alır.
        mesaj.substring(2,5);// 2.index ile 5.index arası alır.
        for (String kelime:mesaj.split("")){ // kelimeleri ayırır.
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase()); // database search operations
        System.out.println(mesaj.toUpperCase());


        char [] karakterler= new char[5];
        mesaj.getChars(0,4,karakterler,0); //0.indeksten itibaren 0-4 arası karakterleri char arraye aktar
        System.out.println(mesaj.indexOf("a")); // 1 verir, ilk a nın olduğu indekestir
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("e")); // aramaya sağdan başlar


      //Ways of Creating a String

      String demoString ="Nilay";
      String demoString2 = new String ("GeeksforGeeks");

        String word1 = "Learn Share Learn";
        String word2 = word1.trim(); // returns “Learn Share Learn”

        String s1="geeksforgeeks";
        String s2="geeks";
        s1.contains(s2);// return true



    }
}
/*
String Pool Kullanımı:

String Literal: Java'da, aynı değere sahip olan tüm String literalleri bellekte yalnızca bir kez saklanır. Bu, Java'nın String Pool adı verilen bir özelliği sayesinde mümkündür.
Örneğin, String demoString = "Nilay"; ifadesi kullanıldığında, "Nilay" değeri String Pool'da saklanır ve demoString değişkeni bu değere bir referans olarak atanır.

new Anahtar Kelimesi: String demoString2 = new String("GeeksforGeeks"); ifadesinde ise new anahtar kelimesi kullanılarak her zaman yeni bir String nesnesi oluşturulur.
Bu durumda, "GeeksforGeeks" değeri String Pool'da saklanmaz; bunun yerine heap bellek alanında yeni bir nesne olarak saklanır ve demoString2 değişkeni bu yeni nesneye bir referans olarak atanır.
Hafıza Kullanımı:

String literal kullanımı genellikle daha verimlidir çünkü aynı değere sahip String'ler bellekte yalnızca bir kez saklanır. Bu, bellek kullanımını azaltır ve programın performansını artırır.
new anahtar kelimesi ile oluşturulan String'ler ise her zaman yeni bir nesne olarak saklandığı için, aynı değere sahip birden fazla String oluşturulduğunda bellek kullanımı artar.


 */

