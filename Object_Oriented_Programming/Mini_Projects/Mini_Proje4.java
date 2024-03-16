package Mini_Projects;

public class Mini_Proje4 {
    public static void main(String[] args) {
        // arkadaş sayı bulma :220 284

        int c=220;
        int[] array1=new int[220];
        int total1=0;

        int b=284;
        int[] array2=new int[284];
        int total2=0;

        for(int a=1;a<=c;a++){
            if(c%a==0){
                array1[a-1]=a;
            }
        }
        for(int bölenler:array1){
            System.out.println(bölenler);
            total1 +=bölenler;
        }
        System.out.println("-----------------");
        for(int a=1;a<=b;a++){
            if(b%a==0){
                array2[a-1]=a;
            }
        }
        for(int bölenler:array2){
            System.out.println(bölenler);
            total2 +=bölenler;
        }
        System.out.println("---------------");

        if((total1-c)==b && (total2-b)==c){
            System.out.println("Arkadaş sayılardır");
        }
        else{
            System.out.println("Arkadaş sayılar değillerdir.");
        }



    }
}
