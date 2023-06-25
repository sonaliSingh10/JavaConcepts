package java8features.functionalinterfaces.consumerdemo;

import java.util.function.Consumer;

public class ConsumerFIDemo {

	public static void main(String[] args) {

		Consumer<String> c1 = (str) -> System.out.println(str.length());
		c1.accept("My Dummy String");

		Consumer<String> c2 = (str1) -> System.out.println(str1.toUpperCase());
		c2.accept("Hi");

		Consumer<Integer> c3 = (integer) -> System.out.println(integer * integer);
		c3.accept(5);

		Consumer<Double> c4 = (i) -> System.out.println(Math.sqrt(i));
		c4.accept(16d);

	}

}
