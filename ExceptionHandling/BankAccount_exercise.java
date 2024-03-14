package ExceptionHandling;

public class BankAccount_exercise {
    public static void main(String[] args) {

     BankAccount a1=new BankAccount(1000);
        try {
            a1.deposit(500);
            System.out.println("Yeni bakiye: " + a1.getBalance());
        } catch (Exception e) {
            System.out.println("Para yatırma işlemi sırasında hata oluştu: " + e.getMessage());
        } finally {
            System.out.println("Para yatırma işlemi tamamlandı.");
        }
        try {
            a1.withdraw(2000);
            System.out.println("Yeni bakiye: " + a1.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println("Para çekme işlemi sırasında hata oluştu: " + e.getMessage());
        } finally {
            System.out.println("Para yatırma işlemi tamamlandı.");
        }

    }
}
//User -defined exceptions
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
class BankAccount{
    public double balance ;
    public BankAccount(double _balance){
        balance=_balance;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
      balance+=amount;
    }
    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance < amount) {
            throw new InsufficientFundsException("Yetersiz bakiye.");
        }
        balance -= amount;
    }




}
