package Polymorphism;

public class CustomerManager {
    private BaseLogger logger;
    public CustomerManager(BaseLogger logger){
        this.logger=logger;
    }
    public void Add(){
        System.out.println("Müşteri eklendi");
        this.logger.Log(34);
    }
    public boolean Log(int sayı){ // overwriting
        System.out.println((1.25)*sayı);
        return false;
    }
}
