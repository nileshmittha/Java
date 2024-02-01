import java.util.Scanner;

public class AdditionALL {
    public static void main(String[] args) {
        int ch;
        do {
            int a, b;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value for A:");
            a = sc.nextInt();
            System.out.println("Enter value for B:");
            b = sc.nextInt();
            System.out.println("1.Addition");
            System.out.println("2.Substraction");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");
            System.out.println("5.Exit");

            System.out.println("Enter Choice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter value for Addition : " + a + b);
                    break;
                case 2:
                    System.out.println("Enter value for Substraction : " + (a - b));
                    break;
                case 3:
                    System.out.println("Enter value for Addition : " + (a * b));
                    break;
                case 4:
                    System.out.println("Enter value for Addition : " + (a / b));
                    break;
                case 5:
                    System.out.println("Terminated Calculations");
                    break;
                default:
                    System.out.println("Invalid Choice,Please Enter valid option");
                    break;

            }
        } while (ch != 5);
    }
    }

