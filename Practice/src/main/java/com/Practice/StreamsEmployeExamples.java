package com.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;  

public class StreamsEmployeExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studentList = new ArrayList<Student>();
		
		Student s1 = new Student(4, "Bala", "anumathi", 2200, "Ongole", 1, Arrays.asList("68687687"));
		Student s2 = new Student(1, "Kittu", "Dog", 5000, "guntur", 2, Arrays.asList("9984872364"));
		Student s3 = new Student(2, "Kumar", "Teylidu", 600, "Emo", 3, Arrays.asList("246546752"));
		Student s4 = new Student(3, "Naresh", "ganta", 7000, "Ongole", 4, Arrays.asList("65878573465"));
		Student s5 = new Student(5, "Sai", "Mamidala", 10000, "CPT", 5, Arrays.asList("634759685"));
		Student s6 = new Student(6, "Shankar", "Mamidala", 22000, "CPT", 6, Arrays.asList("007235"));
		Student s7 = new Student(7, "Kiran", "Nagarikanti", 44000, "KGR", 7, Arrays.asList("36789456"));
		Student s8 = new Student(8, "Sambaiah", "Anumati", 67844, "KGR", 8, Arrays.asList("36493485738457"));
		Student s9 = new Student(9, "Sambaiah", "Anumati", 67844, "KGR", 8, Arrays.asList("36493485738457"));
		
		studentList.add(0, s1);
		studentList.add(1, s2);
		studentList.add(2, s3);
		studentList.add(3, s4);
		studentList.add(4, s5);
		studentList.add(5, s6);
		studentList.add(6, s7);
		studentList.add(7, s8);
		studentList.add(8, s9);
		
		//sal >50000
		
		List<Student> studentListSal =studentList.stream().
				filter(Student->Student.getSalary()>50000).collect(Collectors.toList());
				
		//System.out.println(studentListSal);
		
		//cityname =ongole
		
		List<Student> cityNme= studentList.stream().filter(s->s.getCityName().equals("Ongole")).
				sorted(Comparator.comparing(Student::getFirstname)).collect(Collectors.toList());
	
		//System.out.println(cityNme);
		
		//rank >5
		
		List<Student> idgt5  =	studentList.stream().
		     sorted(Comparator.comparing(Student::getId)).
				collect(Collectors.toList());
		
		List<Student> idgt6  =	studentList.stream().
			     sorted(Comparator.comparing(Student::getId,Comparator.reverseOrder())).
					collect(Collectors.toList());
		System.out.println("id====================="+idgt5);
		System.out.println(idgt6);
		
		//get all distinct  firtname and last name 
	List<String> firstnamelastaname = 
			studentList.stream().map(s->s.getFirstname()+"-" + " " +s.getLastName()).distinct().collect(Collectors.toList());
	
     System.out.println(firstnamelastaname);
     
     List<Integer> l = new ArrayList<Integer>();
     HashMap<Integer,String> map = new HashMap<Integer,String>();  
     map.put(1, "bala");
     map.put(2, "anumati");
     map.put(1, "Balamma Anumathi");
     Set<Integer> hset = new HashSet<Integer>();
     hset.add(2);
     hset.add(2);
     hset.add(2);
     
     System.out.println("========================contacts============================"+studentList.stream().
    		 flatMap(s->s.getContacts().stream()).collect(Collectors.toList()));
     List<Integer> list1 =   Arrays.asList(1,2,3,3,4);
     List<Integer> list2 =   Arrays.asList(1,2,3,3,4);
     List<List<Integer>> ll= Arrays.asList(list1,list2);
    
	
		//find the all contact numbers using flatmap
	
	
	studentListSal.stream().flatMap(s->s.getContacts().stream()).collect(Collectors.toList());
	
	//onetoone map(firstnamelast name)only one
	//oneTomany--flatmap(Contacts so many)
	
//	Groupby
	System.out.println("groupyingBy===="+studentList.stream().collect(Collectors.groupingBy(Student::getCityName)));
		
		
		
		
	}

}
