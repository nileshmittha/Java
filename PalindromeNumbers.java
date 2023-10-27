public class PalindromeNumbers {

    public static void main(String[] args) {
        int a=55,rev=0;
//        int temp=0;

            int t=a;
            while(a>0) {
                int temp = a % 10;
                a = a / 10;
                rev = (rev * 10) + temp;
            }
            int reverse=rev;

        System.out.println(reverse);


        if(t==rev){

            System.out.println("Yes");

        }else{

            System.out.println("NO");
        }

    }
}
