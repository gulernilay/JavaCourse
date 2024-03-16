package Object_Oriented_Programming.composition;
// ürün ekleme ve güncellemede kurallara uygunmu diye kontrol edilir bu classda
public class ProductValidator {
    public static boolean  isValid(Product product){
         if(product.price>0 && !product.name.isEmpty()){
             // eğer veritabanına eklenmek istenen product ismi var ve price >0 ise eklenir
             return true;
         }
         else{
             return false;
         }
    }
}

