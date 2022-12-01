import java.util.Scanner;

/*
rasgele sifre olusturma
 */

public class Q26_RandomPassWord {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen kac haneli sifre olusturmak istediginizi giriniz");
        int password= scan.nextInt();
        System.out.println(getpassword(password));
    }





     public static String getpassword(int n){
        String text="ABCDEFGHIJKLMNOPRSQVWYZ"+"abcdefghijklmnopqwrvyz"+"1234567890"+"!@#$%^&*-_+?.>,<";
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {


            int index=(int)(text.length()*Math.random());
            sb.append(text.charAt(index));
        }
        return  sb.toString();

    }
}
