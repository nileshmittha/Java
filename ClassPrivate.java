import java.security.PrivateKey;

class Employee{

    private
        int id;
        String name;
    public
        int get(int i,String n){

        id=i;
        name=n;
        return 0;
    }
        int print(){

            System.out.println(id+" "+name);
            return 0;
        }
}

public class ClassPrivate {

    public static void main(String[] args) {

        Employee e1=new Employee();
       e1.get(2,"Nilesh");
       e1.print();
    }
}
