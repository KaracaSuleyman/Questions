import java.util.Arrays;
/*
aysew ile fatmanin arrayde yerini degistiriniz
 */
public class Q14_ArraysStringYerDegistirme {
    public static void main(String[] args) {

        String[] isimler=new String[3];
        isimler[0]="Ayse";
        isimler[1]="Fatma";
        isimler[2]="Hayriye";


        System.out.println("Ilk hali "+Arrays.toString(isimler));

        String[] depo= new String[1];
        depo[0]=isimler[0];


        isimler[0]=isimler[1];
        isimler[1]=depo[0];


        System.out.println( "Yeni hali " +Arrays.toString(isimler));


    }
}
