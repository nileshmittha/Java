package collectionFramework;


class Parent{

    int a=10;
    float b=5.7f;

    void fun(){

        System.out.println(a+b);
    }

}

class childs extends Parent{

    int a=18;
    float b=9.7f;

    void fun(){

        System.out.println(a+b);
        System.out.println(super.a+super.b); // it takes values of A and B from parents class this process is called "super Keyword"
    }
}
public class SuperKeyword {

    public static void main(String[] args) {

        childs c1=new childs();
        c1.fun();

    }
}
