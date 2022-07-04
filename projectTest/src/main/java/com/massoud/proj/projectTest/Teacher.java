package com.massoud.proj.projectTest;

public class Teacher {
	private int id;
	private String name;
	private String lastName;
	private String [] courses;

	public Teacher(){

	}
	public Teacher(int id, String name, String lastName, String[] courses){
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.courses = courses
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}

	public String getName(){
		return name;
	}
	public String setName(String name){
		this.name = name;
	}

	public String getLastName(){
		return lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String[] getCourses(){
		return courses;
	}
	public void seCourses(String[] courses){
		this.courses = courses;
	}

	@Override
	public String toString(){
		return 	"name: " + name + 
				"\nlast name: "+ lastName +
				"\nid: "+ id;
	}

}
