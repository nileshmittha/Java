import java.util.Scanner;
//import java.util.*;

public class ScannerClass {

    public static void main(String[] args) {
        int age;
        byte f;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Numbers:");
        age=scan.nextInt();
        f=scan.nextByte();
        long l=scan.nextLong();
//        String str=scan.next();
        String ring=scan.nextLine();




        System.out.println(age);
        System.out.println(f);
        System.out.println(l);
//        System.out.println(str);
        System.out.println(ring);





    }
}
