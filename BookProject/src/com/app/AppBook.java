package com.app;

import java.sql.ResultSet;
import java.util.Scanner;

import com.dao.BookDAO;
import com.model.Book;



public class AppBook {

	public static void main(String[] args) {
		Scanner ob1=new Scanner(System.in);
		int val=0;
	do {
		System.out.println("1.Add Record");
		System.out.println("2.delete Record");
		System.out.println("3.Update Record");
		System.out.println("4. Read All Record");
		
		System.out.println("enter the Your choice");
		int choice=ob1.nextInt();
		
		
		BookDAO dao=new  BookDAO();
	 

	
		switch(choice)
		{
		case 1:
			System.out.println("Enter the id");
			int id=ob1.nextInt();
			
		System.out.println("Enter the name");
		 ob1.nextLine();
		String name=ob1.nextLine();
	 
		
		System.out.println("Enter the Price");
		double Price=ob1.nextDouble();
		
		Book s1=new Book(id, name, Price);
		int i2=dao.saveBookinformation(s1);
		if(i2>0)
			System.out.println("Saved Complted");
		else System.out.println("not complted Saving");
		break;
		
		case 2:
			System.out.println("Enter the id");
			int idD=ob1.nextInt();
			Book s3=new Book();
			s3.setId(idD);
			int i3=dao.deleteBook(s3);
			if(i3>0)
				System.out.println("Deeate complted");
			else
			System.out.println("delete not complted");
			break;
			
		case 3:
			System.out.println("Enter the id");
			int idU=ob1.nextInt();
			
		System.out.println("Enter the name");
		 ob1.nextLine();
		String nameU=ob1.nextLine();
	 
		
		System.out.println("Enter the Price");
		double PriceU=ob1.nextDouble();
		
		Book s4=new Book();
		s4.setId(idU);
		s4.setName(nameU);
		s4.setPrice(PriceU);
		  int i4=dao.UpdateBook(s4);
		  if(i4>0)
			  System.out.println("Upadte complted");
		  else System.out.println("Update not complted");
		break;
		
		case 4:
//			ResultSet rs=dao.ReadAllBook();
			ResultSet rs=dao.ReadAllBook();
			System.out.println("ID    Name    Price");
			System.out.println("____________________________");
			try {
			while (rs.next()) {
				
				System.out.print(rs.getInt("Id")+"    ");
				System.out.print(rs.getString("Name")+"   ");
				System.out.println(rs.getDouble("Price")+"   ");
			}
				
				
			}
	catch (Exception e) {
		System.out.println("Exception in ReadAllBook"+e);
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
	
