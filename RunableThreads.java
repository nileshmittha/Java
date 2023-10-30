
class RunAblesThreads1 implements Runnable{

    public void run(){

        int i=0;

        while (i<100){

            System.out.println("This code is running in a Runablethread  111");
        }
    }
}

class RunAblesThreads2 implements Runnable{

    public void run(){

        int i=0;

        while (i<100){

            System.out.println("This code is running in a Runablethread  222");
        }
    }
}


public class RunableThreads {

    public static void
    main(String[] args) {

        RunAblesThreads1 Bullet1=new RunAblesThreads1();
        Thread t1=new Thread(Bullet1);

        RunAblesThreads2 Bullet2=new RunAblesThreads2();
        Thread t2=new Thread(Bullet2);

        t1.start();
        t2.start();

    }
}
