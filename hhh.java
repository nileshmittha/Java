package collectionFramework;


class animal {
    void makesound() {


        System.out.println("animal sound");
        this.makesound();
        
    }
}


    class dog extends animal{
//        void makesound(){
//
//            System.out.println("dog sound");
//        }
}
public class hhh {

    public static void main(String[] args) {

        animal a1 = new dog();
        a1.makesound();



//        ((animal) a1).makesound();



    }

}
