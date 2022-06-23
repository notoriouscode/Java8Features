package com.java8;

import java.util.Comparator;

import com.java8.dto.Fruit;
import com.java8.dto.TestData;

public class SortingByComprator {

	public static void main(String[] args) {

		// by lambda
		
//		// comparator always takes two argument and return the result
//		Comparator<Fruit> mComparator = (Fruit f1, Fruit f2) -> {
//			if (f1.getCalories() > f2.getCalories()) {
//				return 1;
//			} else if (f1.getCalories() < f2.getCalories()) {
//				return -1;
//			} else
//				return 0;
//		};
//
//		TestData.getAllFruits().stream().sorted(mComparator)
//		.forEach(System.out::println);
		
		
		
		// by method reference
		
		//accending order by calories
		TestData.getAllFruits().stream().sorted(Comparator.comparing(Fruit::getCalories))
				.forEach(System.out::println);
		
		//decending order by calories
		TestData.getAllFruits().stream().sorted(Comparator.comparing(Fruit::getCalories).reversed())
		.forEach(System.out::println);
	}

}
