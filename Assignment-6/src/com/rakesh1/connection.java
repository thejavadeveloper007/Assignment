package com.rakesh1;

import java.sql.*;

public class connection {
	static Connection con = null;
	public static Connection connectDB(){
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcapp","login1", "root");
			return con;
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return con;	
		}
}