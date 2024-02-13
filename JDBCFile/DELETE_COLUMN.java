package JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.util.Scanner;

public class DELETE_COLUMN {

    public static void main(String[] args)throws Exception {

//        String Col_Name;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Column Name:");
//        Col_Name=sc.next();

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con= DriverManager.getConnection("jdbc:mysql://localhost3306/nilesh?useSSL=false","root","qwerty");

        PreparedStatement ps=con.prepareStatement("alter table Student DROP COLUMN age123");

        int s=ps.executeUpdate();

        if(s>0){
            System.out.println("Deleted Column Successfully");
        }
        else{
            System.out.println("!OOPSSS ,try Again");
        }

    }
}
