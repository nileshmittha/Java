package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBConnection {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/nilesh?useSSL=false","root","qwerty");
            // DriverManager.getConnection(URL,username,Password)
            //URL=jdbc:mysql://localhost:3306/database_name
            //username=root OR system
            //password=*******    ------>Note that password match with same as MySQL command promnt password

            System.out.println("database Connection Successfully");

        }
        catch(Exception e){

            System.out.println(e);
        }
    }
}
