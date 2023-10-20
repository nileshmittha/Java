
interface frog {


    public void Go();

    public void Stop();

}



class Work implements frog{


    public void Go(){
        System.out.println("1 2 3 GO");
    }

    public void Stop(){
        System.out.println("END");
    }





}


public class InterfaceObjects {

    public static void main(String[] args) {

        frog f1=new Work();
        f1.Go();

    }
}
