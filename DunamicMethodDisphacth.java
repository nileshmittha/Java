class Phone{

    void Showtime(){

        System.out.println("Is Good Morning");

    }

    int on(){

        System.out.println("Turning on Phone");

        return 0;

    }
}

class SmartPhone extends Phone{

    void Music(){

        System.out.println("Playing Music");

    }

    int on(){

        System.out.println("Turning on SmartPhone");

        return 0;

    }
}






public class DunamicMethodDisphacth {

    public static void main(String[] args) {

        Phone p1=new SmartPhone();//this is Dynamic Dispatch
       // SmartPhone s1=new Phone();  //This is not allowed
        p1.on();

//        p1.Music();//it not allowed
    }
}
