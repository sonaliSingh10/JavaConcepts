package hashmapdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// Roll,Name
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(4, "Ram Kumar");
		map.put(2, "Shyam Kumar"); // insert (first time)
		map.put(3, "Radha Kumari");
		map.put(7, "Geeta Kumari");
		System.out.println(map);

		map.put(2, "Shyam Mohan"); // update the value
		System.out.println(map);

		map.put(8, "Ram Kumar");
		System.out.println(map);

		// check key is present in the map or not
		if (map.containsKey(12)) {
			System.out.println("Key is present in the map");
		} else {
			System.out.println("Key is not present in the map");
		}

		// Accessing a value using a key

		String studentNameWithRoll4 = map.get(4);
		System.out.println(studentNameWithRoll4);

		String studentNameWithRoll12 = map.get(12);
		System.out.println(studentNameWithRoll12);

		// ===================== Iterating over a map ======

		/*
		 * List<String> list = new ArrayList<>(); list.add("Abc"); list.add("Pqr");
		 * list.add("Xyz");
		 * 
		 * for (int i = 0; i < list.size(); i++) { System.out.println(list.get(i)); }
		 * 
		 * for (String s : list) { System.out.println(s); }
		 */
		
		
		
		/*
		 * for(Map.Entry<Integer, String> e : map.entrySet()) {
		 * System.out.println(e.getKey() + " : "+e.getValue()); }
		 */
		
		
		
		//Remove data
		map.remove(3);
		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
		

	}

}
