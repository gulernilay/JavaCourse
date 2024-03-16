package Collections;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> list= new ArrayList<>(10);
        list.add(new Customer(1,"NİLAY","GÜLER"));
        Customer engin=new Customer(4,"engin","GÜLER");
        list.add(new Customer(2,"Hasan","GÜLER"));
        list.add(new Customer(3,"Kemal","GÜLER"));
        list.remove(new Customer(1,"NİLAY","GÜLER"));// burda new Customer dediğin için oluşan 4. eleman silinecektir.
        list.remove(engin);// dersek gerçekten de o objeyi siler
        for (Customer c:list){
            System.out.println(c.id);
        }
    }
}
