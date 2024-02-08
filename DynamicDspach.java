
class A
{

    public void get1(){

        System.out.println("Get1");
    }

}
class B extends A
{

    public void get(){



        System.out.println("Get2");
    }



}



    public class DynamicDspach {


        public static void main(String[] args){

            // System.out.println("Hi!");
            A b1=new B();
            b1.get1();
        }



}
