package com.Practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Demo {
	public String generateOTP()
	{
	  int otpR =(int) (Math.random()*9000)+1000;
		String otp =String.valueOf(otpR);
		
		return otp;
	}
	
	public String genearteEncryptMobileNumber(String s)
	{
		s=s.replaceAll(".(?=.{2})", "#");
		
		Pattern p = Pattern.compile("[^a-z]?");
		Matcher m =p.matcher("anumathibalamma");
		System.out.println("Pattren==========="+m.find());
		
		return s;
	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		System.out.println("OTP============="+d.generateOTP());
		System.out.println("Encrypted phone number "+d.genearteEncryptMobileNumber("99999447465"));
	    //d.balamma();
		
		List<Character> al =  Arrays.asList('1','0','1','1','1','0','0','0','1');

		List<Character> ch = Arrays.asList('G', 'e', 'e', 'k', 's', 'f',
                'o', 'r', 'G', 'e', 'e', 'k', 's');
		String chString = al.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
		
		System.out.println(chString);
	
		for(Character c:ch)
		{
			System.out.println(c);
		}
		
		al.stream().forEach(System.out::println);
		
		
		
		String s = "1011100010101011100101000101110";
		
		
		String s1 = al.stream().map(String::valueOf).collect(Collectors.joining());
	
		 s.chars().mapToObj(c->(char)c).collect(Collectors.
				  groupingBy(c->c));
		 System.out.println( s.chars().mapToObj(c->(char)c).collect(Collectors.
				  groupingBy(c->c)));
			Map<Object, List<Character>> m =s.chars().mapToObj(c->(char)c).collect(Collectors.
				  groupingBy(c->c));
			/*
			 * Collection<List<Character>> chars= m.values(); StringBuilder sb = new
			 * StringBuilder(); for (List<Character> ch: chars) { sb.append(ch); }
			 */
			//System.out.println( "sb====================="+	sb);
			
		  
		//java.util.Map<Integer, Long> mp =al.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println((al.stream().sorted().collect(Collectors.toList())));
		al.stream().map(e->String.valueOf(e)).map(c->c.toCharArray()).sorted().collect(Collectors.toList());
		
		 System.out.println( al.stream().map(e->String.valueOf(e)).map(c->c.toCharArray()).sorted().
				 collect(Collectors.toList()));
		
		
		 //retrive map
			/*
			 * for (Map.Entry<Integer,Long> entry :mp.entrySet() ) { entry.getKey();
			 * 
			 * }
			 */
		 
		List<Character> list =new ArrayList<>();
		
		 Map<Object,List<Character>> c1 = s.chars().mapToObj(c->(char)c).collect(Collectors.
		  groupingBy(c->c));
		 System.out.println( ((Collection<Integer>) c1).stream().map(String::valueOf)
		    .collect(Collectors.joining(",")));
		 
		 System.out.println( al.stream().map(e->String.valueOf(e)).map(c->c.toCharArray()).sorted().
				 collect(Collectors.toList()));
		
		
		
		
			/*
			 * System.out.println(al.stream(). sorted((a,b)->
			 * -a.compareTo(b)).distinct().skip(1).findFirst());
			 * //mapToInt(s->s).getdouble();
			 * 
			 * al.stream().collect(Collectors.groupingBy(Function.identity(),
			 * Collectors.counting())); //al.stream().collect(Collections.frequency(al, s )>
			 * 7)); Set<Integer> set = new HashSet<Integer>();
			 * al.stream().map(s->!set.add(s)).collect(Collectors.toList());
			 */
		
		System.out.println("Balamma=================================Balamma Anumathi");
		
	
		
	}

}
