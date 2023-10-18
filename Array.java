import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        int [] marks=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++){

            marks[i]=sc.nextInt();
        }

//        for (int i=4;i>1;i--){
//
//            System.out.println(marks[i]);
//        }

        for(int el:marks){

            System.out.println(el);
        }


    }
}
