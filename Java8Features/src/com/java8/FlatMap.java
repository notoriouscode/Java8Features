package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

	public static void main(String[] args) {
		/*
		 * The flatMap() operation is a combination of a map & a flat operation. This
		 * means you first apply map function and than flattens the result.
		 */

		Stream<List<Integer>> stream = Stream.of(Arrays.asList(1, 2, 3), Arrays.asList(1, 12, 30),
				Arrays.asList(11, 2, 13));
		List<Integer> flatIntList = stream.flatMap(List::stream).collect(Collectors.toList());
	}
}
