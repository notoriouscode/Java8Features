package com.java8;

import com.java8.dto.TestData;

public class Skip {
	public static void main(String[] args) {
		TestData.getAllFruits().stream().skip(2)
		.forEach(System.out::println);
	}
}
