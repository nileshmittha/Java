
class staticclass1{

    static int a=100;

    static void m1() {
        System.out.println("Inside m1 Method");
    }
}

public class StaticMember3 {

    public static void main(String[] args) {

//        System.out.println(a); ------>this line give error because of a'' cannot be access

        //but two ways we can access 'a'
        // 1.classname with help of dot(.) operator
        //2.create of objects of the class


        System.out.println(staticclass1.a);


    }
}
