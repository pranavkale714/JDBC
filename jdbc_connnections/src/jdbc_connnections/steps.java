package jdbc_connnections;

public class steps {

	public static void main(String[] args) {
		
		//step-1 loading the driver
		System.out.println("1.load-(download jar file from internet) and \n2.register-(for that we used statement class.forname) driver");
		System.out.println("the dirver will be different for different databases");
		System.out.println("for mysql different for oracle different for etc");
		System.out.println("download it from internet");
		System.out.println("to import jar file follow steps-");
		System.out.println("1.right click on project ");
		System.out.println("2.click on build path-configure build path");
		System.out.println("3.click on libraries");
		System.out.println("4.select class path");
		System.out.println("5.add external jar");
		System.out.println("6.add external jar file and select downloaded file");
		
		//step-2 etablishing connection
		System.out.println("\nestantiation of object-connection");
		//step-3 creating statement
		System.out.println("\nthree types of statement");
		System.out.println("statement");
		System.out.println("prepared statement");
		System.out.println("collable statement");
		//step-4 executing the statement and getting result
		//step-5 processing the result 
		//step-6 closing the connection

	}

}