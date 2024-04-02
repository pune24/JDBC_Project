package com.Utility;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.model.DBUtilityEmp;
import com.model.Emp;

public class AppEmp {

	public static void main(String[] args) throws SQLException {
		Scanner ob1=new Scanner(System.in);
		
		System.out.println("1.Add Record");
		System.out.println("2.Delete Record");
		System.out.println("3.Update Record");
		System.out.println("4.Read Record");
		
		System.out.println("enter the choice");
		int choice=ob1.nextInt();
      
		EmpDAO dao=new EmpDAO();
		
		switch(choice)
		{
		
		case 1:
			 System.out.println("enter the id");
	    	 int id=ob1.nextInt();
	    	 
	    	 System.out.println("enter the Name");
	    	 ob1.nextLine();
	    	 String name=ob1.nextLine();
	    	 
	    	 System.out.println("enter the marks");
	    	 double marks=ob1.nextDouble();
	    	 
	    	 Emp emp1=new Emp(id,name,marks);
	    	   int i=dao.saveEmp(emp1);
	    	   if(i>0)
	    		   System.out.println("Record Adding");
	    	   else System.out.println("Record not Adding");
	    	   break;
	    	   
		case 2:
			System.out.println("enter the id");
			int id1=ob1.nextInt();
			
			Emp emp2=new Emp();
			 emp2.setId(id1);
			  int i2=dao.saveEmp(emp2);
			  if(i2>0)
				  System.out.println("delete complted");
			  else System.out.println("deltet not complted");
			break;
			
		case 3:
			
			System.out.println("Enter the Id");
			int UId=ob1.nextInt();
			
			System.out.println("Enter the Name");
			String NameU=ob1.nextLine();
			ob1.nextLine();
			
			System.out.println("Enter the Marks");
			Double Umarks=ob1.nextDouble();
			 
			Emp empu=new Emp();
			empu.setId(UId);
			empu.setName(NameU);
			empu.setMarks(Umarks);
			dao.UpdateEmp(empu);
			break;
			
			
		case 4:
			ResultSet rs=dao.selectStudent();
			  System.out.println("ID  Name  Marks");
			  System.out.println("_______________________");
			     while (rs.next()) {
			    	 System.out.println(rs.getInt(1));
			    	 System.out.println(rs.getString(2));
			    	 System.out.println(rs.getDouble(3));
				}
			break;
			
		 default:
    		 System.out.println("please correct choice");
    		 break;
			
		
			
	    	   
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 

			
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
             
      
		     
		    	  
		    	 
		    	
		    	  
		    	  
		    	  
		    	 
		    	  
		    	  
		    	    
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		    	
		    	
		    	 
		    	 
		            
		    	 
		}
		

	}

}
