package com.java8;

import com.java8.dto.Fruit;
import com.java8.dto.TestData;

public class AllMatch {

	public static void main(String[] args) {
		/* The allMatch() operation checks whether all the elements of the
		stream match the given predicate.*/
		
		// if all calories >20 then it will return ture otherwise false.
		boolean isCaloriesLow = TestData.getAllFruits().stream().allMatch((Fruit f)->f.getCalories()>20);
		System.out.println("isCaloriesLow="+isCaloriesLow);
	}

}
