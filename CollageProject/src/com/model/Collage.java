package com.model;

public class Collage {
	private int collageId;
	private String CollageName;
	private String Course;
	public Collage() {
		// TODO Auto-generated constructor stub
	}
	public Collage(int collageId, String collageName, String course) {
		super();
		this.collageId = collageId;
		CollageName = collageName;
		Course = course;
	}
	public int getCollageId() {
		return collageId;
	}
	public void setCollageId(int collageId) {
		this.collageId = collageId;
	}
	public String getCollageName() {
		return CollageName;
	}
	public void setCollageName(String collageName) {
		CollageName = collageName;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	@Override
	public String toString() {
		return "Collage [collageId=" + collageId + ", CollageName=" + CollageName + ", Course=" + Course + "]";
	}
	

}
