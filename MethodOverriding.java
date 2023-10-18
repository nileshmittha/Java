class A{

    int a;

    int meth1(){
        System.out.println("Hi am Meth1 of the A Class");
        return 0;
    }

    int meth2(){
        System.out.println("Hi i am meth2 of the A class");
        return 0;
    }

}

class B extends A{

       int meth1(){
            System.out.println("Hi i am meth1 of the B class");

            meth2();
            return 0;
       }

       int meth2(){
         System.out.println("Hi i am meth2 of the B class");
         return 0;
       }
}


public interface MethodOverriding {

    public static void main(String[] args) {

        B b1=new B();
        b1.meth1();

    }
}
