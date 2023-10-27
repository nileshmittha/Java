public class Pace {

    public static void main(String[] args) {

        int a=5;

        String str;

//        if(a>=0 && a<=9){
            str=String.format("%03d",a);
//        }else if(a>=10 && a<=99){
//             str=String.format("01%d",a);
//
//        }

        System.out.println(str);
    }
}
