class base1{

    int a;


    base1(){

        System.out.println("I am Base default constructor");
    }

    base1(int a){
        this.a=a;
        System.out.println("I am Base constructor"+a);
    }

}


class derived1 extends base1{

    int y;

    derived1(){


        System.out.println("I am Derived default Constructor");
    }


    derived1(int y){

        super(y);

        this.y=y;




        System.out.println("I am Derived Constructor"+y);
    }
}

public class SuperKeyword {

    public static void main(String[] args) {

        derived1 d=new derived1(45);

    }
}
