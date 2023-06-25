package interviews.collections.setdemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		/* Underlying ds is HashTable   // What is a HashTable ?
		 * Duplicates are not allowed
		 * Insertion order is not preserved
		 * null insertion is possible
		 * 
		 */
		
		set.add("Sonali");
		set.add("Monali");
		set.add("Sonali");
		set.add("sonali");
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		
		//Iterating over Set items
		
		for(String s : set)
		{
			System.out.println(s);
		}
		
		
		
		
		
	}

}
