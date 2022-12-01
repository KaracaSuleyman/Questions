public class Q12_ArraySonHarftenIlkHarfYazdirma {
    public static void main(String[] args) {
        String[] str1 = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        String ilkHarfler = "";

        for(int i = 0; i < str1.length; ++i) {
            if (str1[i].endsWith("n") || str1[i].endsWith("k")) {
                ilkHarfler = ilkHarfler + str1[i].substring(0, 1);
            }
        }

        System.out.println(ilkHarfler);
    }

}
