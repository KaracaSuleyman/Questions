import java.util.Scanner;

public class Q07_bolmeOperatorsuzislem {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bolunen sayiyi giriniz");
        int bolunen = scan.nextInt();
        System.out.println("bolen sayiyi giriniz");
        int bolen = scan.nextInt();
        System.out.println(bol(bolunen, bolen));
    }

    public static int bol(int bolunen, int bolen) {
        for(int bolum =0; bolunen >= bolen; ++count) {
            bolunen -= bolen;
        }

        return count;
    }
}
