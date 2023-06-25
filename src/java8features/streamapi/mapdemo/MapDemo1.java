package java8features.streamapi.mapdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapDemo1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(21);
		list.add(21);
		list.add(23);
		list.add(24);
		list.add(25);

		// Write a Function FI to update value by 10
		Function<Integer, Integer> func = (num) -> (num + 10);

		Stream<Integer> stream = list.stream();

		List<Integer> updatedList = stream.map(func).collect(Collectors.toList());

		System.out.println("Updated List " + updatedList);
		
		
		//Concise code
		List<Integer> collect = list.stream().map(num->num+10).collect(Collectors.toList());
		System.out.println(collect);
		
		//==============================================================================
		
		
		List<String> fruits = Arrays.asList("mango","apple","orange","guava");
		
		Function<String,String> fn = (str1)->(str1.toUpperCase());
		Stream<String> stream2 = fruits.stream();
		List<String> collect2 = stream2.map(fn).collect(Collectors.toList());
		System.out.println(collect2);
		
		
		//1. What is Stream API, Features / Advantages / Benefits of Stream API
		//2. I'll provide the notes
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
