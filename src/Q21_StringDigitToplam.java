


/*
SORU-1- String bir listede verilen tüm fiyatların toplamını bulunuz.
Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04
 */


import java.util.ArrayList;
import java.util.List;

public class Q21_StringDigitToplam {
    public static void main(String[] args) {
        double toplam=0;
        List<String> myList =new ArrayList<>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$54.45");
        System.out.println(myList);
        System.out.println("");
        for (String each : myList
        ) {
            each=each.replaceAll("[A-Z,a-z,$,€,£,₺]","");
            toplam+=Double.parseDouble(each);
        }
        System.out.printf("List icindeki fiyatlarin toplami "+"%.2f",toplam);
        System.out.print("$");

    }
}
