package com.java8;

import com.java8.dto.Fruit;
import com.java8.dto.TestData;

public class NoneMatch {

	public static void main(String[] args) {
		/*
		 * The noneMatch() is opposite to allMatch() operation. The noneMatch() checks
		 * whether no element in the stream match the given predicate.
		 */

		boolean isCaloriesAvailable = TestData.getAllFruits().stream().noneMatch((Fruit f) -> f.getCalories() > 20);
		System.out.println("isCaloriesAvailable=" + isCaloriesAvailable);
	}

}
