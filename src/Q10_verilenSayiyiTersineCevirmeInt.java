import java.util.Scanner;

public class Q10_verilenSayiyiTersineCevirmeInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi = scan.nextInt();
        tersineCevir(sayi);
    }

    public static void tersineCevir(int sayi) {
        int yedeksayi;
        for(yedeksayi = 0; sayi > 0; sayi /= 10) {
            yedeksayi = sayi % 10 + yedeksayi * 10;
        }

        System.out.println("girilen sayinin tersi: " + yedeksayi);
    }
}

