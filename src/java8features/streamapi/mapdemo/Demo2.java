package java8features.streamapi.mapdemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(32,32,25,26,28,7,42);  //non modifiable
		
		Stream<Integer> stream = list.stream();
		
		
		//1. filter(Predicate p)
		//Predicate<Integer> p=(n)->(n%2==0);
		//stream.filter((n)->(n%2==0));
		
		
		//2. map(Function fn)
		//Function<Integer,Integer> fn = (n)->(n+10);
		//stream.map((n)->(n+10));
		
		
		
		//3. sorted()
		//List<Integer> sortedList = stream.sorted().collect(Collectors.toList());
		//System.out.println(sortedList);
	
		
		//stream.sorted()
		
		
		
		//4. count()
		
		//long count = stream.filter(n->n%2==0).count();
		//System.out.println("Count of even numbers : "+count);
		
		//5. min
		
		Optional<Integer> optional = stream.min((a,b)->a.compareTo(b));
		System.out.println("Minimum value : "+optional.get());
		
		//6. 
		
		
		
		
		
		//VVI :  Optional in Java8
		
		
		
		
		
		

	}

}
