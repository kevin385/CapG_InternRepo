package day13.jdbc;

import java.sql.*;

public class TableInfo {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Class Loaded");
			
			Connection oraclConn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "pass1234");
			System.out.println("Connected");
			
			Statement stmt = oraclConn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee");
			
			ResultSetMetaData rsm = rs.getMetaData();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
