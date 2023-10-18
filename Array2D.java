import java.util.Scanner;

public class Array2D {


    public static void main(String[] args) {

        int [][]internal=new int[2][3];

        int []marks={10,20,30};

        Scanner sc=new Scanner(System.in);

//        for (int i=0;i<(internal.length); i++){
//            for (int j=0;j<(internal[i].length);j++){
//
//                internal[i][j]=sc.nextInt();
//
//
//            }
//
//        }



        for (int i=0;i<(internal.length); i++) {
            for (int j = 0; j < (internal[i].length); j++) {

                System.out.print(internal[i][j]+" ");


            }

            System.out.println();

        }


        for (int i=0;i<(marks.length); i++) {


            System.out.println(marks[i]);

        }


    }
}
