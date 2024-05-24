package collectionFramework.Vector;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Vector2 {

    public static void main(String[] args) {

        Vector<Integer> v1 = new Vector<Integer>();

        v1.add(12);
        v1.add(25);
        v1.add(78);
        v1.add(1);
        v1.add(0);
        v1.add(67);
        v1.add(69);
        v1.add(6);
        v1.add(60);
        v1.add(69);
        v1.add(69);
        v1.add(69);

        v1.add(12);
        v1.add(25);
        v1.add(78);
        v1.add(1);
        v1.add(0);
        v1.add(67);
        v1.add(69);
        v1.add(6);
        v1.add(60);
        v1.add(69);
        v1.add(69);
        v1.add(69);

        System.out.println(v1.size());
        System.out.println(v1.capacity());

        Iterator i1 = v1.iterator();
        int count=0;
        Collections.sort(v1);
        System.out.println(v1);

        while (i1.hasNext()) {

            Integer i=(Integer)i1.next();
            if(i== 69){

                count=count+1;

            }


        }
        System.out.println(count);
    }
}
