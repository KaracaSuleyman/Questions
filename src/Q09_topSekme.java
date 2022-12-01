import java.util.Scanner;

public class Q09_topSekme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Topun atildigi yuksekligi cm cinsinden giriniz");
        double yukseklik = scan.nextDouble();
        double toplamYol = 0.0;
        int count = 0;

        do {
            ++count;
            toplamYol += yukseklik;
            yukseklik *= 0.75;
            toplamYol += yukseklik;
        } while(yukseklik > 100.0);

        System.out.println("toplam alinan yol: " + toplamYol + " ziplama sayisi: " + count);
    }
}
