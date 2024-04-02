package com.Utility;

import java.sql.Connection;
//import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.DBUtilityEmp;
import com.model.Emp;
import com.utility.DBUtility;

public class EmpDAO {
	


	public int saveEmp(Emp emp)
	{
		 PreparedStatement ps=null;
		int val=0;
	Connection con=DBUtilityEmp.getConnection();
	 String sql="insert into emp values(?,?,?)";
	 try {
	ps=con.prepareStatement(sql);
	  
	 ps.setInt(1,emp.getId());
	 ps.setString(2,emp.getName());
	 ps.setDouble(3,emp.getMarks());
	 }catch (Exception e) {
		System.out.println("EmpADO class Exception"+e);
	}
	 return val;
}
	
	public int UpdateEmp(Emp emp)
	{
		int i=0;
	Connection con=DBUtilityEmp.getConnection();
	 String sql="update emp set name=? , marks=? where id=?";
	 try {
	   PreparedStatement ps=con.prepareStatement(sql);
	      ps.setString(1,emp.getId()+" ");
	      ps.setString(2,emp.getName()+" ");
	      ps.setDouble(3,emp.getMarks());
	      
	      i=ps.executeUpdate();
	      if(i>0)
	    	  System.out.println("UPdate Complted");
	      else System.out.println("UPdate not complted");
	   }catch (Exception e) {
	     System.out.println("UdateEmp Exception will be Prsent"+e);
	   }
	 
	   return i;
	}
	 
	 
	 
	 public int delteteEmp(Emp emp)
	 {
		 PreparedStatement ps=null;
		 Connection con1=DBUtilityEmp.getConnection();
		 String sql1="delete from emp where id=?;";
		 int val1=0;
		 try
		 {
			 ps=con1.prepareStatement(sql1);
			 ps.setInt(1,emp.getId());
			 val1=ps.executeUpdate();
		 }catch (Exception e) {
			System.out.println("Exception Occured in save student"+e);
		}
		 return val1;
	 }
		 
		 
		 public ResultSet  showALLStudent()
		 {
			 PreparedStatement ps=null;	
				
				
				Connection con=DBUtilityEmp.getConnection();
				String sql="select * from emp";
				java.sql.ResultSet rs = null;
				try
				{
					ps=con.prepareStatement(sql);
					
					rs=ps.executeQuery();
				}
				catch (Exception e) {
					System.out.println("Exception ocuured in Select Records"+e);
				}
				
				return rs;
			 
		 }
		 
		 public ResultSet selectStudent() throws SQLException
		 {
		 	 PreparedStatement ps=null;	
		 	
		 		
		 		Connection con=ps.getConnection();
		 		String sql="select * from emp";
		 		java.sql.ResultSet rs = null;
		 		try
		 		{
		 			ps=con.prepareStatement(sql);
		 			
		 			rs=ps.executeQuery();
		 		}
		 		catch (Exception e) {
		 			System.out.println("Exception ocuured in Select Records"+e);
		 		}
		 		
		 		return rs;
		 }

	 
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public int saveEmp(Emp emp)
//	{
//		  PreparedStatement ps=null;
//		  int val=0;
//	Connection con=DBUtilityEmp.getConnection();
//	  String sql="insert into emp values(?,?,?)";
//	  try {
//ps=con.prepareStatement(sql);
//	  ps.setInt(1,emp.getId());
//	  ps.setString(2,emp.getName());
//	  ps.setDouble(3,emp.getMarks());
//	  
//	}catch(Exception e)
//	  {
//		System.out.println("EmpDAO Exception class"+e);
//	  }
//	  return val;
//	
//}






















//	   public int saveEmp(Emp emp)
//	   {
//		   PreparedStatement ps=null;
//	int val=0;
//	Connection con=DBUtilityEmp.getConnection();
//	String sql="insert into emp values(?,?,?)";
//	try {
//ps=con.prepareStatement(sql);
//	ps.setInt(1,emp.getId());
//	ps.setString(2, emp.getName());
//	ps.setDouble(3,emp.getMarks());
//	}catch(Exception e)
//	{
//		System.out.println(e);
//	}
//	 return val;
//	
//	   }
		
		 
	   
	
	
	
	
	
	
	
	
	
	
//	public int saveEmp(Emp emp)
//	{
//		PreparedStatement ps=null;
//		int val=0;
//Connection con=DBUtilityEmp.getConnection();
//String sql="insert into emp values(?,?,?)";
//
//try {
// ps=con.prepareStatement(sql);
// ps.setInt(1,emp.getId());
// ps.setString(2,emp.getName());
// ps.setDouble(3, emp.getMarks());
// 
//}catch (SQLException e) {
//	System.out.println("EmpDAO class Exception"+e);
//}
	
//return val;
//	}
	
		
	


