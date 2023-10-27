public class PrimeNumber {

    public static void main(String[] args) {

        int a=1,count=0;

        for (int i=1; i<=a; i++) {

            if (a % i == 0) {

                count += 1;

            }

        }
        if(count==2){

            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not prime Number");
        }
    }
}
