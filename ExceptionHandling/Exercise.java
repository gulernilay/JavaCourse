package ExceptionHandling;
import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        boolean isValidInput;
        while (true) {
            try {
                System.out.println("Enter an integer value");
                value = scanner.nextInt();
                isValidInput = true; // Input is valid, exit the loop
                System.out.println("User entered an integer successfully!");

            } catch (InputMismatchException e) {
                System.out.println("Lütfen geçerli bir tam sayı girin");
                scanner.next(); // Clear the invalid input
            }
        }
    }

}

/*
Bir kullanıcıdan bir tam sayı girmesini isteyen bir Java programı yazın. Kullanıcıdan alınan değer Scanner sınıfı kullanılarak okunmalıdır.
Eğer kullanıcı bir tam sayı yerine bir metin girerse, InputMismatchException yakalayın ve kullanıcıya "Lütfen geçerli bir tam sayı girin" mesajını gösterin.
Kullanıcı doğru bir tam sayı girene kadar bu işlemi tekrarlayın.
 */
