package Generics;
/*
Java'da jenerikler (generics), tür güvenliğini artırmak ve kod tekrarını azaltmak için kullanılır. Jenerikler sayesinde sınıflar, arayüzler ve metotlar, belirli bir tür yerine tür parametreleriyle tanımlanabilir. Bu, farklı türlerdeki nesneleri aynı sınıf, arayüz veya metotla işlem yaparken tür dönüşümü yapmadan kullanmayı sağlar.
 */

public class Main2<T>{   // generics class
    private  T t;

    public T getT() {
        return t;
    }
    public void setT(T t){
        this.t=t;
    }

    public static void main(String[] args) {
        //Generics Class
        Main2<Integer> integerBox = new Main2<>();
        integerBox.setT(10);
        Integer intValue = integerBox.getT();

        Main2<String> stringBox = new Main2<>();
        stringBox.setT("Hello");
        String stringValue = stringBox.getT();


    }
static class Util{
    public static <T> void printArray(T[] array) {  //generics method
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        //Generics Methods
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};

        Util.printArray(intArray);
        Util.printArray(stringArray);

    }

}
// Sınırlı Jenerik Türler (Bounded Type Parameters)
//Bazen, bir jenerik tür parametresini belirli bir tür veya türlerin alt türleriyle sınırlamak isteyebilirsiniz. Bunu yapmak için extends anahtar kelimesi kullanılır:
static class Box<T extends Number> {
        private T t;

        public void set(T t) {
            this.t = t;
        }

        public T get() {
            return t;
        }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        Box<Double> doubleBox = new Box<>();
// Box<String> stringBox = new Box<>(); // Hata! String, Number'ın alt sınıfı değil.
    }
    }




}
