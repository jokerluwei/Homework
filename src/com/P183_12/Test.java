package com.P183_12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
	String s;
	Map<Integer, Integer> container;

	public static void main(String[] args) {
		new Test();
	}

	public Test() {
		Scanner reader = new Scanner(System.in);
		s = reader.nextLine();
		Integer value = 1;
		Integer key;
		container = new HashMap<Integer, Integer>();
		for (int i = 0; i < s.length(); i++) {
			key = (int) s.charAt(i);
			if (container.containsKey(key)) {
				Integer v = container.get(key);
				container.put(key, ++v);
			} else {
				container.put(key, value);
			}
		}
		for (Object ob : container.keySet()) {
			System.out.println(ob + " " + container.get(ob));
		}
		reader.close();
	}

}
