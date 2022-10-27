package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Select {
	public static void main(String[] args) throws Exception {
		String select = "select * from employee";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Surendra");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(select);
		while (rs.next()) {
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("name"));
		}

		st.close();
		con.close();
	}
}