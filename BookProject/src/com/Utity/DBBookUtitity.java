package com.Utity;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBBookUtitity {
	
	public static Connection getConnection()
	{
		Connection con=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");	
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Pass@123");
	  }catch (Exception e) {
		System.out.println("getConnection method Exception"+e);
	}
		return con;
	}

}
