package com.java8;

import com.java8.dto.TestData;

public class Count {

	public static void main(String[] args) {
		// The count() operation counts total number of elements in a stream.
		
		long count = TestData.getAllFruits().stream().count();
		System.out.println("count="+count);

	}

}
