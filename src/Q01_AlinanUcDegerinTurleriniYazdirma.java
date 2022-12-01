import java.util.Scanner;

public class Q01_AlinanUcDegerinTurleriniYazdirma {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Bir tam sayi giriniz");
        int tamsayi = scan.nextInt();
        System.out.println("Lutfen bir ondalik sayi giriniz");
        double ondalik = scan.nextDouble();
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.next();
        System.out.println("Girdiginiz veriler:\nTam Sayi: " + tamsayi + "\nOndalik Sayi: " + ondalik + "\nKelime: " + kelime);
    }
}


