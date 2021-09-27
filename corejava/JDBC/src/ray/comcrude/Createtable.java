package ray.comcrude;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Createtable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driverloaded");
		String url="jdbc:mysql://localhost:3306/students";
		String un="root";
		String pwd="root";
		Connection conn = DriverManager.getConnection(url,un,pwd);
		System.out.println("connection establised");
		Statement stmt=conn.createStatement();
		String qry="CREATE TABLE marksheet (rollno int primary key,name varchar(30),phy int,chem int,maths int)";
		stmt.execute(qry);
		System.out.println("table created");
		stmt.close();
		conn.close();
		
	}

}
