package jdbc_connnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class password_check {

	public static void main(String[] args) throws SQLException,ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter pass");
		String pass=sc.nextLine();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/pranav","root","12345678");
		Statement st= con.createStatement();
		 
	   ResultSet rs=st.executeQuery("select pass from id_pass where name='"+name+"'");
		 
	   while(rs.next())
	   {
		   if(pass.equals(pass))
		   {
			   System.out.println("welcome");
		   }
		   else
		   {
			   System.out.println("invalid");
		   }
		   
	   }
		 con.close();

	}

}
