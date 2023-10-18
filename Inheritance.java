

class base{


        int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }


}

class Derived extends base{

    int b;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

public class Inheritance {

    public static void main(String[] args) {

        Derived d1=new Derived();
        d1.setA(23);

        System.out.println(d1.getA());



    }
}
