package interviews.collections.listdemo;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		
		Vector<String> v = new Vector<String>();
		
		v.add("babu");
		v.add("shona");
		v.add("heera");
		v.add("motilal");
		v.add("moti");
		v.add("baburao");
		v.add("shona");
		

		System.out.println(v);
		System.out.println(v.capacity());
		
		for(int i=0;i<v.size();i++) {
			
			String string = v.get(i);
			if(string.startsWith("s")) {
			System.out.println(string);
			}
		}
		
		//Print items whose length is > 5
		System.out.println("names with length greater than 5");
		for(int i=0;i<v.size();i++) {
			String s = v.get(i);
			if(s.length()>5) {
				System.out.println(s);
			}
			
			
		}
		//item ends with vowels
		System.out.println("==== Names that ends with vowels====");
		for(int i=0;i<v.size();i++) {
			String str= v.get(i);
			if(str.endsWith("a")||str.endsWith("e")||str.endsWith("i")||str.endsWith("o")
||str.endsWith("u")) {
				System.out.println(str);
			}
		}
		
		
		
		
		
	}

}
