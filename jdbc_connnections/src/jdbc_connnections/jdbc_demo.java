package jdbc_connnections;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
	 // Step-1 loading  the driver
	 Class.forName("com.mysql.cj.jdbc.Driver");
	
	 //step-2 Establishing the connection
	 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/pranav","root","12345678");
	 
	 //step-3 Creating statement
	 Statement st= con.createStatement();
	 
	 //step-4 Executing the statement and getting the ResultSet
	 ResultSet rs=st.executeQuery("select * from  student");
	 
	// step-5 Processing the resultset
	 while(rs.next())
	 {
     //when we dont know the type of data u can use rs.getObject
	 System.out.println(rs.getString(1) + " "+ rs.getInt(2)+" "+ rs.getInt(3)+" "+rs.getString(4));
	 //System.out.println(rs.getObject(1) + " "+ rs.getObject(2)+" "+ rs.getObject(3)+" "+rs.getObject(4));
	 
	 }
	 //step-6 closing the connection
	 con.close();
	}	
}