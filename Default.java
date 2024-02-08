interface Phone1{

    int get1();
    default void got(){
        System.out.println("GOOOOT");
    }
}


interface Phone2{

    public void get2();
}


class H implements Phone1,Phone2{
    public int get1(){
//
        System.out.println("Hi!");

        return 0;
    }
    public void get2(){
        System.out.println("Hellow!");
        got();
    }

}



public class Default {


    public static void main(String[] args) {
        H h1=new H();
        h1.get1();
        h1.get2();


    }


}
