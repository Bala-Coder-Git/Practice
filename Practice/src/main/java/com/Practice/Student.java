package com.Practice;

import java.util.List;

public class Student {
	private int id;
	private String firstname;
	private String lastName;
	private double salary;
	private String cityName;
	private int age;
	private  List<String> contacts;
   
	public Student(int id, String firstname, String lastName, double salary, String cityName, int age,
			List<String> contacts) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastName = lastName;
		this.salary = salary;
		this.cityName = cityName;
		this.age = age;
		this.contacts = contacts;
	}
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getContacts() {
		return contacts;
	}
	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", lastName=" + lastName + ", salary=" + salary
				+ ", cityName=" + cityName + ", age=" + age + ", contacts=" + contacts + "]";
	}
	
	
	
	

}
