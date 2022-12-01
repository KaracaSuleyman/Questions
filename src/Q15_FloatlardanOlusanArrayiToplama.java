public class Q15_FloatlardanOlusanArrayiToplama {
    public static void main(String[] args) {
        float[] sayilar={1.0f, 2.5f,3.9f,8.7f};
        float sum=0;

        for (int i = 0; i < sayilar.length; i++) {
            sum+=sayilar[i];


        }
        System.out.println("Array`in elementleri toplami for loops ile cozumu "+sum);

        float toplam=0;
        int index=0;
        while (index<=sayilar.length-1) {
            toplam+=sayilar[index];
            index++;
        }
        System.out.println("Array`in elmentleri toplami while loops ile cozumu "+toplam);
         toplam=0;
        int flag= 0;

        do {
            toplam+=sayilar[flag];
            flag++;
        } while (flag<=sayilar.length-1);
        System.out.println("Array`in elmentleri toplami do while loops ile cozumu "+toplam);
    }
}
