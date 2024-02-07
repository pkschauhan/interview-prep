package com.logical;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatingCharacterUsingJava7 {

	public static void main(String[] args) {
		findFirstNonRepeatableCharacter();
	}

	private static void findFirstNonRepeatableCharacter() {
		String name = "abcba";
		Map<Character, Long> map = new LinkedHashMap<>(); // LinkedHashMap to maintain order

		for (Character c : name.toCharArray()) {
			Long count = map.get(c) != null ? map.get(c) + 1 : 1;
			map.put(c, count);
		}

		printCharacter(map);
	}

	private static void printCharacter(Map<Character, Long> map) {
		for (Entry<Character, Long> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println("First Non repeating character is: " + entry.getKey());
				break;
			}
		}
	}
}
