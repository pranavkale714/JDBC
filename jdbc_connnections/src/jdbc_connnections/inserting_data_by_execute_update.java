package jdbc_connnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class inserting_data_by_execute_update {

	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/pranav","root","12345678");
		 
		
		 Statement st= con.createStatement();
		 
		 int res=st.executeUpdate("insert into student values ('ganesh',24,35,'pune')");
		 con.close();

	}

}
