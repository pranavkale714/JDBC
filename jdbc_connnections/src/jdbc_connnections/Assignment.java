package jdbc_connnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Assignment {

	void m1()
	{
		
		System.out.println("get data from user");
	}

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		System.out.println("====please enter the detail of student====");
		System.out.println("please name and roll_no");
		Scanner sc=new Scanner(System.in);
		
		String name=sc.nextLine();
		int rollno=sc.nextInt();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		 
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/pranav","root","12345678");
		 
		Statement st= con.createStatement();
		 
		String query="insert into student(fullname, age) values('"+name+"',"+rollno+")";
		 
		int res=st.executeUpdate(query);
		
		System.out.println(res+" number of record inserted");
		
		con.close();
		
	}
}
