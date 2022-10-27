package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String Update = "update employee set id=120, name ='mani' where id =? ";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Surendra");
		
		PreparedStatement preparedStatement = connection.prepareStatement(Update);
		preparedStatement.setInt(1, 101);
	
		int i = preparedStatement.executeUpdate();
		System.out.println(i);
		
		preparedStatement.close();
		connection.close();
	}
}
