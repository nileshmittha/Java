import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        int ch,n1=10,n2=4;



        System.out.println("Enter U r Choice");

        System.out.println("1:Addition");
        System.out.println("2:Substraction");
        System.out.println("3:Multiplication");

        Scanner sc=new Scanner(System.in);
        ch=sc.nextInt();


        switch(ch){

            case 1:

                System.out.println(n1+n2);
                break;


            case 2:
                System.out.println(n1-n2);
                break;


            case 3:
                System.out.println(n1*n2);
                break;


            default:
                System.out.println("Please Enter Valid options!!!");
                break;
        };

    }
}
