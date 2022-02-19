package com.example.Maven.guava_example;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		 
		Multiset<String> animals = HashMultiset.create();
		
		animals.add("cat");
		animals.add("rat");
		animals.add("dog");
		
		animals.forEach(System.out::println);
	}
}
