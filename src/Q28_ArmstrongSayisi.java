import java.util.Scanner;

public class Q28_ArmstrongSayisi {

    /*

ARMSTRONG SAYI

Bir sayı, her basamağının küpünün toplamına eşitse Armstrong sayısı olarak adlandırılır.
Örneğin, 153, her basamağın küpüne eşit olan 153= 1 + 125 + 27 olduğundan bir
Armstrong sayısıdır. Verilen numaranın Armstrong sayısı olup olmadığını kontrol etmek
için bir kod yazınız

     */
    public static void main(String[] args) {

        int basamakBulma,basamakDegeriHesaplama, basamak=0, toplam=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        basamakBulma=sayi;
        while (basamakBulma>0){
            basamakBulma/=10;
            basamak++;
        }
        basamakDegeriHesaplama=sayi;
        while (basamakDegeriHesaplama>0){
            int basamakDegeri=basamakDegeriHesaplama%10;
            basamakDegeriHesaplama/=10;
            toplam+=Math.pow(basamakDegeri,3);
        }
        if (sayi==toplam)
            System.out.println(sayi+" sayisi bir armstrong sayidir");
        else
            System.out.println(sayi+ " sayisi bir armstrong sayi degildir");


    }
}
