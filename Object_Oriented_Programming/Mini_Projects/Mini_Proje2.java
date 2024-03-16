package Mini_Projects;

public class Mini_Proje2 {
    public static void main(String[] args) {
        // bir harfin kalın sesli harf mi ince sesli harfmi bulma
        // kalın sesli : a,ı ,o ,u / ince sesli : e, i, ö, ,ü
        char a = 'ü';
        inceSesli(a);
    }

    public static void inceSesli(char a) {
        char[] inceSesliler = {'e', 'i', 'ö', 'ü'};
        int counter = 0;
        for (char h : inceSesliler) {
            if (a == h) {
                counter++;
            }
        }
        if (counter != 0) {
            System.out.println("İnce sesli harfdir.");
        } else {
            kalınSesliler(a);
        }
    }

    public static void kalınSesliler(char a) {
        char[] kalınSesliler = {'a', 'ı', 'o', 'u'};
        int counter = 0;
        for (char g : kalınSesliler) {
            if (a == g) {
                counter++;
            }
        }
        if (counter != 0) {
            System.out.println("Kalın sesli harfdir.");
        } else {
            System.out.println("İnce veya kalın sesli harf değildir.");
        }
    }
}
