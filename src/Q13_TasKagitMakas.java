import java.util.Random;
import java.util.Scanner;

public class Q13_TasKagitMakas {
    /*
    kullanicidan tas makas kagit icin secmesini isteyip pc ye karsi oynayin
     */
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        Random random=new Random();
        random.nextInt(3);

        int userChose=0;
        int compChose=0;
        int user=0;
        int comp=0;


        do {
            System.out.println("\t**********************\n\tPlease make your chose: \n\tfor Rock 1\n\tfor Paper 2\n\tfor Scissors 3\n\t**********************");
            userChose=scan.nextInt();
            compChose=random.nextInt(3)+1;
            System.out.println(compChose);

            if (userChose==1 && compChose==2) {
                comp++;
                System.out.println("Paper wraps Rock =====> Computer +1");
                System.out.println("User="+user + " vs Computer "+comp);
            } else if (userChose==1 && compChose==3) {
                user++;
                System.out.println("Rock smashs Scissors ====> User +1");
                System.out.println("User="+user + " vs Computer "+comp);
            } else if (userChose==2 && compChose==1) {
                user++;
                System.out.println("Paper wraps Rock =====> User +1");
                System.out.println("User="+user + " vs Computer "+comp);
            }  else if (userChose==2 && compChose==3) {
                System.out.println("Scissors cut Paper ====> Computer +1");
                System.out.println("User="+user + " vs Computer "+comp);
                comp++;
            } else if (userChose==3 && compChose==1) {
                System.out.println("Rock smashs Scissors ====> Computer +1");
                System.out.println("User="+user + " vs Computer "+comp);
                comp++;
            } else if (userChose==3 && compChose==2) {
                System.out.println("Scissors cut Paper ====> User +1");
                System.out.println("User="+user + " vs Computer "+comp);
                user++;
            }else {
                System.out.println("It`i a tie!");
            }

        }while (user !=5 && comp !=5);
        {
            if (user>comp) {
                System.out.println("**********************");
                System.out.println("You are the Winner!!");
            }
            else System.out.println("Sorry,You are Lost!");
        }

















    }
}
