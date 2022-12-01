import java.util.Scanner;

public class Q02_DoubleIleIntSayininCarpimiVeToplami {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Ondalik Sayi Giriniz");
        double ondalik = scan.nextDouble();
        System.out.println("Lutfen Bir tam Sayi Giriniz");
        int sayi = scan.nextInt();
        System.out.println("Sayilarin;\nToplami: " + (ondalik + (double)sayi) + "\nCarpimi: " + ondalik * (double)sayi);
    }
}

