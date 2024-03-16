package Object_Oriented_Programming.composition;

public class Example {
}


class Book{
    Yazar yazar;
    Yayınevi yayınevi;
    int numPage;
    String title;

    public Book(Yazar yazar,Yayınevi yayınevi,int numPage,String title){
        this.yazar=yazar;
        this.yayınevi=yayınevi;
        this.numPage=numPage;
        this.title=title;
    }

    public static void printInfo(Yazar yazar,Yayınevi yayınevi,int numPage,String title){
        System.out.println(yazar.name);
        System.out.println(yazar.surname);
        System.out.println(yayınevi.kurulusYılı);
        System.out.println(yayınevi.name);
        System.out.println(numPage);
        System.out.println(title);


    }
    public static void main(String[] args) {

        Yayınevi y1 =new Yayınevi("Ata",1890);
        Yazar y2=new Yazar("FJK","DFJL");
        Book b1 =new Book(y2,y1,67,"dgdgfg");


    }


}
class Yazar{
    public String name;
    public String surname;

    public Yazar(String name,String surname){
        this.name=name;
        this.surname=surname;
    }

}
class Yayınevi{
    public String name;
    public int kurulusYılı;

    public Yayınevi(String name,int kurulusYılı){
        this.name=name;
        this.kurulusYılı=kurulusYılı;
    }

}
