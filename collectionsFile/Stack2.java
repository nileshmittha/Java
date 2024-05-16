package collectionFramework.Stack;
import java.util.*;

public class Stack2 {

    public static void main(String[] args) {

        Stack s1=new Stack();

        s1.push(100);
        s1.push("Nilesh");
        s1.push('K');

        System.out.println(s1);
        System.out.println(s1.get(1));
        System.out.println(s1.empty());

        System.out.println(s1.peek());

        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1);
    }
}
