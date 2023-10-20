abstract class PAPA {
    // Abstract method (does not have a body)
    public abstract void name();
    public void Work() {
        System.out.println("JOB");
    }
}

// Subclass (inherit from Animal)
abstract class SON1111 extends PAPA{
    public abstract void sonname();

}

class son222 extends SON1111{

    public void name(){

        System.out.println("nhkjghdk");
    }
    public void sonname(){

        System.out.println("jflk");
    }

    void go(){
        System.out.println("okkkk");
    }
}



public class Absrtcat1 {

    public static void main(String[] args) {

        son222 s1=new son222();
        s1.name();

    }


}
