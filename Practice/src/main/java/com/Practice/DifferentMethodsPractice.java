package com.Practice;

public class DifferentMethodsPractice {
	static int num = 100;
	//static method
	static void display()
	{
		System.out.println("Number== static====="+num);
	}
	
	//non static method and default method
	public void nonstaticdisplay()
	{
		System.out.println("number===non static ======"+num);
	}
	

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		display();
	
		
		

	}

}
