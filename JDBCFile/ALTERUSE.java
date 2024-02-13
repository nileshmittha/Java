package JDBC;

import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ALTERUSE {

    public static void main(String[] args) throws Exception{

//        String table_Name;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter V");
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/nilesh?useSSL=false","root","qwerty");


        PreparedStatement ps=con.prepareStatement("ALTER table Student RENAME COLUMN AGE1 to AGE");

        int s=ps.executeUpdate();

        if(s>0){

            System.out.println("Column number changed to AGE1");
        }
        else{
            System.out.println("Failed to Column name change");
        }





    }
}
