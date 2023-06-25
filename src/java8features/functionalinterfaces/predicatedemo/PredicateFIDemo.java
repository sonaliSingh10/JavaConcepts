package java8features.functionalinterfaces.predicatedemo;

import java.util.function.Predicate;

public class PredicateFIDemo {

	public static void main(String[] args) {

		
		Predicate<Integer> p = (n) -> (n % 2 == 0);
		boolean result = p.test(10);
		System.out.println(result);
		
		Predicate<Long> p2 = (n) -> (n % 2 == 0);
		boolean result2 = p2.test(1123L);
		System.out.println(result2);
		
		Predicate<String> p3=(str)->(str.length()>5);
		boolean test = p3.test("Sonali");
		System.out.println(test);
		
		Predicate<String> p4=(str)->(str.startsWith("S"));
		boolean result4 = p4.test("Sonali");
		System.out.println(result4);
		
		
		
		

	}

}
