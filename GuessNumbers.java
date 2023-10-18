import java.util.Random;
import java.util.Scanner;

class Game{

    int noOfGuess=0,userNumber,comp;
    Scanner scv=new Scanner(System.in);

    Game(){
        Random rand=new Random();

        comp=rand.nextInt(100)+1;

    }

    int getInput(){

        System.out.println("Guess The Number(1-100):");

        userNumber=scv.nextInt();

        return 0;

    }

    int isCorrect(){

        for (int i=1; i<=100;i++) {

            if (userNumber == comp) {

                System.out.println("Yes!U r Write U Win this Match");
                System.out.println("SCORE:"+noOfGuess);
                break;
            } else if (userNumber > comp) {

                System.out.println("U enter greater than Random Number!");
                userNumber = scv.nextInt();

                noOfGuess += 1;


            }

            else if (userNumber < comp) {

                System.out.println("U enter Smaller than Random Number!");
                userNumber = scv.nextInt();

                noOfGuess += 1;


            }

            else {

                System.out.println("U  Enter More than RANGE!!!");
            }

        }

            return 0;
    }
}

public class GuessNumbers {

    public static void main(String[] args) {

        Game g1=new Game();
        g1.getInput();
        g1.isCorrect();

    }
}
