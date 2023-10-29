
class Using{

    private int a=10;
    public int b=8;

    int c=9;

    protected int d= 56;

}

class NotUsing extends Using{

    void meth(){

//        System.out.println(a); ---> Private Members can not be INHERITED

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


    }
}

public class AccesModifires {

    public static void main(String[] args) {

        NotUsing u1=new NotUsing();
//        System.out.println(u1.a); ---> We can't use private members in main class
//        System.out.println(u1.b);
//        System.out.println(u1.c);
//        System.out.println(u1.d);

        u1.meth();


    }
}
