

interface Z{
    void Z1();


}

interface X{
    void X1();
}

class V{

    public int getV(){
        System.out.println("GetV");
        return 0;
    }
}

class C extends V implements Z,X{

    public void Z1(){
        System.out.println("Z1");
    }

    public void X1(){
        System.out.println("X1");
    }

    public void sample(){
        System.out.println("Sample Method");
    }
}


public class Polymorpisom {

    public static void main(String[] args) {
        X s1=new C();
//        s1.Z1();  -->> This is not Allowed but, we can only use X methods not others classes or interfaces

        s1.X1();
//        s1.getV();  ---> This Also not allowed
//        s1.sample();  ---> This Also not allowed



        C c1=new C();
        c1.sample();
        c1.X1();  //We can use All methods exists in C class
    }



}
