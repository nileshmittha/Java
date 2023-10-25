
interface Dog{

    public void Sound(int a);
    public void Look();

}

interface Cat{

    public void Sound();
    public void Look(int q);

}

class Animals implements Dog,Cat{

    public void Sound(){

        System.out.println("Mew Mew");
    }
    public void Sound(int a){

        System.out.println(a);
    }

    public void Look(){

        System.out.println("Weired");
    }

    public void Look(int q){

        System.out.println(q);
    }


}


public class MultipleInterface {

    public static void main(String[] args) {

        Animals a=new Animals();
        a.Sound();
        a.Look(56);


    }
}
