import java.util.Random;
import java.util.Scanner;

public class StonePaperScissorGame {

    public static void main(String[] args) {

        Random rand=new Random();

        System.out.println("Enter Choice:");

        System.out.println("1:Stone");
        System.out.println("2:Paper");
        System.out.println("3:Scissor");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();


        switch (ch){

            case 1:
                int n1=rand.nextInt(3)+1;
                int n2=rand.nextInt(3)+1;

                if(ch<n1){

                }



        }

    }
}
