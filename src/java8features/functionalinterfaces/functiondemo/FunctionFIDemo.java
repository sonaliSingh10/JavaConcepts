package java8features.functionalinterfaces.functiondemo;

import java.util.function.Function;

public class FunctionFIDemo {

	public static void main(String[] args) {

		// Limitation of Predicate : Predicate was returning only boolean value, but
		// what if we want to return any type of values
		// Then we should go for another FI ie Function FI.

		Function<Integer, Integer> f = (number) -> (2 * number);
		Integer result = f.apply(5);
		System.out.println("After applying an operation ie doubling : " + result);

		Integer result2 = f.apply(35);
		System.out.println("After applying an operation ie doubling : " + result2);

		// Another implementation
		Function<Integer, Integer> i1 = (number) -> (number * number);
		Integer apply = i1.apply(3);
		System.out.println("Square of given number is:" + apply);

		
		//Another implementation
		Function<Integer, Integer> f1 = (number) -> {
			int fact = 1;
			for (int i = 1; i <= number; i++) {
				System.out.println(fact);
				fact = fact * i;
			}
			return fact;
		};
		
		Integer factorial=f1.apply(6);
		System.out.println("Factorial of given number is:"+factorial);

		
		
		//Accept a string and return is length
		Function<String,Integer> f2=(str)->(str.length());
		
		Integer len=f2.apply("Sonali");
		System.out.println("Length of given String:"+len);
		
		
		
		
	}

}
