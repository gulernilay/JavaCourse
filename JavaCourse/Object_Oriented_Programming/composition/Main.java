package Object_Oriented_Programming.composition;

public class Main {
    public static void main(String[] args) {
     ProductManager pm =new ProductManager();
     Product product=new Product();
     product.price=10;
     product.name="mouse";
     pm.add(product);
    }
}
/*
Static: main de çağırılanlar hepsi static olmalı
static tanımlamalarda new Manager() oluşturduğumuzda işimziz bittiğinde bellekten atılır ondan dolayı static olduğunda bellekten atılmaz.Bir kez yaratılıp defalarca o nesnenin kullanılmasını sağlar
Manager sınıfları asla static yapılmaz.
Metotu static yaptığınızda class ismi ile direk çağırılır.
ProductManager classında ProductValidator.isValid çağırılması için isValid static yapılmalıdır.Static yapılmazsa ProductManager içinde ProductValidator nesnesi yaratılıp çağırılmak zorunda kalınır.
Kısaca static metotlar direk class ismi ile çağıırlırlar.
ProductVALİDATOR içinde constructor yaratırsak sadece new () leyince çalışır .ProductManager içinde constructor çalışmaz .ProductValidator pv=new ProductVALİDATOR() yaparsak constructor çalışır ve içindeki sout bastırılır.New lememek için ProductValidator içinde
static{sout } yazılarak çalıştırılır.
Ana classlar static olamaz mesela ProductManager ama içine innerclass yaratırsak static olabilir.
Ancak innerclasslar ve innerclasslara atanan static metotlar çok önerilmez. */
