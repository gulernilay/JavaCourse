package Polymorphism2;
// Müşteri ister SQL kullanır ister Oracle Kullanır.
public class CustomerManager {
    BaseManager databaseManager;
    // databaseManager isterse SQL isterse Oracle tutabilir.
    public void getCustomer(){
        databaseManager.getData();

        /*
        OracleManager om=new OracleManager();
        om.getData(); yazılırsa Oracle 'a bağımlı hale geliriz , önerilmez
         */

    }
}
