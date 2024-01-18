package jdbc_connnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class prpared_statementss {

	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		System.out.println("preapred statement are used to execute queries many time \n also known as parameterised queries");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/pranav","root","12345678");
		PreparedStatement pstm=con.prepareStatement("insert into id_pass values(?,?)");
		pstm.setString(1,"sk");
		pstm.setString(2,"123");
		//pstm.setString(column no,value);
		//pstm.setInt(0, 0); can use to insert integer value
		int count=pstm.executeUpdate();
		con.close();
		
		

	}

}
