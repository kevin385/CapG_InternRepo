package day13.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveDemo1 {

	public static void main(String[] args) {
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
			//Statement stmt = oraclConn.createStatement();
			//ResultSet rs = stmt.executeQuery("select * from employee where id = 1");
			
			//PreparedStatement
			PreparedStatement ps = oraclConn.prepareStatement("select * from employee where id = ?");
			ps.setInt(1, 2);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
			}
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
