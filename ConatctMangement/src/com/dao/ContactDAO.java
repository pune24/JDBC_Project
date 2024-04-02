package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.Utility.DBUtilityConatct;
import com.model.Contact;

public class ContactDAO {
	Scanner ob1=new Scanner(System.in);
	public int saveContact(Contact contact)
	{
		PreparedStatement ps=null;
		
		
		Connection con=DBUtilityConatct.getConnection();
		String sql="insert into contact values(?,?)";
		int val=0;
		
		try
		{
			 ps=con.prepareStatement(sql);
			 
			 ps.setInt(1, contact.getContactNo());
			 ps.setString(2,contact.getName());
			
			 val=ps.executeUpdate();
			 
		}
		catch(Exception e)
		{
			System.out.println("Exception occured in save student"+e);
		}
		return val;
	}
	
  
  
  public int DeleteConatct(Contact contact)
  {
	  int val=0;
	Connection con=DBUtilityConatct.getConnection();
	String sql="delete from contact where contactNo=?";
	 try {
	   PreparedStatement ps=con.prepareStatement(sql);
	    ps.setInt(1,contact.getContactNo());
	   val=ps.executeUpdate();
  }catch (Exception e) {
	System.out.println("Exception prsent DeleteConatct "+e);
}
	return val;
  }
  
  public int UpdateContact(Contact contact)
  {
	  int i=0;
	Connection con=DBUtilityConatct.getConnection();
String sql="update contact set Name=? , where contactNo=?";
	 try
	 {
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,contact.getContactNo());
		ps.setString(2,contact.getName());
	   int i2=ps.executeUpdate();
	   if(i2>0)
		   System.out.println("Update Complted");
	   else System.out.println("Update not complted");
	   
		
	 }catch (Exception e) {
		System.out.println("UpdateContact Exception"+e);
	}
	  
	return i;  
  }
  
  public ResultSet ReadAllContact()
  {
	 Connection con=DBUtilityConatct.getConnection();
	 String sql="select * from contact";
	 java.sql.ResultSet rs = null;
	 int rsp=0;
	 try
	 {
		 PreparedStatement ps=con.prepareStatement(sql);
		  rs=ps.executeQuery();
	 }catch(Exception e)
	 {
		 System.out.println("ReadAllContact Exception"+e);
	 }
	 return rs;
	 
  }
	 
}
