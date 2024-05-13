package JDBCPack;

import java.sql.*;
import java.util.Scanner;
//import java.sql.DriverManager;

public class Heloo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/php","root","qwerty");
			
			System.out.println("Connection Successfully");
			
			Statement st=con.createStatement();
//			String query="CREATE TABLE Company(ID int primary key, Com_Name varchar(50))";
//			
//			int result=st.executeUpdate(query);
//			
//			if(result==0) {
//				
//				System.out.println("Table Created");
//				
//			}else {
//				
//				System.out.println("Error Occured in Table Creation......");
//			}
			Scanner sc=new Scanner(System.in);
			int ch;
			
			
			do {
				
				
				System.out.println("1.ADD DATA");
				System.out.println("2.SHOW DATA");
				System.out.println("3.EXITE");
				System.out.println("Enetr Your Choice");
				ch=sc.nextInt();
				
				switch(ch) {
				
				case 1:
					System.out.println("Enetr Compeny ID: ");
					int Com_id=sc.nextInt();
					
					System.out.println("Enetr Compeny Name: ");
					
					
					String Com_Name=sc.next();		
					
					String InsertQuery="INSERT INTO company values("+Com_id+",'"+Com_Name+"')";
					
					int dataresult=st.executeUpdate(InsertQuery);
					
					
						if(dataresult>0) {
						
						System.out.println("Data Inserted");
					}
					else {
						System.out.println("Data Not Inserted");

					}
						System.out.println();
						System.out.println();
						System.out.println();
						
						break;
				case 2:
					
					String show="SELECT * FROM Company";
					
					ResultSet row=st.executeQuery(show);
					
					while(row.next()) {
						
						
				            System.out.println("ID: " + row.getInt("ID"));
				            System.out.println("NAME: " + row.getString("Com_Name"));
				            System.out.println("-------------------------------------------------------------------------------");
				         }
//							System.out.println();
//							System.out.println();
//							System.out.println();
							
						break;
						
				case 3:
					
					System.out.println("Exited");
					break;
					
					
					
				}
			}while(ch!=3);
			
			
			
			
				
			
			
		}
		catch(Exception e) {
			
			System.out.println(e);
		}

	}

}
