import java.util.Scanner;

 class yoyo{

    int a;

    Scanner sc=new Scanner(System.in);

    int get(){
        a=sc.nextInt();
        return 0;

    }

    int print(){

        System.out.println(a);
        return 0;
    }
}

public class NewClass {

    public static void main(String[] args) {

        yoyo y1=new yoyo();
        y1.get();
        y1.print();

    }
}
