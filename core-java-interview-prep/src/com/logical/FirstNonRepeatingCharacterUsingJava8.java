package com.logical;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacterUsingJava8 {

	public static void main(String[] args) {
		String name = "abcab";
		
		Character firstNonRepeatableChar = name.chars()
		    .mapToObj(x -> (char)x)
		    .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		    .entrySet()
		    .stream()
		    .filter(e -> e.getValue() == 1)
		    .findFirst()
		    .map(Map.Entry::getKey)
		    .get();
		    
	    System.out.println(firstNonRepeatableChar);

	}

}
