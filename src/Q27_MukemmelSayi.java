import java.util.Scanner;
/*
MUKEMMEL SAYI

Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
		//Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse,
		//herhangi bir sayı Mükemmel Sayı olarak bilinir.
		//Input :6
		//Output:6 Mukemmel Sayidir.
		//======================
		//Input7
		//Output:	7 Mukemmel Sayidir degildir.
 */

public class Q27_MukemmelSayi {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        for(int i = 1; i < sayi; i++)
        {
            if(sayi % i == 0) {
                toplam += i;
            }
        }
        if(sayi == toplam) {
            System.out.println(sayi + " Mükemmel bir sayidir");
        }
        else {
            System.out.println(sayi + " Mükemmel bir sayi degildir.");
        }
    }
}
