import java.util.Scanner;

class con{

    int a;

    public con(){

        Scanner  sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println(a);
    }
}

public class Constructor {
    public static void main(String[] args) {

        con c1=new con();


    }
}
