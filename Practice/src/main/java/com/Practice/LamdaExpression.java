package com.Practice;

@FunctionalInterface
interface Add {
	
	void add(int a, int b);
	
}
@FunctionalInterface
interface Multiply{
	void multiply(int a, int b,long c);
	
}


public class LamdaExpression {

	public static void main(String[] args) {
		
	Add adInterface =(a,b)-> System.out.println("Adding  two numbers==="+(a+b));	
	adInterface.add(25, 35);
	
	Multiply multiplyInterfce =(a,b,c)-> System.out.println("multiplication======"+a*b*c);
	
	multiplyInterfce.multiply(7, 8,56);

	}

}
