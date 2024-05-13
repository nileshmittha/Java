package JDBCPack;

import java.sql.*;
import java.util.Scanner;
//import java.sql.DriverManager;

public class JDBC2Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/php", "root","qwerty");

				System.out.println("connection estabilished");
				Scanner sc=new Scanner(System.in);
//				System.out.println("How many employee do you wal");
				System.out.println("enter employee name");
				String name=sc.next();
				System.out.println("ente employee phone number");
				long ph=sc.nextLong();
				System.out.println("enter employee salary");

				double salary =sc.nextDouble();

			System.out.println("enter employee type");


				String empType=sc.next();

				System.out.println("enter userName");

				String userName=sc.next();

				System.out.println("enter user password");
				String pass=sc.next() ;
				
				
				Statement st=con.createStatement();
				
//				create table Emp_Table(emp_id int primary key auto_increment,
//						emp_name varchar(40), emp_phone bigint, emp_salary double,
//						emp_type varchar(40), emp_userName varchar(40),
//						emp_password varchar(40));
//				
				String insertquery="INSERT INTO Emp_Table(emp_name,emp_phone,emp_salary, emp_type, emp_userName, emp_password) values('"+name+"',"+ph+","+salary+",'"+empType+"','"+userName+"','"+pass+"')";
				
				int data1=st.executeUpdate(insertquery);
				
				
				if(data1>0) {
					System.out.println("Data Inserted");
				}
				else {
					
					System.out.println("Error");
				}
		}
		
		catch(Exception e) {
			
			System.out.println(e);
		}

	}

}
