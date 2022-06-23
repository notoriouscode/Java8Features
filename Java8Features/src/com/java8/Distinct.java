package com.java8;

import com.java8.dto.TestData;

public class Distinct {
	public static void main(String[] args) {
		
		//its remove the duplicate values. 
		//require to implement equals and hasCode method in model class
		TestData.getAllFruits().stream().distinct()
		.forEach(System.out::println);
	}
}
