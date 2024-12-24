package com.Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DemoTest {

	public static void main(String[] args) {
		List<Integer> al =  Arrays.asList(2,4,6,7,9,8,8,9,9,
				10,20,21,22,7,6,35,50);
		
		System.out.println(al.stream().distinct().collect(Collectors.toList()));
		
		
	}

}
