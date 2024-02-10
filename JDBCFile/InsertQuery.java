package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertQuery {

    public static void main(String[] args) throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/nilesh","root","qwerty");

        PreparedStatement ps=con.prepareStatement("insert into Student values (45,'Harry','Delhi')");

        int result=ps.executeUpdate();

        if(result>0){

            System.out.println("Insert into Database SuccessFully");
        }
        else{

            System.out.println("Failed to insert data into Database");
        }
    }
}
