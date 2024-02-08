import org.w3c.dom.ls.LSOutput;

class A11 extends Thread{

    public void run(){
        while(true) {
            System.out.println("FFFFF");
        }

    }
}

class A112 extends Thread{
    public void run(){
        while(true) {
            System.out.println("FFFFF22222");
        }

    }
}

public class Threads {

    public static void main(String[] args) {

        A11 s=new A11();
        A112 s2=new A112();
        s.start();
        s2.start();
//        System.out.println("");
    }
}
