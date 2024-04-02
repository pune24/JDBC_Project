package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.Collage;
import com.utility.DBCollage;

public class CollageDAo {
	public int saveCollageInformation(Collage collage)
	{
		 int i2=0;
Connection con=DBCollage.getConnection();
String sql="insert into collage values(?,?,?)";
 try {
 PreparedStatement ps=con.prepareStatement(sql);
   ps.setInt(1,collage.getCollageId());
   ps.setString(2,collage.getCollageName());
   ps.setString(3,collage.getCourse());
     i2=ps.executeUpdate();
	}catch (Exception e) {
		System.out.println("Exception in saveCollageInformation"+e);
	}
  return i2;
}

	 public int DeleteCollageInformation(Collage collage)
	 {
		  int i5=0;
	Connection con=DBCollage.getConnection();
	 String sql="delete from collage where collageId=?";
	  try {
	 PreparedStatement ps=con.prepareStatement(sql);
	  ps.setInt(1,collage.getCollageId());
	   i5=ps.executeUpdate();
	
	 }catch (Exception e) {
		System.out.println("Exception in  DeleteCollageInformation"+e);
	}
	  return i5;
	   
	 }
	 
	 public int UpdateCollageInformation(Collage collage)
	 {
		  int i4=0;
	Connection con=DBCollage.getConnection();
//	String sql=" update collage set CollageName=? , Course=?  where  collageId=?";
	String sql = "update collage set collageName=? , Course=? where collageId=?";

//	 String sql="update student set name=? , marks=? where id=?";
//	String sql="update student set name=? , marks=? where id=?";
	try {
	  PreparedStatement ps=con.prepareStatement(sql);
       ps.setInt(1,collage.getCollageId());
       ps.setString(2,collage.getCollageName());
       ps.setString(3,collage.getCourse());
         i4=ps.executeUpdate();
	 }catch (Exception e) {
		System.err.println("UpdateCollageInformation Exception"+e);
	}
	 return i4;
	 }
	 
	 
	 public ResultSet ReadAllCollageInformation()
	 {
			ResultSet rs=null;
Connection con=DBCollage.getConnection();
String sql="select *from collage";
 try {
	 PreparedStatement ps=con.prepareStatement(sql);
   rs=ps.executeQuery(); 
 }catch (Exception e) {
	System.out.println("ReadAllCollageInformation Exception"+e);
}
 return rs;
	}
	 
	 
}
