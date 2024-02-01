import java.util.Scanner;

public class FindSmallestElementInArray {



    public static int[] GetArray(int n){

        int[] arr=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Elements:");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public static int MiniMum(int[] array,int s){

        int min=array[0];

        for(int i=0;i<s;i++){

                if(array[i]<min){

                    min=array[i];
                }

        }

        return min;


    }

    public static void main(String[] args) {

//        =new int[]
        int size;
        System.out.println("Enter Size:");
        Scanner sc=new Scanner(System.in);

        size=sc.nextInt();


        int[] arr=GetArray(size);
        int MINIMUM=MiniMum(arr,size);
        System.out.println("MiniMim Value from the Array: "+MINIMUM);




    }
}
