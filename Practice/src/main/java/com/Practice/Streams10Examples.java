package com.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams10Examples {
	public static void main(String[] args) {
		// Print sum of numbers
//		List<Integer> as  =new ArrayList<Integer>();
		List<Integer> al=Arrays.asList(21, 6, 8, 9, 8, 6, 22, 6, 4, 5,10);
		
      
		 Set<Integer> as= new HashSet<Integer>(); 
        
		  System.out.println(as);
         as.add(3);
         as.add(2);
         as.add(null);
         as.add(1);
         as.add(6);
         as.add(4);
         as.add(null);
     	System.out.println(as);
		// Print avg

		System.out.println("average========"+al.stream().mapToInt(e -> e).average().getAsDouble());
		System.out.println("Sum========"+al.stream().mapToInt(e -> e).sum());
		//square
		al.stream().map(e -> e * e).collect(Collectors.toList());
		//filter
		al.stream().filter(e -> e > 5).collect(Collectors.toList());
		//Sorted
		System.out.println("NaturalSorting ===="+al.stream().sorted().collect(Collectors.toList()));// asc
		System.out.println("reverse sorting====="+al.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));//desc
		al.stream().sorted((a,b)->a.compareTo(b));//asc
		al.stream().sorted((a,b)->-a.compareTo(b));//desc
		System.out.println("Starts with 2====="+al.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2")).
		map(Integer::parseInt).collect(Collectors.toList()));//starts with 2
		
		System.out.println("duplicates=1===="+	al.stream().filter(e-> Collections.frequency(al,e) ==2 ).
		                         collect(Collectors.toList())
		);
		System.out.println("duplicates====="+al.stream().filter(e-> Collections.frequency(al,e) >1 ).collect(Collectors.toSet()));
		//System.out.println("Count====="+al.stream().filter(e-> Collections.frequency(al,e) >1 ).count());
		
		
		List<Integer> duplicate =al.stream().filter(e-> Collections.frequency(al, e)>1).collect(Collectors.toList());
		System.out.println("duplicates====="+duplicate);
		
		//get 1 5 numbers
		System.out.println("First five============"+al.stream().limit(5).collect(Collectors.toList()));
		
		System.out.println("skip five============"+al.stream().skip(5).collect(Collectors.toList()));
		
		
		// print square filter and avg

		al.stream().reduce((e1, e2) -> e1 + e2);

		Optional<Integer> opt = al.stream().reduce((e1, e2) -> e1 + e2);
		// Print avg
		double d = al.stream().mapToInt(e -> e).average().getAsDouble();
		double da = al.stream().mapToInt(e -> e).average().getAsDouble();

		// print square filter and avg
		OptionalDouble op = al.stream().map(e -> e * e).filter(e -> e > 10).mapToInt(e -> e).average();
		// print evn and odd
		List<Integer> L = al.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());

		List<Integer> l = al.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());
		// print integer strasWith 2
//	al.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2").map(Integer::ParsInt)

		List<Integer> L2 = al.stream().map(e -> String.valueOf(e)).filter(s -> s.startsWith("2")).map(Integer::parseInt)
				.collect(Collectors.toList());
		// Print duplicates
		// al.stream().filter(Collections.frequency(al,
		// e)>1).collect(Collectors.toList());
		// print uniques use distinct
		// Print min and max
		al.stream().sorted().findFirst();
		al.stream().sorted(Comparator.reverseOrder()).findFirst();
		al.stream().sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());
		al.stream().sorted((a, b) -> -b.compareTo(a)).collect(Collectors.toList());
		// get and ignore 1 st 5 numbers
		al.stream().limit(5).collect(Collectors.toList());
		al.stream().skip(5).collect(Collectors.toList());
		// getscound lowest and secound highest
		Integer c = al.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
		Stream<Integer> b = al.stream().sorted().limit(2).skip(1);
		Integer secoundlowest = al.stream().sorted().distinct().skip(1).findFirst().get();
		Stream<String> stream = Stream.of("Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks");

// Check if Character at 1st index is 
// UpperCase in any string or not using 
// Stream anyMatch(Predicate predicate) 
              //al.anyMatch(str -> Character.isUpperCase(str.charAt(1))).collect(Collectors.toList());

		boolean ans = al.stream().anyMatch(e -> e == 100);

		List<Integer> inth = al.stream().distinct().collect(Collectors.toList());
		Set<Integer> intg = al.stream().collect(Collectors.toSet());

		al.stream().max(Comparator.naturalOrder()).get();

		List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

		List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
//How do you find common elements between two arrays

		System.out.println("common elements two lists"
		+list1.stream().filter(list2::contains).collect(Collectors.toList()));
		
		//forEach(System.out::println);

	}

}
