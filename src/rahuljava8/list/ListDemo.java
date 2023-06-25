package rahuljava8.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		
		//1. Ordered collection of items => insertion order is preserved
		//2. Contains duplicates
		//3. Can contain null values as well
		//4. Implementation classes  => ArrayList, LinkedList and Vector
		
		//=== Creating a List  ====
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(13);
		numbers.add(15);
		numbers.add(7);
		numbers.add(-13);
		numbers.add(20);
		
		
		List<Integer> numbers2 = Arrays.asList(111,345,8753,-876,345);
		
	//==== Iterating over a list ==> Displaying list items
		
		for(Integer num:numbers2) {
			System.out.println("List values:"+num);
		}
		
		
		//Lambda Java 8
		numbers.forEach(eachNum -> System.out.println(eachNum));	
		
		
	//Accessing a particular ==> indexing
		Integer integer = numbers.get(0);
		System.out.println(integer);
		
	//Adding an element at specific index
		numbers.add(0,1000);
		numbers.forEach(eachNum -> System.out.println(eachNum));
		
		
		
		
		//Sorting of a list
		
		Collections.sort(numbers);
		System.out.println("Sorted List ==> "+numbers);  //ascending order ==> natural sorting
		
		
		List<String> frns = Arrays.asList("Rima","Seema","Sunita","Punam","Chandralata");
		
		Collections.sort(frns);
		System.out.println("Sorted frns name ==> "+frns); // alphabetical order
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
