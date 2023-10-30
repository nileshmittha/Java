
class Thread1 extends Thread{

    int i=0;
    public void run() {
        while (i < 100) {

            System.out.println("Hi I am Therad1!!!");
            i++;
        }
    }
}

class Thread2 extends Thread{

    int i=0;
    public void run() {
        while (i < 100) {

            System.out.println("Hi I am Therad2!!!");
            i++;
        }
    }
}

public class Threads {

    public static void main(String[] args) {

        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();

        t1.start();
        t2.start();


    }
}
