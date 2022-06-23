package com.java8;

import java.util.function.Predicate;

import com.java8.dto.Fruit;
import com.java8.dto.TestData;

public class FilterDemo {

	public static void main(String[] args) {

		//get all the fruits those calories is less then 100.
		TestData.getAllFruits().stream().filter((Fruit fruit)->fruit.calories<100).forEach(System.out::println);
	}

}
