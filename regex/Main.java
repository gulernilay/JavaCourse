package regex;
import java.util.regex.*;
//geeksden bak

public class Main {
    public static void main(String[] args) {
        // bir dizenin belirli bir desene uyup uymadığını kontrol etme
        String pattern = "^[a-zA-Z]+$"; // Sadece harflerden oluşan bir desen
        String input = "Hello";

        boolean matches = Pattern.matches(pattern, input);
        System.out.println(matches); // true

        //bir dizede arama yapma ve eşleşenleri bulma

        String pattern2 = "\\bJava\\b"; // "Java" kelimesini arar
        String input2 = "I love Java and Java is great.";

        Pattern p = Pattern.compile(pattern2);
        Matcher m = p.matcher(input2);
        while (m.find()) {
            System.out.println("Eşleşme bulundu: " + m.group() + " başlangıç indeksi: " + m.start());
        }

        // Bir Dizede Birden Fazla Desene Göre Arama Yapma
        String pattern3 = "(Java)|(Python)"; // "Java" veya "Python" kelimelerini arar
        String input3 = "I love Java and Python.";

        Pattern p3 = Pattern.compile(pattern);
        Matcher m3 = p3.matcher(input);

        while (m3.find()) {
            System.out.println("Eşleşme bulundu: " + m3.group());
        }

        //Bir Dizedeki Karakterleri Değiştirme
        String pattern4 = "Java";
        String replacement4 = "Kotlin";
        String input4 = "Java is fun.";

        String result = input4.replaceAll(pattern4, replacement4);
        System.out.println(result); // "Kotlin is fun."

        // E-postA Doğrulama:
        String pattern5 = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        String email = "example@example.com";

        boolean isValid = Pattern.matches(pattern5, email);
        System.out.println(isValid); // true


        //Telefon doğrulama:
        String pattern6 = "^\\+?[0-9]{1,3}?[-.\\s]?[0-9]{2,3}?[-.\\s]?[0-9]{3,4}?[-.\\s]?[0-9]{3,4}?$";
        String phone = "+90 123 456 7890";

        boolean isValid6 = Pattern.matches(pattern6, phone);
        System.out.println(isValid6); // true




    }


}
