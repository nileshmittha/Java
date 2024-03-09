package collectionFramework;

class SuperClass{

    int a=100;
    void get(){

        System.out.println("Value of a="+a);
    }
}

class DerivedClass extends SuperClass{

    void m1(){
        get();
    }
}

public class singlelevelinheritance {

    public static void main(String[] args) {
        DerivedClass d1=new DerivedClass();
        d1.m1();



    }
}
