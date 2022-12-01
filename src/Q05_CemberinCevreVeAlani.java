import java.util.Scanner;

public class Q05_CemberinCevreVeAlani {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Cemberin Yaricapini Giriniz: ");
        double yaricap = scan.nextDouble();
        System.out.println("Cemerin:\nAlani= " + 3.14 * yaricap * yaricap + "\nCevresi= " + yaricap * 2.0 * 3.14);
    }
}
