import java.util.Locale;

public class Main2 {
    // ARRAY  + STRING
    public static void main(String[] args) {
        double[] array1={2.4,5.4,1.8,6.2};
        double sum= 0.0;
        double min=array1[0];
        double max=0;
        for (Double array:array1){
            sum= sum + array;
            System.out.println(array);
            if(array>max){
                max=array;
            }
            if(array<min){
                min=array;
            }
        }
        System.out.println("Sum of array elements : " + sum);
        System.out.println("Max element is : " + max);
        System.out.println("Min element is : " + min);

        String[][] sehirler=new String[2][2];
        sehirler[0][0] ="İzmir";
        sehirler[0][1]="Buca";
        sehirler [1][0]="Balıkesir";
        sehirler[1][1]= "Merkez";
        for(int a=0;a<2;a++){
            for(int b=0;b<2;b++){
                System.out.println("Eleman :" + sehirler[a][b]);
            }
        }
        //
        System.out.println(" STRING ÇALIŞMA PARTI ----------------------------------------------------------------");
        String mesaj="Çok güzelsin";
        char[] mesaj1=mesaj.toCharArray();
        for(char c:mesaj1){
            System.out.println(c);
        }
        System.out.println(mesaj1[4]);
        System.out.println(mesaj.charAt(4)); // 5.karakteri basar
        System.out.println("Length of mesaj" + mesaj1.length);
        System.out.println(mesaj.concat("Nilay")); // 2 stringleri birleştirir
        System.out.println(mesaj.startsWith("T"));
        System.out.println(mesaj.endsWith("k"));
        // java case sensitive bir programlama dilidir.
        char[] mesaj2= new char[5];
        mesaj.getChars(0,4,mesaj2,0);
        mesaj.indexOf("ü");//ü harfi kaçıncı karakter,ilk bulduğu ü
        mesaj.lastIndexOf("ü");// aramaya sondan başlar sağdan
        mesaj.replace("o","h");
        System.out.println("--------------------------");
        String a=mesaj.substring(5);// 5. indexden itibaren keser
        System.out.println(a);
        String b= mesaj.substring(5,9); // 5-9.charlar arası keser
        System.out.println(b);
        for(String kelime: mesaj.split("")){
            System.out.println(kelime + "");
            // boşluklara göre kelimeleri ayırıp basar
        }
        mesaj.toLowerCase();
        mesaj.toUpperCase();
        mesaj.trim(); //boşlukları atar












    }
}
