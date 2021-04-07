package day13.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


class Employee {
	
}

public class ConnectionToOracle {

	public static void main(String[] args) {
		//throw new ArithmeticException("This is unchecked exception");
		//throw new FileNotException("fileNotFound");
		try {
			//Class.forName("day13.jdbc.Employee");
			//Class.forName("Employee");
			//step-1
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Class found");
			
			//step-2
			
			Connection oraclConn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "pass1234");
			System.out.println("Connected");
			
			//step-3	(creating the statement or preparredStatement Object
			Statement stmt = oraclConn.createStatement();
			stmt.execute("insert into employee values(2,'sachin','developer',48000.02)");
			System.out.println("Inserted");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Class not found");
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
