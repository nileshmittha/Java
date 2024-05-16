package collectionFramework.Stack;
import java.util.Stack;
public class Stack3 {

    public static void main(String[] args) {

        Stack s1=new Stack();
// it count from peek to bootm
        s1.push(56);
        s1.push("HH");
        s1.push('d');

        s1.push(null);

        System.out.println(s1.search(56));
        System.out.println(s1.search('d'));
        System.out.println(s1);
    }
}
