package collectionFramework;


class A{

    int a=10;
    float b=5.7f;

    void fun(){

        System.out.println(a+b);
    }

}

class B extends A{

    int a=18;
    float b=9.7f;

    void fun(){

        System.out.println(a+b);
        System.out.println(this.a+this.b);
    }
}



public class thisKeyword {

    public static void main(String[] args) {

        B b1=new B();
        b1.fun();

    }
}
