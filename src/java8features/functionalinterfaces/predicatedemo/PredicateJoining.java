package java8features.functionalinterfaces.predicatedemo;

import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String[] args) {

		Predicate<Integer> p = (in) -> (in % 2 == 0);
		boolean test = p.test(4);
		System.out.println("Even : " + test);

		Predicate<Integer> p1 = (n) -> (n > 10);
		boolean test2 = p1.test(10);
		System.out.println("GT10 : " + test2);

		// Write a predicate that will check whether a number is even as well as GT 10

		// =====Predicate Joining : OR , AND default methods ===========

		boolean result = p.and(p1).test(8);
		System.out.println("Both Even and GT10 : " + result);

		// ============ Negate ===========

		Predicate<Integer> pred = (num) -> (num % 2 == 0);
		boolean res = p.negate().test(4);
		System.out.println("Even : " + res);



	}

}
