package interview;

import java.util.HashSet;
import java.util.Set;

public class SetQues {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		int a = 1;
		Integer b = new Integer(1);
		Integer c = new Integer(1);
		
		set.add(a);
		set.add(b);
		set.add(c);
		set.add(1);
		
		System.out.println(set);
	}

}
