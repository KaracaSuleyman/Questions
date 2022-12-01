import java.util.Scanner;
/*

SIFRE OLUSTURMA

* bir sifre olusturunuz ozellikleri sirasi ile soyle olmalidir;
 1_uzunlugu => en az 10 karakter(chars) olmalidir
 2_en az 1 sembol bulundurmali
 3_en az 1 numara bulundurmali
 4_en az buyuk harf olmalidir
 5_en az bir kucuk harf olmalidir

 */

public class Q25_SifreOlusturma {
          static  Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Lutfen Sifre Giriniz" +
                "\n Sifreniz en az " +
                "\n10 karakter olmali " +
                "\nbir buyuk harf icermeli " +
                "\nbir kucuk harf icermeli" +
                "\nrakam icermeli" +
                "\nozel karakter icermeli  ");
        String password = scan.nextLine();



        passwordCheck(password);
    }
    public static void passwordCheck(String password) {
        int upLetterCount = 0;
        int lowLetterCount = 0;
        int numericCount = 0;
        int specialCount = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (upLetter(ch)) upLetterCount++;
            else if (lowLetter(ch)) lowLetterCount++;
            else if (numeric(ch)) numericCount++;
            else if (special(ch)) specialCount++;

        }
        if (password.length() > 10 && upLetterCount >= 1 && lowLetterCount >= 1 && numericCount >= 1 && specialCount >= 1) {
            System.out.println("Sifreniz dogru");
        } else {
            System.out.println(" \n Sifreniz en az "  +
                               "\n10 karakter olmali " +
                               "\nbir buyuk harf icermeli " +
                              "\nbir kucuk harf icermeli" +
                              "\nrakam icermeli" +
                             "\nozel karakter icermeli");
             password=scan.nextLine();
            System.out.println("Lutfen Sifrenizi Tekrar giriniz");

        }



    }
    public static boolean upLetter(char ch)
    {

        return (ch >= 'A' && ch <= 'Z') ;
    }
    public static boolean lowLetter(char ch)
    {

        return (ch >= 'a' && ch <= 'z');
    }


    public static boolean numeric(char ch)
    {
        return(ch >= '0' && ch <= '9');
    }
    public static boolean special(char ch)
    {
        return(ch >= 33 && ch <= 176);
    }

}
