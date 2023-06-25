package java8features.functionalinterfaces.predicatedemo;

import java.util.function.Predicate;

public class QuestionOnPredicate {

	public static void main(String[] args) {
		
		//List of String 
		
		String[] names = {"apple","oranges","avocado","banana","aam"};
		
		//Print the names having length GT 5
		
		Predicate<String> p=(s)->(s.length()>5);
		
		for(String s:names) {
			System.out.println(s);
			boolean test = p.test(s);
			System.out.println(test);
		}
		
		
		int arr[]= {1,2,3,4,5,6};
		Predicate<Integer> p1=(a)->(a%2==0);
		for(Integer n:arr) {
			boolean test = p1.test(n);
			if(test==true) {
				System.out.println(n);
			}
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
