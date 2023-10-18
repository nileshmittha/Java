import java.util.Scanner;

public class dowhileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=0;
        do{
            System.out.println("Enter Value:");
            a=sc.nextInt();
            System.out.println(a);

        }while (a>0);
    }
}
