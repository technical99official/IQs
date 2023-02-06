package com.technical99;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Demo {
	public static void main(String[] args) {
		
		// ------------ Empty Stream ----------------------
		Stream<String> stream1 = Stream.empty();
		
		// ------------ Stream using Values ----------------------
		Stream<Integer> stream2 = Stream.of(1,2,3,4,5);

		// ------------ Stream using Array ----------------------
		Integer[] i = new Integer[]{1,2,3,4,5};
		Stream<Integer> stream3 = Stream.of(i);

		// ------------ Stream using List ----------------------
		List<String> list = Arrays.asList("India", "America");;
		Stream<String> stream4 = list.stream();
		
		// ------------ Stream using Map ----------------------
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "India");
		Stream<Integer> ks = map.keySet().stream();
		Stream<String> vs = map.values().stream();
		Stream<Map.Entry<Integer, String>> stream5 = map.entrySet().stream();
	}
}
