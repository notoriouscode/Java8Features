package com.java8;

import java.util.Comparator;

import com.java8.dto.Fruit;
import com.java8.dto.TestData;

public class LimitDemo {
	public static void main(String[] args) {
		TestData.getAllFruits().stream().limit(2)
		.forEach(System.out::println);
	}
}
