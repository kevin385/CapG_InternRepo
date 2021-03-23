package day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Test2 {

	public void displayUserDetails(String username, String password, Connection oraclConn) {
		try {
			PreparedStatement ps = oraclConn.prepareStatement("select * from register where username = ? and password = ?");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			
			int temp = 0;
			while(rs.next()) {
				temp = 1;
			}
			if(temp == 1)
				System.out.println("Logged in");
			else
				System.out.println("Not registered");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void inputUserDetails(String username, String password, String designation, Connection oraclConn) {
		try {
			
			PreparedStatement ps = oraclConn.prepareStatement("insert into register values(?,?,?)");
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, designation);
			ps.execute();
			System.out.println("Executed");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test2 t2 = new Test2();
		System.out.println("1. Login \n2. Register\nEnter your choice:");
		int ch = sc.nextInt();
		sc.nextLine();
		
		Connection oraclConn = null;
		try {
			//Class.forName("day13.jdbc.Employee");
			//Class.forName("Employee");
			//step-1
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Class found");
			
			//step-2
			
			oraclConn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "pass1234");
			System.out.println("Connected");
			

		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Class not found");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Enter Username:");
		String username = sc.nextLine();
		System.out.println("Enter Password:");
		String password = sc.nextLine();
		if(ch == 2) {
			System.out.println("Enter Designation:");
			String designation = sc.nextLine();
			
			t2.inputUserDetails(username, password, designation, oraclConn);
		}
		else if(ch == 1) {
			t2.displayUserDetails(username, password, oraclConn);
		}
		else
			System.out.println("invalid choice");
		
		sc.close();
	}

}


