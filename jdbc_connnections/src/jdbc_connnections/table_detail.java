package jdbc_connnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class table_detail {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		System.out.println("if u dont know column details in databases");
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pranav","root","12345678");
		
		Statement st= con.createStatement();

		ResultSet rs= st.executeQuery("select * from student");
		
	    ResultSetMetaData rsmd=rs.getMetaData();
	
	   System.out.println("Number of columns in table is: "+rsmd.getColumnCount());
	   System.out.println("type of data in 1st column "+rsmd.getColumnTypeName(1));
	   System.out.println("name of the table-"+rsmd.getTableName(1));
	  

	}

}
