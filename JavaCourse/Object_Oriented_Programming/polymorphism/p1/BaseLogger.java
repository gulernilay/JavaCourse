package Polymorphism;

public class BaseLogger {
    public boolean Log(int sayı){
        System.out.println((1.18)*sayı);
        return false;
    }
    public final void Future(int sayı){ // final kelimesi overwride yapamadığımızı bildiriri.
        System.out.println((1.18)*sayı);
    }

}
