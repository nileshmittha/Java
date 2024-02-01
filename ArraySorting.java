import java.util.Scanner;

public class ArraySorting {

    public static int[] GetArray(int n){
        int[] arr=new int[100];
        Scanner sc=new Scanner(System.in);

        for(int i = 0; i < n ; i ++){
            System.out.println("Enter "+i+" th elements:");
            arr[i]=sc.nextInt();

        }
        return arr;

    }

    public static void main(String[] args) {

        int size;
        System.out.println("Enter Array Size:");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();

        int[] array=(GetArray(size));

        for(int i=0;i<size;i++){

            for(int j=i+1;j<size;j++){

                if(array[i]>array[j]) {


                    array[i] = array[i] + array[j];
                    array[j] = array[i] - array[j];
                    array[i] = array[i] - array[j];
                }
            }
        }
        int h=0;
        for(int el:array) {
            h = h + 1;
            System.out.println(el);
            if (h == size) {
                break;
            }
        }

    }
}
