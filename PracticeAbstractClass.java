

abstract class Pen{

    void get(){
        System.out.println("Enter Number:");
    }

    abstract void write();
    abstract void refill();


}

class FontainPen extends Pen{

    void write(){
        System.out.println("This is Write Function");
    }

    void refill(){

        System.out.println("This is Refill function");
    }

    void changeNib(){


    }
}


public class PracticeAbstractClass {

    public static void main(String[] args) {



    }
}
