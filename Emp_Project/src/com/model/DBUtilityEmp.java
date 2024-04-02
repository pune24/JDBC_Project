package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.concurrent.ExecutionException;

public class DBUtilityEmp {
public static Connection getConnection()
{
	Connection con=null;
	  try {
	Class.forName("com.mysql.cj.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Pass@123"); 
	  }catch(Exception e)
	  {
		  System.out.println("DBUility");
	  }
	  return con;
}
   
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static Connection getConnection()
//	{
//		Connection con=null;
//		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Pass@123");
// 
//	}catch(Exception e)
//		{
//		System.out.println("DBUtilityEmp class Exception"+e);
//		}
//		return con;
	
//	}

 
	
	
	
	
	
	
	
	
//	public static Connection getConnection()
//	{
//		Connection con=null;
//		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Pass@123");
//	}catch(Exception e)
//		{
//		  System.out.println("DBUtilityEmp class emp Exception"+e);
//		}
//		return con;
		


