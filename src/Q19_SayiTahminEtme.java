import java.util.Random;
import java.util.Scanner;
/*
Sayı tahmin etme oyunu....
Bilgisayardan rastgele(random class kullanılarak) 0-100 arasında bir sayı alıp kullanıcının
tahminini her defasından büyük-kücük yönlendirerek rastgele sayiyi bulmasını sağlayan kod yazınız.

 */



public class Q19_SayiTahminEtme {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random rnd=new Random();
        System.out.println("Lutfen sayiyi tahmin etmeye calisiniz");
        int tahmin= scan.nextInt();
        int count=0;

        int sayi= rnd.nextInt(101);
        while(sayi!=tahmin){
            if (tahmin<0 || tahmin>101){
                System.out.println("Lutfen 0 ile 100 arasinda bir sayi giriniz");
                tahmin=scan.nextInt();
                count++;
            }else if (tahmin<sayi){
                System.out.println("Daha buyuk sayi gir");
                tahmin=scan.nextInt();
                count++;
            } else  {
                System.out.println("Daha kucuk bir sayi gir");
                tahmin=scan.nextInt();
                count++;
            }

            }

        System.out.println("Tebrikler "+ count+". denemede kazandiniz!");


        }

}


