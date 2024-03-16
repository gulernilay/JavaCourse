package Generics2;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        String[] strings = {"Hello", "World"};

        System.out.println("Printing Integer Array:");
        printArray(integers);

        System.out.println("Printing String Array:");
        printArray(strings);

    }
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
/*
Bu örnekte repostory deseni kullanılacaktır. bu desen veritabanı işlemlerinde kullanılır.
Repository tasarım deseni, bir veri kaynağına (veritabanı, dosya sistemi, harici API vb.) erişmek ve bu veri kaynağından veri alma, veri ekleme, veri güncelleme ve veri silme gibi işlemleri gerçekleştirmek için kullanılan bir tasarım desenidir. Bu desen, veritabanı işlemlerini soyutlayarak uygulama katmanıyla veri kaynağı arasındaki bağı gevşetir ve kodun daha okunabilir, bakımı daha kolay ve test edilebilir olmasını sağlar.

Generics Metot:
public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }


 */