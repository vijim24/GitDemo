package com.viji;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class MapFilter03 {
	@Test
	public void StreamMap() {
//		Print the names which has last letter a
		Stream.of("viji", "selva").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
	}

	@Test
	public void streamCollect() {
		System.out.println("Working with collector");
		List<String> collectList = Stream.of("vicky", "muruga", "Rama", "Ganesha").sorted().filter(s -> s.endsWith("a"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(collectList.get(0));
	}

}
