package com.Practice;

import java.util.HashMap;

public class Map {
	static HashMap<Integer,Integer> map = new HashMap<>();
	public static void method1(int i)
	{  
	
		method2(map,i);
		
		
	}
	public static void method2(HashMap<Integer,Integer> map1,int i)
	{
		map1.put(i, i);
		System.out.println(map1);
		
	}
	

	public static void main(String[] args) {
		for (int i =1;i<100;i++)
			
		{
			method1(i);
			
		}
       
	}

}
