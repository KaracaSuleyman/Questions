import java.util.Scanner;

public class Q17_BasitKelimeOyunu {
    static int ilkOyuncuPuan = 0;
    static int ikinciOyuncuPuan = 0;
    static String kelime1="";
    static String  kabulMu="";
    static String eklenenKelime="";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime1 = scan.nextLine();
        System.out.println("1. oyuncunun girdigi kelime " + kelime1);


        System.out.println("Girilen kelimeyi kabul ediyor musunuz? (Evet yada Hayir)");
        kabulMu = scan.nextLine();
        if (kabulMu.equalsIgnoreCase("evet")) {
            ikinciAdim(kabulMu);
        }else{}


        System.out.println("Ikinci oyuncu oyuna deva metmek istiyor musun? (Evet yada Hayir)");
        String devamMi = scan.nextLine();
        if (devamMi.equalsIgnoreCase("evet")) {
        }



        ucuncuAdim(devamMi);







    }

    public static void ikinciAdim(String kabulMu) {

        ilkOyuncuPuan += kelime1.length();
        System.out.println("ilk Oyuncunun puani: "+ ilkOyuncuPuan);

        }
    public  static void ucuncuAdim(String devamMi){

        Scanner scan= new Scanner(System.in);
        System.out.println("eklemek istediginiz kelimeyi giriniz");
         eklenenKelime=scan.nextLine();
        System.out.println("kelime basa mi sona mi eklensin?(basa sona)");
        String eklenecekYer=scan.nextLine();
        if (eklenecekYer.equalsIgnoreCase("sona")) {
            kelime1 = kelime1+eklenenKelime;
            System.out.println(kelime1);
        }
        else {
            kelime1 = eklenenKelime+kelime1;
            System.out.println(kelime1);
        }

    }

}