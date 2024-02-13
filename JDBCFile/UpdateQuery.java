package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateQuery {

    public static void main(String[] args) throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/nilesh","root","qwerty");

        PreparedStatement ps=con.prepareStatement("update Student set city='Delhi' where name='harry'");
        int s=ps.executeUpdate();
        System.out.println(s);
        if(s>0){

            System.out.println("Updated ");
        }
        else{

            System.out.println("Failed to manipulation");
        }

    }
}
