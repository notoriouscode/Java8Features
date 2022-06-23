package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.java8.dto.Fruit;
import com.java8.dto.TestData;

public class Reduce {
	public static void main(String[] args) {
		/*
		 * We use aggregate methods like SUM(), MAX(), MIN() etc. in SQL. The similar
		 * aggregation is possible using reduce() operation. Thus, reduce() operation
		 * combines elements of a stream to express more complicated queries.
		 */

		List<Integer> numbers = Arrays.asList(12, 56, 48, 9);
		int sumOfAllNumbers = numbers.stream().reduce(0, Integer::sum); // where ‘0’ is an initial value of
																		// sumOfAllNumbers.
		System.out.println("Sum="+sumOfAllNumbers);
		Optional<Integer> maxNumber = numbers.stream().reduce(Integer::max);
		System.out.println("maxNumber="+maxNumber);


	}
}
