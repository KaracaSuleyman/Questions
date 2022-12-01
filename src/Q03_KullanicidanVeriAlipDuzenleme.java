import java.util.Scanner;

public class Q03_KullanicidanVeriAlipDuzenleme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Isminizi Giriniz:");
        String isim = scan.next();
        System.out.println("Lutfen Soyisminizi Giriniz");
        String sayisim = scan.next();
        System.out.println("Lutfen Yasinizi giriniz");
        double yas = scan.nextDouble();
        System.out.println("Isminiz: " + isim + "\nSoyisim: " + sayisim + "\nYas: " + yas);
    }
}
