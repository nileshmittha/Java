import java.util.Scanner;

public class reverseString {

    public static void main(String[] args) {


       int[] arr={34,24,45,56,3,4,5};
//       int[] sor=new int[5];
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Array Elements:");




        for (int i=0; i<arr.length; i++){

            for (int j=i+1;j<arr.length;j++){

                if(arr[i]>arr[j]){
                   int temp;


                   temp=arr[j];

                    arr[j]=arr[i];
                    arr[i]=temp;

                }


            }





        }


        for (int i=0; i<arr.length; i++){

            System.out.print(arr[i]+" ");

        }
    }
}
