package collectionFramework.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList3 {

    public static void main(String[] args) {


        LinkedList<Emp> l1= new LinkedList<Emp>();

        l1.add(new Emp(101, "Nilesh"));
        l1.add(new Emp(102, "rahul"));
        l1.add(new Emp(102, "Ravi"));

        Iterator<Emp> i1=l1.iterator();

        while(i1.hasNext()){
            Emp i=i1.next();
            System.out.println("ID = "+i.id+" Name = "+i.name);
        }


    }
}
