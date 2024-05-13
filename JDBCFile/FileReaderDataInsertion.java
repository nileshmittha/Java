package May13;

import java.io.*;
import java.sql.*;

public class FileReaderDataInsertion {

	public static void main(String[] args) {
	
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/php","root","qwerty");
			
			FileReader rd=new FileReader("./src/May13/Source.txt");
			
			BufferedReader bd=new BufferedReader(rd);
			String qery="insert into stud_info values(?,?,?,?)";
			
			
			String line=null;
			while((line=bd.readLine()) != null){
				
//				System.out.println(line);
				
				String[] data=line.split(",");
				
				int rol=Integer.parseInt(data[0]);
				String name=(data[1]);
				String mail=data[2];
				String city=data[3];
				
				PreparedStatement ps=con.prepareStatement(qery);
				
				ps.setInt(1, rol);
				ps.setString(2,name);
				ps.setString(3, mail);
				ps.setString(4, city);
				
				
				
			
				int re=ps.executeUpdate();
				
				if(re>0) {
					
					System.out.println(name+" Registred");
					
				}
				else {
					
					System.out.println(name+" Not Registred");
				}
				
				
				
				
				
			}
			
			
		}
		catch(Exception e) {
			
			System.out.println("Error "+e);
			
			
		}

	}

}
