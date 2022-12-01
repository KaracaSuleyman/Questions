import java.util.ArrayList;
/*
*
    Problem Tanımı :
    parametre olarak Integer Arraylist alan ve return type int olan hillNum isminde br method yazınız
    method ; kendinden önceki sayıdan küçük kendinden sonrakinden büyük olan sayıyı yazdırsın
    Test data:
    input : ArrayList 5,4,6,2,1
    output : 2
    2; 6 dan küçük 1 den büyük

 */

public class Q18_ArrayListElementler {
    static int sonuc;
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();

        list.add(5);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(1);
      System.out.println(list);
        System.out.println("Beklenen sayi");
        System.out.println(hillNum(list));


    }


    public static int hillNum(ArrayList<Integer> list){

        for (int i = 1; i <= list.size()-2; i++) {
            if (list.get(i)>list.get(i+1) || list.get(i)< list.get(i-1)){
                   sonuc=list.get(i);
            }
        }
        return sonuc;
    }

}
