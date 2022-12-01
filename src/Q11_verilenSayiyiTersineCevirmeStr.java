import java.util.Scanner;

public class Q11_verilenSayiyiTersineCevirmeStr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi = scan.nextInt();
        String tersStr = "" + sayi;
        tersCevir(tersStr);
    }

    public static void tersCevir(String tersStr) {
        String ters = "";

        for(int i = tersStr.length() - 1; i >= 0; --i) {
            ters = ters + tersStr.charAt(i);
        }

        System.out.println("girilen sayinin tersi:\n" + ters);
    }
}
