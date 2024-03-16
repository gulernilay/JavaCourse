package Polymorphism;

public class Main {
    public static void main(String[] args) {
      BaseLogger[] bg=new BaseLogger[]{ new EmailLogger(),new DatabaseLogger(),new FileLogger()}; // burda mesela tek tek array yaratmaktansa tek bir class array
        for(BaseLogger bg2:bg){
          System.out.println(bg2.Log(35));
          // burda hem Email objesi hem File objesi hem Database objesi için basar=polymorphism
      }
        EmailLogger eg=new EmailLogger();
      eg.Log(56); //Polymorphism örneği :overwriding( BaseLoggerdaki metot diğer classlarda da kullanılabilir.

      CustomerManager cm=new CustomerManager(new DatabaseLogger()); // polymorphism
        cm.Add();



    }

}
// DatabaseLogger logger= new Logger() gibi şeylerden uzak durmalıyız. Çünkü değişime açık bir yapı değil
// mesela her yerde base logger ile çalışırsan Filelogger,DatabaseLogger objeleri gelir

