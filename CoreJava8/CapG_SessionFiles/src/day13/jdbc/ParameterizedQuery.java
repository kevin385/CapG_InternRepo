package day13.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ParameterizedQuery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id:");
		int id = sc.nextInt();
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("Enter dept:");
		String dept = sc.next();
		System.out.println("Enter salary:");
		double salary = sc.nextDouble();
		
		try {
			//Class.forName("day13.jdbc.Employee");
			//Class.forName("Employee");
			//step-1
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Class found");
			
			//step-2
			
			Connection oraclConn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "pass1234");
			System.out.println("Connected");
			
			//step-3	
			PreparedStatement ps = oraclConn.prepareStatement("insert into employee values(?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, dept);
			ps.setDouble(4, salary);
			
			ps.execute();
			System.out.println("Executed");
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
