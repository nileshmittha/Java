package collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedList11 {

    public static void main(String[] args) {

        Queue<Integer> bi=new LinkedList<>();

       bi.add(55);
        bi.offer(4);
        bi.offer(45);
        bi.offer(557);

        System.out.println(bi.poll());
//        bi.add(0,56);



        System.out.println(bi.peek());




        System.out.println();



        System.out.println(bi);


//        Queue<Integer> bi=new LinkedList<>();

        bi.add(55);
        bi.offer(4);
        bi.offer(45);
        bi.offer(557);


        System.out.println(bi.poll());





//        List<Integer> ni=new ArrayList<>();
//
//        ni.add(67);
//        ni.add(6);
//        ni.add(8);
//        ni.add(66);
//
//        System.out.println(ni.get(0));
//
//        ni.remove(0);
//
//        System.out.println(ni.get(0));
//
//
//
//
//
//
//        System.out.println(ni);
//

    }
}
