package Polymorphism;

public class DatabaseLogger extends BaseLogger{
        public boolean Log(){ // overwriding example: Function output is changed, name is same
            System.out.println("Hello Database");
            return false;
        }
}
