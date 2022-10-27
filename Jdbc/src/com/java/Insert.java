package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String INSERT = "insert into employee values(?,?)";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Surendra");

		PreparedStatement pre = connection.prepareStatement(INSERT);
		pre.setInt(1, 104);
		pre.setString(2, "Vijay");

		int i = pre.executeUpdate();
		System.out.println(i);
		pre.close();
		connection.close();
		
		
	}
	
	
}
