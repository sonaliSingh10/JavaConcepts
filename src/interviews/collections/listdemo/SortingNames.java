package interviews.collections.listdemo;

import java.util.ArrayList;
import java.util.List;

public class SortingNames {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("Sonali");
		names.add("monali");
		names.add("sanjay");
		names.add("manjay");
		names.add("shraddha");
		System.out.println(names);

		// Print names that have s or S as firs character

		for (int i = 0; i < names.size(); i++) {
			String s = names.get(i);
			if (s.charAt(0) == 'S' || s.charAt(0) == 's') {
				System.out.println(names.get(i));
			}
			//ArrayList is one of the implementations of List Interface.
			//ArrayList Allows Duplicate & Null Values
			//Growable in nature
			//dynamic Array
			//insertion order ois preserved
			//present in java.util package
			//not synchronized hence not thread safe
			//uses iterator or list iterator for traversal
			//searching & sorting
		}

	}

}
