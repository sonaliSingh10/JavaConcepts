package hashmapdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexHashMap {

	public static void main(String[] args) {

		Map<String, Student> mp = new HashMap<>();

		Student s1 = new Student();
		s1.setEmailId("abc@gmail.com");
		s1.setName("Rahul Kumar");

		Student s2 = new Student();
		s2.setEmailId("abcd@gmail.com");
		s2.setName("Mehul");

		mp.put("1683475", s1);
		mp.put("1974556", s2);

		System.out.println(mp);

		Map<Integer, List<String>> map1 = new HashMap<>();
		List<String> l1 = Arrays.asList("Hey", "Hello", "Hhaa");
		map1.put(5, l1);

		List<String> l2 = Arrays.asList("hm", "hmm", "hmmm");
		map1.put(7, l2);
		
		List<String> l3 = Arrays.asList("ok", "okay", "okhay");
		map1.put(3, l3);
		
		System.out.println(map1);

	}

}
