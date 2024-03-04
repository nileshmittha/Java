package collectionFramework;


import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {


       List<Integer> list=new ArrayList();

       list.add(7);
       list.add(4);
       list.add(0,2);

       List<Integer> list1=new ArrayList<>();
       list1.add(12);
        list1.add(11);
        list1.add(22);
        list1.add(33);


        list.addAll(0,list1);

        list.set(0,45);

        System.out.println(list.contains(45));

       try {




           System.out.println(list);


       }
       catch(Exception e){

           System.out.println(e);
       }
    }
}
