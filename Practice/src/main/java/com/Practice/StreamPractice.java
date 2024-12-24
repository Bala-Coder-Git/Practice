package com.Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		List<Integer> al1 =Arrays.asList(2,3,22,44,56,22,23,23,27,2,256,278,87,98,278);
		
		
		al1.stream().filter(e->e%2==0).collect(Collectors.toList());
		al1.stream().collect(Collectors.toSet());
		al1.stream().sorted().collect(Collectors.toList());
		al1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		
		  HashMap<String, Integer> subjectToStudentCountMap1 = new HashMap<>();
	         
	        subjectToStudentCountMap1.put("Maths", 45);
	        subjectToStudentCountMap1.put("Physics", 57);
	        subjectToStudentCountMap1.put("Chemistry", 52);
	        subjectToStudentCountMap1.put("History", 41);
	         
	        //Map-2
	         
	        HashMap<String, Integer> subjectToStudentCountMap2 = new HashMap<>();
	         
	        subjectToStudentCountMap2.put("Economics", 49);
	        subjectToStudentCountMap2.put("Maths", 42);
	        subjectToStudentCountMap2.put("Biology", 41);
	        subjectToStudentCountMap2.put("History", 55);
	         
	        //Merging Map-1 and Map-2 into Map-3
	        //If any two keys are found same, their values are added
	         
	        HashMap<String, Integer> subjectToStudentCountMap3 = new HashMap<>(subjectToStudentCountMap1);
	         
			/*
			 * subjectToStudentCountMap2.forEach((key, value) ->
			 * subjectToStudentCountMap3.merge(key, value, (v1, v2)
			 */		
		//Frequecncy of each element in array
	/*Map<Integer, Integer> frequencyMap =	
			al1.stream().collect
		(Collectors.groupingBy(Function.identity(),Collectors.counting())).
		entrySet().stream().filter(entry->entry.getValue()>2).
		collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getKey));*/
		
		
		al1.stream().max(Comparator.naturalOrder()).get();
		
		
		
		
		//to get unique results or use distinct 
		Set<Integer> s = al1.stream().collect(Collectors.toSet());
		
		//to get duplicate values method1
		//al1.stream().filter(e-> Collections.frequency(al1 , e)>1).collect(Collectors.toSet());
		
		//method 2
		Set<Integer> dupl = new HashSet<Integer>();
		al1.stream().filter(e-> dupl.add(e)).collect(Collectors.toSet());
		
		//get the number starts with 2
		al1.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2")).
		map(Integer::valueOf).collect(Collectors.toList());
		
		//getsum of all numbers in map
		Optional<Integer> i  =al1.stream().reduce((e1,e2)->e1+e2);
		
		System.out.println("Balamma Anumathi+++++++++=="+al1.stream().mapToInt(e->e).sum());
		
		//print avg of numbers
		double d1 =al1.stream().mapToInt(e->e).average().getAsDouble();
		Optional<String> op =Optional.ofNullable(null);
	
		
		 //print square filter and avg
		double d =al1.stream().map(e->e*e).filter(e->e>100).mapToInt(e->e).average().getAsDouble();
		
		//get max and min numbers 
		al1.stream().max(Comparator.comparing(Integer::valueOf)).get();
		al1.stream().min(Comparator.comparing(Integer::valueOf)).get();
		
		//Sotr ASC 
		
		List<Integer> listASCOrder  =al1.stream().sorted().collect(Collectors.toList());
		
		
		System.out.println(listASCOrder);
		
		//Sort Desc
		
		List<Integer> listDescendingOrder =  al1.stream().sorted((a,b)->-b.compareTo(a) ).collect(Collectors.toList());
		al1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		
		//get first five numbers and thier sum
		al1.stream().limit(5).collect(Collectors.toList());
		//sum of firsr five
		al1.stream().limit(5).reduce((p,q)->p+q).get();
		//ignore fist five numbers 
		al1.stream().skip(5).reduce((p,q)->p+q).get();
		//Secondhighest & second lowest
		 Integer c = al1.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
		 Stream<Integer> b =al1.stream().sorted().limit(2).skip(1);
		 Integer secoundlowest = al1.stream().sorted().distinct().skip(1).findFirst().get();
		
		
		System.out.println(secoundlowest);
		
		
		
		
		
		
		double avg =al1.stream().
				map(e->e+e).
					mapToInt(e->e)
						.average().
							getAsDouble();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
