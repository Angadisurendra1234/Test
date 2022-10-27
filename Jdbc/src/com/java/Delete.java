package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		String DELETE = "delete from employee where id =?";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Surendra");

		PreparedStatement preparedStatement = connection.prepareStatement(DELETE);

		preparedStatement.setInt(1, 104);

		int i = preparedStatement.executeUpdate();
		System.out.println(i);
		preparedStatement.close();
		connection.close();
	}
}
