package java8features.functionalinterfaces.functiondemo;

import java.util.function.Function;

public class FunctionChainingDemo {

	public static void main(String[] args) {

		Function<Integer, Integer> f1 = (n) -> n*2;
		Integer r1 = f1.apply(5);
		System.out.println("Making double : "+r1); // EO : 10
		
		Function<Integer, Integer> f2 = (n) -> n + 10;
		Integer r2 = f2.apply(8);
		System.out.println("Incrementing by 10 : "+r2);  //EO : 18
		
		//Chaining
		//andThen()
		
		Integer r3 = f1.andThen(f2).apply(20);
		System.out.println("After applying f1 on 20 andThen f2 : "+r3);
		
		Integer r4 = f2.andThen(f1).apply(20);
		System.out.println("After applying f2 on 20 andThen f"+r4);   //20*2=40+10=50
		
		
		//compose()
		
		Integer r5 = f1.compose(f2).apply(20);
		System.out.println("First f2 will be applied and then f1 :  "+r5);
		
		
		
		
		
		
		
		

	}

}
