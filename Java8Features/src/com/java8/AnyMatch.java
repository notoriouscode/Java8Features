package com.java8;

import com.java8.dto.Fruit;
import com.java8.dto.TestData;

public class AnyMatch {

	public static void main(String[] args) {
		/*
		 * The anyMatch() operation checks at least one element of the stream match the
		 * given predicate.
		 */

		boolean isCaloriesAvailable = TestData.getAllFruits().stream().anyMatch((Fruit f) -> f.getCalories() > 20);
		System.out.println("isCaloriesAvailable=" + isCaloriesAvailable);
	}

}
