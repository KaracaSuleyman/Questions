import java.util.Scanner;

public class Q16_BasitKahveMakinasi {
    static int dogruGiris=0;
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        System.out.println("Hangi kahve turunu icmek istersiniz? \n\t1.Turk Kahvesi\n\t2.Filtre Kahve\n\t3.Espresso");
        String hangiKahve = scan.nextLine();


            if (hangiKahve.equalsIgnoreCase("Turk kahvesi")) {
                System.out.println("Turk Kahveniz hazirlaniyor...");
            } else if (hangiKahve.equalsIgnoreCase("Filtre Kahvesi")) {
                System.out.println("Turk Kahveniz hazirlaniyor...");
            } else if (hangiKahve.equalsIgnoreCase("Espresso")) {
                System.out.println("Espresso`nuz hazirlaniyor...");
            } else {
                System.out.println("Hatali tuslama yaptiniz..");
                System.out.println("Hangi kahve turunu icmek istersiniz? \n\t1.Turk Kahvesi\n\t2.Filtre Kahve\n\t3.Espresso");
               hangiKahve = scan.nextLine();

            }

        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):");
        String sut = scan.nextLine();
        if (sut.equalsIgnoreCase("Evet")) {
            System.out.println("Süt ekleniyor...");
        } else if (sut.equalsIgnoreCase("Hayir")) {
            System.out.println("Süt eklenmiyor...");
        } else {
            System.out.println("hatali tuslama yaptiniz");
        }

        System.out.println("Seker ister misiniz?");
        String seker = scan.nextLine();
        if (seker.equalsIgnoreCase("evet")) {

            System.out.println("Kaç şeker olsun?");
            int kacSeker = scan.nextInt();
            System.out.println(kacSeker + " seker ekleniyor");
        } else {
            System.out.println("Seker eklenmiyor");
        }
        String bosKod = scan.nextLine();

        System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)");
        String boyut=scan.nextLine();
        if (boyut.equalsIgnoreCase("Buyuk boy")) {
            System.out.println("Kahveniz "+boyut+" hazırlanıyor.");
        } else if (boyut.equalsIgnoreCase("orta boy")) {
            System.out.println("Kahveniz "+boyut+" hazırlanıyor..");
        } else if (boyut.equalsIgnoreCase("Kucuk boy")) {
            System.out.println("Kahveniz "+boyut+ " hazırlanıyor.");
        }
        System.out.println("");
        System.out.println("Siparis vermis oldugunuz "+hangiKahve+" "+boyut+" olarak hazirlaniyor\n\tAfiyet olsun");


    }


}

