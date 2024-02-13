package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class ADD_COLUMN {

    public static void main(String[] args)throws Exception {

        String Column_Name;
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter New Column Name:");
        Column_Name=sc.next();


        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/nilesh?useSSL=false","root","qwerty");

        PreparedStatement ps=con.prepareStatement("ALTER table Student ADD "+Column_Name+" varchar(10)");

        int s=ps.executeUpdate();
        System.out.println(s);

        if(s>0){

            System.out.println("Added column Successfully");
        }
        else{

            System.out.println("Failed to Add new Column");
        }



    }
}
