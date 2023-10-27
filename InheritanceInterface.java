interface interface1{

    void meth1();

    void meth2();

}

interface interface2 extends interface1{

    void meth3();

    void meth4();

}

class classs1 implements interface2{

    public void meth1(){
        System.out.println("Hi i am Method 1");
    }

    public void meth2(){
        System.out.println("Hi i am Method 2");
    }


    public void meth3(){
        System.out.println("Hi i am Method 3");
    }

    public void meth4(){
        System.out.println("Hi i am Method 4");
    }
}


public class InheritanceInterface {

    public static void main(String[] args) {

        classs1 s1=new classs1();
        s1.meth1();
        s1.meth2();
        s1.meth3();
        s1.meth4();
    }
}
