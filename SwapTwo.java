public class SwapTwo {

    public static void main(String[] args) {
        int a=12,b=34;

        System.out.println("Without Swap "+a+" "+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("With Swap "+a+" "+b);


    }
}
