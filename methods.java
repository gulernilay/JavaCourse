public class methods {
    // Access modifiers: public-private-protected(sınıf içi veya subclass)-default( sadece aynı package içinden)
    // void: sadece değer döndürür, belirli işlemler gerçekleştrimez
    //static : bir metotun veya değişkenin sınıfa ait olduğunu , instance oluşturulmadan da kullanılabileceğini belirtir.
    // camel casing : method isimleri küçükharfle başlar büyükharfle devam eder
    public static void main(String[] args) {
    welcome();
    topla2(1,2,3,4,1234,3456);
    }
    public static void welcome(){
        System.out.println("Hoşgeldiniz.");
        getName("Nilay");
    }
    public static void getName (String name){
        System.out.println("My name is " + name);
        return; // bitir demek
    }
    public int random(){
        return (int) (Math.random()*100);
    }
    public  double toplama(double a,double b){ // double tipinde değer döndürür
        return a+b;
    }
    // Variable arguments:
    public static int topla2(int... sayılar){ // istediğim kadar saygı gönderebilirim
        int toplam=0;
        for(int sayı:sayılar){
            toplam+=sayı;
        }
        return toplam;
    }




}
