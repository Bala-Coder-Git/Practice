package com.Practice;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(22);
		ts.add(1);
		ts.add(10);
		ts.add(11);
		ts.add(25);
		ts.add(1);
		ts.add(300);
		ts.add(111);
		ts.remove(22);
		TreeMap<Integer,Integer> tmp = new TreeMap<Integer,Integer>();
		tmp.put(1,1);
		tmp.put(1, 10);
		tmp.put(1, null);
		tmp.put(2, null);
		tmp.put(3, null);
		
		for (Integer t :ts)
		{
			//System.out.println(t);
			//ts.remove(10);
			
		}
		
		ConcurrentHashMap<Integer,Integer> chp = new ConcurrentHashMap<Integer,Integer>();
		chp.put(1, 3);
		chp.put(2, 4);
		System.out.println("Concurrenthashmap+++++++++++++++="+chp);
		
		//Iterator<Integer> it = chp.keySet().iterator();
		
		HashMap<String,String> myMap = new HashMap<String,String>();
		myMap.put("1", "1");
		myMap.put("2", "1");
		myMap.put("3", "1");
		myMap.put("4", "1");
		myMap.put("5", "1");
		myMap.put("6", "1");
		System.out.println("ConcurrentHashMap before iterator: "+myMap);
		
		
		
		
		
		for (Integer t :ts)
		{
			System.out.println(t);
			ts.remove(10);
			
		}
		
		
		// tmp.put(null, null); 
		 
		System.out.println("treemap====================2"+tmp);
        //ts.add(null);
		ts.add(22);
		ts.add(1);
		ts.add(10);
		ts.add(11);
		ts.add(25);
		ts.add(1);
		ts.add(300);
		ts.add(111);
		ts.remove(22);
		
		System.out.println("treeset====================2"+ts);

		Hashtable<Integer,Integer>  hb = new Hashtable<>();
		hb.put(1,1);
		hb.put(1, 10);
		hb.put(2, 5);
		hb.put(3, 6);
		hb.put(null, 10);
		System.out.println("hashtable========================"+hb);
		
		//hb.put(null, null);
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(null, null);
		hm.put(1, null);
		hm.put(null,2);
		hm.put(1, 3);
		System.out.println("Hashmap===================="+hm);
		

		List<Integer> studentMarks  = Arrays.asList(24,45,36,33,55,39);
		System.out.println("============balamma Anumathi=================");
		System.out.println("Before mapping "+studentMarks);
		//map method
		studentMarks =	studentMarks.stream().map(x->x-5).collect(Collectors.toList());
		System.out.println("After mapping "+studentMarks);
		//filter method
		
		studentMarks =	studentMarks.stream().filter(x->x>30).collect(Collectors.toList());
		System.out.println("After filtering "+studentMarks);
		//count method
		long count	=studentMarks.stream().count();
		System.out.println("Count of Elements==="+count);
		
		 studentMarks  = Arrays.asList(24,45,36,33,55,39);
		
		// normal foreach method 
		 for(Integer i :studentMarks)
		 {
			 System.out.println("foreach ====="+i);
			 
		 }
		 class PracticeForeach
		 {
			List<Integer > studentMarks2  = Arrays.asList(24,45,36,33,55,39);
			 public void number () {
				 System.out.println("practice For Each");
				
			 }
			 
			// int i = studentMarks2.stream().forEach(PracticeForeach:: number);
		 }
		 
		// streams foreach method
		 
		
		 
		
		
		
		

	}

}
