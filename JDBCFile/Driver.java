package JDBC;

import static java.lang.Class.forName;

public class Driver {

    public static void main(String[] args)throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Class Executed Succesfullt");
    }
}
