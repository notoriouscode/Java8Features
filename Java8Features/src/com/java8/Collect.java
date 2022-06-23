package com.java8;

import java.util.List;
import java.util.stream.Collectors;

import com.java8.dto.Fruit;
import com.java8.dto.TestData;

public class Collect {
	public static void main(String[] args) {
		
		/*
		 * The collector() is a terminal operation & it converts a stream into another
		 * form like List, Map etc. We passed Collector instance as operation parameter.
		 * The Collector instance can be obtained using different static methods from
		 * Collectors class.
		 */
		
		List<Fruit> mFruits = TestData.getAllFruits().stream()
				.filter(order -> order.getPrice() < 50)
				.collect(Collectors.toList());

	}
}
