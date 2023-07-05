package com.viji;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrintAllTheListElements02 {

	public static void main(String[] args) {
		List<String> values = new ArrayList<>();
		values.add("Viji");
		values.add("Selva");
		values.add("Manickam");

		String[] names = { "Product Lead", "Engineer" };
		List<String> nameList = Arrays.asList(names);
		System.out.println("Printing using normal for loop");
		for (int i = 0; i < values.size(); i++) {
			if (values.get(i).length() > 4) {
				System.out.println(values.get(i));
			}

		}
//		for (String i : values) {
//			if (i.length() > 4) {
//				System.out.println(i);
//			}
//
//		}
//		Print the names which has letters more than 4
		values.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));

//		Print only the first result
		values.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));

//		Print names which have filter letter starts with a , sort it , convert to uppercase
		values.stream().filter(s -> s.startsWith("V")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

//		Merge Two Array List
		Stream<String> concatenatedStream = Stream.concat(values.stream(), nameList.stream());
		concatenatedStream.sorted().forEach(s -> System.out.println(s));

//		Check if a certain string is present in the list or not
		boolean anyMatch = nameList.stream().anyMatch(s -> s.equalsIgnoreCase("Viji"));
		Assert.assertTrue(anyMatch);

	}

}
