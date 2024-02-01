import java.util.*;
class person{
     public int id;
     public int pass;

     public void get(){
         Scanner sc=new Scanner(System.in) ;
         System.out.println("Enter id : ");
         id=sc.nextInt();
         System.out.println("Enter pass : ");
         pass=sc.nextInt();
     }
}

class verify extends person{
    public int With,Balance_Check=0,Cancel,ch;

    public void fu(){

        get();

        if(id==12345 && pass==2233) {

            do {

                System.out.println("***************************************************************************");
                System.out.println("1:Credit");
                System.out.println("2:Debit");
                System.out.println("3: Balance Check");
                System.out.println("4: Cancel");

                System.out.println("***************************************************************************");

                System.out.println("Enter Your Choice:");
                Scanner sc=new Scanner(System.in);
                ch=sc.nextInt();

                switch(ch){

                    case 1:
                        int credit=0;
                        System.out.println("Enetr Ammount u can deposit:");
                        credit=sc.nextInt();


                        if(credit==0 && credit<0){
                            System.out.println("Invalid Amount*******");
                        }
                        else if(credit>1000 && credit<5000){

                            System.out.println("Enter Password:");

                            pass=sc.nextInt();

                            if(pass==2233) {

                                Balance_Check = Balance_Check + credit;
                                System.out.println("Money Deposit Successfully");
                            }
                            else{
                                System.out.println("Invalid Password*****");
                            }

                        }
                        else{
                            System.out.println("Money can't deposited");

                        }
                        break;


                    case 2:
                        int debit;
                        System.out.println("Enetr Withdrawal amount:");
                        debit=sc.nextInt();
                        if(debit<Balance_Check){
                            System.out.println("Enter Password:");

                            pass=sc.nextInt();

                            if(pass==2233) {


                                Balance_Check = Balance_Check - debit;
                                System.out.println("Debited SuccessFully");
                            }
                            else{
                                System.out.println("Invalid Password***");
                            }
                        }
                        else{
                            System.out.println("Insuffcinent Balance");
                        }
                        break;

                    case 3:
                        System.out.println("Enter Password:");

                        pass=sc.nextInt();

                        if(pass==2233){

                            System.out.println("Balance:"+Balance_Check);
                        }
                        else{
                            System.out.println("Invalid Password*****");
                        }
                        break;

                    case 4:
                        System.out.println("Transaction cancelled Successfully");
                        break;

                    default:
                        System.out.println("Invalid Option");





                }

            } while (ch!=4);

        }
        else{
            System.out.println("Please Enter Valid detail");
        }
    }

}

public class BankProject {

    public static void main(String[] args) {

         verify s1=new verify();
         s1.fu();

    }


}
