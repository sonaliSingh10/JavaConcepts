package sunday;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Coding1 {

	public static void main(String[] args) {
		
		isRepeatingChar("abcc");
		boolean isRepeating = isNoRepeatingCharacters("abcc");
		if (isRepeating) {
			System.out.println("repeating");
		} else {
			System.out.println("not repeating");
		}
		printName("Sonali Kumari Singh");
		countEachCharacter("abbbbcdd");
		
	}
	
	//Input will be of three words separated by single space
		public static void printName(String fullname) {
			//fullname = "Sonali Kumari Singh";
			String[] split = fullname.split(" ");   // ["Sonali","Kumari","Singh"]
			for(int i=0;i<split.length;i++) {		
				String name = split[i];
				
				if(i==(split.length-1)) {
					System.out.print(name);
				}
				else {
				System.out.print(name.charAt(0)+".");
				}

			}
			//output ==> S.K.Singh
		}
		
		public static void countEachCharacter(String str) {
			//str = "abbbbcdd";
			Map<Character,Integer> map = new HashMap<>();
			for(int i=0;i<str.length();i++) {
				char charAt = str.charAt(i);//a,b,b,...
				System.out.println("characters:"+charAt);
			
			
			if(!map.containsKey(charAt)) {
				map.put(charAt, 1);}
			else {
				Integer count = map.get(charAt);
				map.put(charAt, ++count);
			}
			
			}
			System.out.println(map);
			String result="";
			for(Map.Entry<Character, Integer> entry : map.entrySet()) {
				Character character = entry.getKey();
				Integer count = entry.getValue();
				result = result + (String.valueOf(character)  + count);
			}
			// output => a1b4c1d2 ==> ab4cd2
			
			System.out.println("String with count of its character ==>"+result);
		}

	public static boolean isNoRepeatingCharacters(String name) {

		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < name.length(); i++) {
			Character ch = name.charAt(i);
			System.out.println("Current Character ==> " + ch);

			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				System.out.println("Character " + ch + " already exists,hence increasing its count");
				Integer count = map.get(ch);
				map.put(ch, ++count);
			}

		}
		System.out.println(map);

		// also need to check the count for every character from the map
		
		boolean isRepeating = false;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			// System.out.println("Key = " + entry.getKey() + ", Value = " +
			// entry.getValue());
			Integer value = entry.getValue();
			if (value > 1) {
				isRepeating = true;
				break;
			}
		}

		return isRepeating;
	}

	public static void isRepeatingChar(String s) {

		Set<Character> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		// set {a,b,c} => size = 3
		System.out.println("value received in set:" + set);

		if (s.length() == set.size()) {
			System.out.println("no repeating characters present");
		} else {
			System.out.println("contains repeating characters");
		}

	}

	//homework
	

}
