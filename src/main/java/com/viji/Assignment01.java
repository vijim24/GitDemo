package com.viji;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class Assignment01 {

	@Test
	public void assignment() {
//		Print unique numbers from the list from array
//		sort the array
		List<Integer> intList = Arrays.asList(3, 2, 3, 3, 2, 2, 1, 5, 6, 7);
		intList.stream().distinct().sorted().forEach(s -> System.out.println(s));
		List<Integer> collectList = intList.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(collectList.get(3));
	}

}
