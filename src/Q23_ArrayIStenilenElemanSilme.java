import java.util.ArrayList;

/*
Soru-3-Listede 15 veya 13 varsa, bu elemanları kaldırınız.
Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)
 */


public class Q23_ArrayIStenilenElemanSilme {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(31);
        list.add(15);
        list.add(13);
        list.add(54);


        System.out.println("ilk hali "+list);

        for (int i=0; i<=list.size()-1; i++
             ) {
            if (list.get(i)==13 || list.get(i)==15){
                list.remove(i);
            }
        }
        System.out.println("son hali "+list);
    }
}
