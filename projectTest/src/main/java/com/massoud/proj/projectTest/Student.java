package com.massoud.proj.projectTest;
import  com.massoud.proj.projectTest.Teacher;

public class Student {
	private String name;
	private String lastName;
	private String address;
	private String postalCod;
	private List<Teacher> teachers;

	public Student(){

	}
	public Student( String name, String lastName, String address, String postalCod){
		this.name = name;
		this.lastName = lastName;
		this.address = address;
		this.postalCod = postalCod;
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getLastName(){
		return lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}

	public String getPostalCod(){
		return postalCod;
	}
	public void setPostalCod(String postalCod){
		this.postalCod = postalCod;
	}

	public List<Teacher> getAllTeacher(){
		return teachers;
	}
	public void addTeacher(Teacher teacher){
		teachers.add(teacher);
	}

	@Override
	public String toString(){
		return 	"name: " + name + 
				"\nlast name: "+ lastName +
				"\npostal code: "+ postalCod +
				"\naddress: " + address;
	}

}
