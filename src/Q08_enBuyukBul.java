import java.util.Scanner;

public class Q08_enBuyukBul {
    static int enBuyukSayi = 0;
    static int count = 0;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bes sayi giriniz her sayi girisinden sonra enter a basiniz");

        for(; count < 5; ++count) {
            int sayi = scan.nextInt();
            if (sayi > enBuyukSayi) {
                enBuyukSayi = sayi;
            }
        }

        System.out.println("En buyuk sayi: " + enBuyukSayi);
    }
}
