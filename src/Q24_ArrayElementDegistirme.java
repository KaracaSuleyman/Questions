import java.util.ArrayList;
/*

Soru-4-Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)
 */

public class Q24_ArrayElementDegistirme {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(11);
        list.add(15);
        list.add(34);
        list.add(43);
        System.out.println("Array ilk hali: "+list);
        for (int i = 0; i <= list.size()-1; i++) {
            if (list.get(i)==15) {
                list.set(i,51);

            }
        }
        System.out.println("Array son hali: "+list);
    }
}
