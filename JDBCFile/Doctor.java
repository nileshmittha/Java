package May14;

import java.sql.*;

import java.util.*;


class Doctor_App{
	private int docId;
	private String docName;
	private String username;
	private String password;
	private String speciality;
	private int exp;
	
	public Doctor_App(int docId, String docName, String username, String password, String speciality, int exp) {
//		super();
		this.docId = docId;
		this.docName = docName;
		this.username = username;
		this.password = password;
		this.speciality = speciality;
		this.exp = exp;
	}

	public int getDocId() {
		return docId;
	}

	public String getDocName() {
		return docName;
	}

	public String getUsername() {
		return username;
	}

	
	public String getPassword() {
		return password;
	}

	public String getSpeciality() {
		return speciality;
	}

	public int getExp() {
		return exp;
	}

	@Override
	public String toString() {
		return "Doctor [docId=" + docId + ", docName=" + docName + ", username=" + username + ", password=" + password
				+ ", speciality=" + speciality + ", exp=" + exp + "]";
	}

}

class DoctorService{
	public void registerDoctor(Doctor_App obj) 
	{
		int id=obj.getDocId();
		String name=obj.getDocName();
		String docUser=obj.getUsername();
		String pw=obj.getPassword();
		String spec=obj.getSpeciality();
		int exp=obj.getExp();
		try {
			
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/php","root","qwerty");
		System.out.println("Connection Established ");
		
		final String INSERT_QUERY="insert into doctor values(?,?,?,?,?,?)";
		
		//Creating PreparedStatement object
		PreparedStatement ps=con.prepareStatement(INSERT_QUERY);
		ps.setInt(1, id);
		ps.setString(2,name);
		ps.setString(3,docUser);
		ps.setString(4, pw);
		ps.setString(5, spec);
		ps.setInt(6, exp);
		
		int result=ps.executeUpdate();
		
		if(result > 0) {
			System.out.println("Doctor"+" "+name+" registered...");
		}
		else {
			System.out.println("We can't able to register you ");
		}
		}
		catch(Exception e) {
			System.out.println("Error"+e);
		}	
		
		//System.out.println(id+" "+name+" "+docUser+" "+pw+" "+spec+" "+exp+" ");
	}
}
public class Doctor {
	
public static void main(String[] args)  {
	DoctorService service=new DoctorService();
	
	Doctor_App obj=new Doctor_App(102,"A","doc@123","pass@123","eye",2);
	
	//now i am Calling registerDoctor(Doctor doctor)
	service.registerDoctor(obj);
	
}
}
