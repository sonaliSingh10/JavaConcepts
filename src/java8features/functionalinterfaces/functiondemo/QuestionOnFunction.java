package java8features.functionalinterfaces.functiondemo;

import java.util.function.Function;
import java.util.function.Predicate;

public class QuestionOnFunction {

	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 5, 6 };
		Function<Integer, Integer> f = (n) -> (n + 10);
		for (Integer i : a) {
			Integer apply = f.apply(i);
			System.out.println(apply);
		}

		String arr[] = { "hello", "hi", "therefor" };
		Predicate<String> f1 = (s) -> (s.length() > 5);
		Function<String, String> f2 = (s1) -> (s1.toUpperCase());
		for (String str : arr) {
			Boolean b=f1.test(str);
			if(b) {
				String apply = f2.apply(str);
				System.out.println(apply);
			}
		}
	}

}
