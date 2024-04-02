package com.model;
public class Book {
 private int id;
 private String Name;
 private Double Price;
 
 public Book() {
	// TODO Auto-generated constructor stub
}

public Book(int id, String name, Double price) {
	super();
	this.id = id;
	Name = name;
	Price = price;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public Double getPrice() {
	return Price;
}

public void setPrice(Double price) {
	Price = price;
}

@Override
public String toString() {
	return "Book [id=" + id + ", Name=" + Name + ", Price=" + Price + "]";
}
 
 
 
}
