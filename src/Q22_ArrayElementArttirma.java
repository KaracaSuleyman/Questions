import java.util.ArrayList;
/*

Soru-2-Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)
 */
public class Q22_ArrayElementArttirma {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(31);
        list.add(7);
        list.add(13);
        list.add(10);
        System.out.println(list);
        for (Integer i=0 ; i<= list.size()-1; i++)
            if ((list.get(i)==7 || list.get(i)==10)){

            }else {
                list.set(i, list.get(i)+2);
            }
        System.out.println(list);
        }

}


