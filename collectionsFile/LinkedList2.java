package collectionFramework.LinkedList;

import java.util.LinkedList;

public class LinkedList2 {

    public static void main(String[] args) {


        LinkedList<Integer> l1 = new LinkedList<Integer>();

        l1.add(56);

        l1.add(90);
        l1.add(58);
        l1.add(59);

        System.out.println(l1);

        LinkedList<Integer> l2 = new LinkedList<Integer>(l1);
        l2.add(11);
        l2.add(12);
        l2.add(13);

        System.out.println(l2);


        LinkedList<Integer> l3 = new LinkedList<Integer>();
        l3.addAll(l1);
        l3.add(00);
        l3.add(33);
        l3.add(11);

        System.out.println(l3);






    }
}

