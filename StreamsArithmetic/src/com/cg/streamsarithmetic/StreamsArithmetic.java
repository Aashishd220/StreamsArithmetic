package com.cg.streamsarithmetic;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamsArithmetic {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		// adding random numbers in arrayList
		for (int i = 0; i < 10; i++) {
			list.add(1 + (int) (Math.random() * 1000));
		}
		// using predicate function performing different operations
		Predicate<Integer> isEven = number -> number % 2 == 0;
		Predicate<Integer> isOdd = number -> number % 2 != 0;
		Predicate<Integer> isDivisibleBySix = number -> number % 6 == 0;
		Predicate<Integer> isLessThanTwelve = number -> number < 12;
		Predicate<Integer> isGreaterThanFifty = number -> number > 50;

		// using method reference and different stream methods to print
		System.out.println("Integers in the list are-");
		list.stream().forEach(System.out::println);

		System.out.println("Even numbers from the list are-");
		list.stream().filter(isEven).forEach(System.out::println);

		System.out.println("Odd numbers from the list are");
		list.stream().filter(isOdd).forEach(System.out::println);

		System.out.println("Numbers divisible by 6 are-");
		list.stream().filter(isDivisibleBySix).forEach(System.out::println);

		System.out.println("Numbers less than 12 are-");
		list.stream().filter(isLessThanTwelve).forEach(System.out::println);

		System.out.println("Numbers greater than 50 are-");
		list.stream().filter(isGreaterThanFifty).forEach(System.out::println);
	}

}