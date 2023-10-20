interface functions{



    public void get();
//    void set();

}

class A6 implements functions{


    public void get(){
        System.out.println("Get input from User!!!");
    }

}


public class Interfaceclass {

    public static void main(String[] args) {

        A6 a1=new A6();
        a1.get();

    }
}
