package com.utility;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class DBCollage {
	public static Connection getConnection()
	{
		Connection con=null;
		 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Pass@123");
	}catch (Exception e) {
		System.out.println("Exception in getConnection"+e);
	  }
		 return con;
	}
}
