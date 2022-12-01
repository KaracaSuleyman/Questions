import java.util.Arrays;
import java.util.Scanner;

public class Q29_AnagramString {

    /*
    Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa
konsola "Anagramdır" yazdırın. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.
Örneğin; "Mary" ve "army" ve "RAMY" Anagramlardır.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen anagram icin karsilastirmak istediginiz ilk sayiyi giriniz");
        String ilkKelime= scan.nextLine();
        System.out.println("Lutfen anagram icin karsilastirmak istediginiz ikinci sayiyi giriniz");
        String ikinciKelime= scan.nextLine();
        String[] ilkarr=ilkKelime.split("");
        String[] ikinciarr=ikinciKelime.split("");

        Arrays.sort(ilkarr);
        Arrays.sort(ikinciarr);
        if (ilkarr.length==ikinciarr.length){
        for (int i = 0; i < ilkarr.length; i++) {
            if (ilkarr[i].equals(ikinciarr[i])){
                continue;
            }
        }
        System.out.println(ilkKelime+" ve "+ikinciKelime+ " anagramdir");
            }
        else {
                System.out.println(ilkKelime+" ve "+ikinciKelime+ " anagram degildir");
        }

    }
}

