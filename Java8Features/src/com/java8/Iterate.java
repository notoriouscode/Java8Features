package com.java8;

import java.util.stream.Stream;

public class Iterate {

	public static void main(String[] args) {
		/*The iterate() operation is used to iterate over the loop & perform some
		business logic in every iteration. It takes 2 arguments, an initial value
		and a lambda (of type Unary-Operator<T>).*/
		
		//Print first 15 prime numbers
		Stream.iterate(2, (n)->n+1).
		filter((n)-> {
			for(int i=2;i<n;i++) {
				if(n%i==0)
					return false;
			}
			return true;
		}).
		limit(15).
		forEach(System.out::println);

	}

}
