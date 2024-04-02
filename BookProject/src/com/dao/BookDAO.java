package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Utity.DBBookUtitity;
import com.model.Book;
import com.utility.DBUtility;

public class BookDAO {
	
	public int saveBookinformation(Book Book)
	{	
	int i2=0;
Connection con=DBBookUtitity.getConnection();
String sql="insert into Book values(?,?,?)";
 try {
   PreparedStatement ps=con.prepareStatement(sql);
           ps.setInt(1,Book.getId());
           ps.setString(2,Book.getName());
           ps.setDouble(3,Book.getPrice());
           i2=ps.executeUpdate();
           
           
	}catch (Exception e) {
		System.out.println(" Exception saveBookinformation"+e);
		
	}
  return i2;
	}

	
	public int deleteBook(Book book)
	{
		int i3=0;
Connection con=DBBookUtitity.getConnection();
String sql="delete from Book where id=?";

try {
 PreparedStatement ps=con.prepareStatement(sql);
  ps.setInt(1,book.getId());
  i3=ps.executeUpdate();
	}catch (Exception e) {
		System.out.println("deleteBook Exception"+e);
	}
  return i3;
	}
	
	public int UpdateBook(Book Book)
	{
		int i4=0;
	Connection con=DBBookUtitity.getConnection();

String sql="update Book set Name=? , Price=? where id=?";
	 try {
PreparedStatement ps=con.prepareStatement(sql);
ps.setInt(3,Book.getId());
ps.setString(1,Book.getName());
ps.setDouble(2,Book.getPrice());
  i4=ps.executeUpdate();
	}catch (Exception e) {
		System.out.println("UpdateBook Exception"+e);
	}
	  return i4;
	}
	
	
	public ResultSet ReadAllBook()
	{
		
		 PreparedStatement ps=null;	
			
			
			Connection con=DBBookUtitity.getConnection();
			String sql="select * from Book";
			java.sql.ResultSet rs = null;
			try
			{
			PreparedStatement ps1=con.prepareStatement(sql);
			 rs=ps1.executeQuery();
			}
			catch (Exception e) {
				System.out.println("Exception ocuured in Select Records"+e);
			}
			
			return rs;
	}
		 
}
