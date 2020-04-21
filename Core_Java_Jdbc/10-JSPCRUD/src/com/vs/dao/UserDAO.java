package com.vs.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class UserDAO {

	public static Connection getConnection() {
	Connection con =null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "admin");
		
	}
	catch (Exception e ) {
		System.out.println(e);
	}
	return con;

	}
	public static int save(User u) {
		
	}

}
