package com.abucarub.miguel.datastructure.arrayscontains;

import java.util.Arrays;

public class CheckArrayContains {

	public static void main(String[] args) {

		String[] values = { "AB", "BC", "CD", "AE" };
		String testValue = "AB";
		boolean contains = isArrayContains(values, testValue);
		System.out.println("Does Array  contains value " + testValue + " is " + contains);
	}
	
	public static <T> boolean isArrayContains(T[] array, T value) {
		return Arrays.stream(array).anyMatch(value::equals);
	}

}
