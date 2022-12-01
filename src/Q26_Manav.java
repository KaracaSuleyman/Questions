import java.util.Scanner;

public class Q26_Manav {
    /*
     /*
    MANAV SORUSU

* Basit bir 5 ürünlü manav alisveris programi yaziniz.
     * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
     * 2. Adim : Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
     * 3. Adim :Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
     * 4. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
     * 5. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
      */
    static double elma = 10.99;
    static double armut = 12.99;
    static double portakal = 14.99;
    static double muz = 25.99;
    static double mandalina = 8.50;
    static double toplam=0;
    static int hangiUrun;
    static int kacKilo;
    static  double toplamTutar=0;
    static Scanner scan = new Scanner(System.in);
    static String secim="evet";

    public static void tutar(){

        System.out.println("Lutfen hangi urunu almak istediginizi seciniz" +
                "\n\t elma icin:      1" +
                "\n\t armut icin      2" +
                "\n\t portakal icin   3" +
                "\n\t muz icin        4" +
                "\n\t mandalina icin  5");

        hangiUrun= scan.nextInt();
        System.out.println("kac kilo alamak istediginizi giriniz");
        kacKilo= scan.nextInt();

        if (hangiUrun==1){
            toplam=elma*kacKilo;
        }else if (hangiUrun==2){
            toplam=armut*kacKilo;
        }else if (hangiUrun==3){
            toplam=portakal*kacKilo;
        } else if (hangiUrun==4){
            toplam=muz*kacKilo;
        } else if (hangiUrun==5) {
            toplam=mandalina*kacKilo;
        }else
            System.out.println("Yanlis giris");

        System.out.println("tutar: "+ toplam);


    }


        public static void main(String[] args) {



            while (secim.equalsIgnoreCase("evet")){
                tutar();
                toplamTutar += toplam;
                String bosKod = scan.nextLine();
                System.out.println("Baska urun eklemek istermisiniz?");
                secim = scan.nextLine();

            }
            System.out.println("toplam tutar: "+toplamTutar);

    }


}
