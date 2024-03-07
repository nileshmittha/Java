package collectionFramework;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Convert {


    public static void main(String[] args) {
        Map<Integer,String> nn=new HashMap<>();



    nn.put(1,"Nilesh");
        nn.put(2,"Nilesh");
        nn.put(3,"Nilesh");
        nn.put(4,"Nilesh");

        System.out.println(nn);

        System.out.println(nn);

        List<Integer> hh=new ArrayList<>(nn.keySet());

        System.out.println(hh);


    }



}
