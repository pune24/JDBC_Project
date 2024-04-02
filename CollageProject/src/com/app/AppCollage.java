package com.app;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.dao.CollageDAo;
import com.model.Collage;

public class AppCollage {

	public static void main(String[] args)  {
		Scanner ob1=new Scanner(System.in);
		int val=0;
		do {
		System.out.println("1.Add Record");
		System.out.println("2.delete Record");
		System.out.println("3.Update Record");
		System.out.println("4. Read All Record");
		
		System.out.println("enter the Your choice");
		int choice=ob1.nextInt();
		
		CollageDAo dao=new CollageDAo();
		switch (choice) {
		case 1:
			System.out.println("Enter the Cooalge id");
			int id=ob1.nextInt();
			
		System.out.println("Enter the Coolage  name");
		 ob1.nextLine();
		String name=ob1.nextLine();
	 
		
		System.out.println("Enter Couse the ");
		String couse=ob1.nextLine();
		
		Collage s1=new Collage(id, name, couse);
		 int i2=dao.saveCollageInformation(s1);
		 if(i2>0)
			 System.out.println("save Record ");
		 else System.out.println("not save Recod");
			break;
			
			
		case 2:
			System.out.println("Enter the Cooalge id");
			int idD=ob1.nextInt();
			Collage s3=new Collage();
			s3.setCollageId(idD);
			int i4=dao.DeleteCollageInformation(s3);
			if(i4>0)
				System.out.println("delete complted");
			else 
              System.out.println("not delted complted");
              break;
              
		case 3:
			System.out.println("Enter the Cooalge id");
			int idU=ob1.nextInt();
			
		System.out.println("Enter the Coolage  name");
		 ob1.nextLine();
		String nameU=ob1.nextLine();
	 
		
		System.out.println("Enter Couse the ");
		String couseU=ob1.nextLine();
		
		Collage s4=new Collage();
		  s4.setCollageId(idU);
		  s4.setCollageName(nameU);
		  s4.setCourse(couseU);
		  int i5=dao.UpdateCollageInformation(s4);
		  if(i5>0)
			  System.out.println("Update complted");
		  else System.out.println("update not complted");
			break;
            	  
			
		case 4:
			ResultSet rs=dao.ReadAllCollageInformation();
			System.out.println("ID  Name  Marks");
			System.out.println("____________________");
			 try {
			  while (rs.next()) {
				  
				  System.out.print(rs.getInt(1)+"  ");
				  System.out.print(rs.getString(2)+"  ");
				  System.out.println(rs.getString(3)+"  ");
			      }
			}catch (Exception e) {
				System.out.println("ReadAllCollageInformation Exception"+e);
			}
	
			 break;
			
			

		default:
			System.out.println("please correct choice");
			break;
		}
		
		System.out.println("Do You Want to Continue Press 1");
		val=ob1.nextInt(); 
		}while(val==1);

	

	}
}