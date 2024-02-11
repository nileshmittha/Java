package JDBC;

import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FecthDataFromJDBC {

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/nilesh?useSSl=false","root","qwerty");
        PreparedStatement sp=con.prepareStatement("select * from Student");

        ResultSet s= sp.executeQuery();
        while(s.next()){

            String name1=s.getString("name");
            int age1=s.getInt("age");
            String city1=s.getString("city");

            System.out.println(name1);
            System.out.println(age1);
            System.out.println(city1);
            System.out.println("-----------------------------------------------------");

        }

    }
}
