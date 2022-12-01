import java.util.Scanner;

public class Q04_DikdortgenCevresiVeAlani {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Alanini Ogrenmek istediginiz \nDikdortgenin Kenar Uzunluklarini giriniz \nher veri girisinden sonra enter`a basiniz");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        System.out.println("Dikdortgenin Alani= " + kenar1 * kenar2);
    }
}
