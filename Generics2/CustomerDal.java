package Generics2;

public class CustomerDal implements IEntityRepository<Customer> {
    @Override
    public void add(Customer entity) {

    }

    @Override
    public void delete(Customer entity) {

    }

    @Override
    public void update(Customer entity) {

    }
}
/*
Generic Yapıyı kullanarak müşteri - product tablosuna ait select,delete,update veri tabanı işlemleri ayrı ayrı yapılabilir.
Generic Constraints:Kullanılacak tipler kısıtlanabilir.
Customer ve Product objeleri veri tabanına gönderilecek objelerdir.IEntityRepository<Customer> şu kısımda doğru veri tabanı tipleri yer almalıdır. Peki hangisi veritabanı nesnesi nasıl anlaşılır
IEntity interfaceinde
 */
