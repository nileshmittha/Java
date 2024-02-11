package JDBC;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.*;

public class DeleteQuery {

    public static void main(String[] args) throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/nilesh?useSSL=false","root","qwerty");


        PreparedStatement sp=con.prepareStatement("delete from Student where name='prath'");

        int  s=sp.executeUpdate();

        if(s>0){

            System.out.println("Deleted Successfully");
        }

        else{

            System.out.println("Failed to Deletion");
        }

//        while(s.next()){
//
//
//        }






    }
}
