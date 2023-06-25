package interviews.collections.listdemo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<String> fruitlist =new LinkedList<>();
		fruitlist.add("Orange");
		fruitlist.add("Banana");
		fruitlist.add("Guava");
		fruitlist.add("Apple");
		fruitlist.add("Falana");
		fruitlist.add("Dhimkana");
		fruitlist.add("Orange");
		System.out.println(fruitlist);
		
		List<String> list1=new LinkedList<>();
		list1.add("Orange");
		list1.add("Guava");
		list1.add("Mango");

		boolean containsAll = fruitlist.containsAll(list1);
		System.out.println(containsAll);
		
		int indexOf = list1.indexOf("Mango");
		System.out.println("Mango is present at index : "+indexOf);
		
		boolean removed = list1.remove("Mango");
		System.out.println("List after removing Mango item :"+list1);
		
		
		//Sorting
		Collections.sort(fruitlist);
		System.out.println(fruitlist);
		
		//Collections.sort(fruitlist, );  Comparator
		
		List<Integer> numbers = new LinkedList<>();
		numbers.add(7);
		numbers.add(12);
		numbers.add(1);
		numbers.add(12);
		numbers.add(71);
		numbers.add(-9);
		numbers.add(12);
		
		
		//sort in asc
		
		// maximum value
		Integer min = Collections.min(numbers);
		System.out.println(min);
		
		//
		Integer max = Collections.max(numbers);
		System.out.println(max);
		
		
		//
		int frequency = Collections.frequency(numbers, 12);
		System.out.println(frequency);
		
		//sonali 
		
		//rotate by character 2
		
		//lisona
		
		System.out.println("Before rotating : "+fruitlist);
		Collections.rotate(fruitlist, 2);
		System.out.println("After rotating : "+fruitlist);
		
		//One of implementation of list interface.
		//insertion order is preserved
		//doublylinked list
		//null & duplicates
		//not synchronized
		//list iterator
		//growable in nature
		//java.util
		//insertion & deletion purpose
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
