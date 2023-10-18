import java.util.Scanner;

public class MarksPercentage {

    public static void main(String[] args) {
        int m1,m2,m3,m4,m5;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Marks:");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        m4=sc.nextInt();
        m5=sc.nextInt();

        int total=m1+m2+m3+m4+m5;

        float per=(total*100)/500f;

        System.out.println(per);
    }
}
