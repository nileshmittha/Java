public class pattern5 {


    public static void main(String[] args) {
        

        // i for loop for rows
        for(int i=1; i<=4; i++){


            //j for loop for spaces

            for(int j=1; j<=4-i; j++){

            

                System.out.print(" ");
            }

            // u for loop for *

            for(int u=1; u<=i; u++){

            System.out.print("*");

            }
            System.out.println();
        }
    }
    
}
