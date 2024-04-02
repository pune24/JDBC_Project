package com.model;

public class Contact {

	private int contactNo;
	private String Name;
	
	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public Contact(int contactNo, String name) {
		super();
		this.contactNo = contactNo;
		Name = name;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Contact [contactNo=" + contactNo + ", Name=" + Name + "]";
	}

	
}
