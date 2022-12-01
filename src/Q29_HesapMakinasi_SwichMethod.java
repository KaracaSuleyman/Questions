import java.util.Scanner;

public class Q29_HesapMakinasi_SwichMethod {



 /*
     Basit 4 işlem yapan bir hesap makinesi kodlayınız....
  Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
  Kullanicidan iki sayi girmesini isteyiniz.
  Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
     */

    public static void main(String[] args) {

        hesapMak();


    }

    public static void hesapMak() {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("Yapmak istediginiz islem icin ilgili sembolu seciniz:"+
                "\nToplama icin \"+\" \nCikarma icin \"-\" \nCarpma icin \"*\" \nBolme icin \"/\" sembolünü girmelisiniz: ");

        char islem=scan.next().charAt(0);
        double sonuc=0;
        switch (islem){
            case '+':
                sonuc =sayi1+sayi2;
                System.out.print("Iki sayini toplami : "+sonuc);
                break;
            case '-':
                sonuc =sayi1-sayi2;
                System.out.print("Iki sayini farki : "+sonuc);
                break;

            case '*':
                sonuc =sayi1*sayi2;
                System.out.print("Iki sayini carpimi : "+sonuc);
                break;
            case '/':
                sonuc =sayi1/sayi2;
                System.out.print("Iki sayini bolümü : "+sonuc);

                if (sayi2==0){
                    System.out.println("Bu islem matematiksel olarak gecersizdir.");

                } break;
            default:
                System.out.println("Hatali giris yaptiniz, sembol ile islem yapmalisiniz. Lütfen bastan baslayiniz");
                hesapMak();
                break;

        }

    }
}

