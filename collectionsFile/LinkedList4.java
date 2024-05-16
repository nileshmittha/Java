package collectionFramework.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList4 {

    public static void main(String[] args) {


        LinkedList<Emp> l1= new LinkedList<Emp>();

        l1.add(new Emp(101, "Nilesh"));
        l1.add(new Emp(102, "rahul"));
        l1.add(new Emp(102, "Ravi"));

        ListIterator<Emp> i1=l1.listIterator();


        

        while(i1.hasNext()){
            Emp i=i1.next();
            System.out.println("ID = "+i.id+" Name = "+i.name);
        }

    }
}
