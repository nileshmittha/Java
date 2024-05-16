package collectionFramework.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList1 {

    public static void main(String[] args) {
//      Heterogeneous LinkedList means Different types of data
        LinkedList l1= new LinkedList();

        l1.add(56);

        l1.add(90);
        l1.add(58);
        l1.add(59);
        l1.add('h');
        l1.add("Nilesh");
        l1.add(null);

        System.out.println(l1.get(0));

        System.out.println(l1);

    }
}
