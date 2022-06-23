package com.java8;

import com.java8.dto.Fruit;
import com.java8.dto.TestData;

public class Map {

	public static void main(String[] args) {
	/*	The map() operation allows us to select specific information from
		objects. For example, in SQL you can select a particular column from a
		table. */
		
		// by lambda
		TestData.getAllFruits().stream().map((Fruit f)->f.getCalories())
		.forEach(System.out::println);
		
		// by method reference
		TestData.getAllFruits().stream().map(Fruit::getCalories)
		.forEach(System.out::println);
	}

}
