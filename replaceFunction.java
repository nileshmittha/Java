public class replaceFunction {

    public static void main(String[] args) {

        String text="Dear <|name|>,thanks lot!";

        text=text.replace("<|name|>","Nilesh");

        System.out.println(text);
    }
}
