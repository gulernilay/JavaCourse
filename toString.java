public class toString {
    String name;
    String author;
    int year;

    toString(String name,String author,int year){
        this.author=author;
        this.name=name;
        this.year=year;
    }

    public String toString(){
        return (" Kitap ismi : " +name + " Kitap yazarı : " +author  + " Kitap Çıkış Yılı :" + year );
    }

    public static void main(String[] args) {
        toString t1=new toString("jfg","jh",4);
        t1.toString();
    }
}
