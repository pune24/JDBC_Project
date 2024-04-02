package com.App;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.dao.ContactDAO;
import com.model.Contact;
import com.model.student;

public class AppConatct {

	public static void main(String[] args) throws SQLException {
		
		Scanner ob1=new Scanner(System.in);
		int val=0;
		do {
		System.out.println("1.Add");
		System.out.println("2.Delete");
		System.out.println("3.Update");
		System.out.println("4. Read All");
		
		System.out.println("enter the choice");
		int choice=ob1.nextInt();
		
		ContactDAO dao=new ContactDAO();
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter the Cid");
			int contactId=ob1.nextInt();
			
		System.out.println("Enter the Cname");
		 ob1.nextLine();
		String contactName=ob1.nextLine();
	 
		
		
		
		Contact s1=new Contact(contactId,contactName);
		int i=dao.saveContact(s1);
		if(i>0)
			System.out.println("insert Record complted");
		else System.out.println("fail the insert Record");
			break;
		
		
		case 2:
			System.out.println("Enter the student id");
			int contactD=ob1.nextInt();
			Contact s2=new Contact();
			s2.setContactNo(contactD);
			int dRecord=dao.DeleteConatct(s2);
			if(dRecord>0)
				System.out.println("Record Delete");
			else System.out.println("Record not deleted");
			break;
			
		case 3:
			System.out.println("Enter the contactId");
			int contactId2=ob1.nextInt();
			
		System.out.println("Enter the Contactname");
		 ob1.nextLine();
		String nameConatct=ob1.nextLine();
	 

		
		Contact sU=new Contact();
		sU.setContactNo(contactId2);
		sU.setName(nameConatct);
		dao.UpdateContact(sU);
		
		
		break;
			
		
			
		case 4:
			ResultSet rs=dao.ReadAllContact();
			
			System.out.println("ID  Name  Marks");
//			System.out.println("____________________");
			while (rs.next()) {
				System.out.print(rs.getInt(1)+" ");
				System.out.print(rs.getString(2));
			}	
			break;
			
			
		default:
			System.out.println("please correct choice inputn");
		    break;
			}
				System.out.println("Do You Want to Continue Press 1");
				val=ob1.nextInt(); 
				} while(val==1);
			
				 
			
				
			
			
			
			
			
		
		

	

}
}
