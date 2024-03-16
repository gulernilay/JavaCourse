package Object_Oriented_Programming.composition;

public class ProductManager {

    public void add(Product product){

        ProductValidator pv=new ProductValidator();
        if(pv.isValid(product)){
            System.out.println("Eklendi");
        }
        System.out.println("Eklenemedi");


        // 2. yöntem : burda isValid de hata alıyoruz onun için isValid functionı static yap .
        if(ProductValidator.isValid(product)){
            System.out.println("Eklendi");
        }
        else{
            System.out.println("Eklenemedi");
        }
    }
}
