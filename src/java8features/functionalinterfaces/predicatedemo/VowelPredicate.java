package java8features.functionalinterfaces.predicatedemo;

import java.util.function.Predicate;

public class VowelPredicate {

	public static void main(String[] args) {
		Predicate<String> p = (s) -> {
			boolean flag = false;
			
			String str = s.toLowerCase();  ///APPLE => apple
			
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					flag = true;
					break;

				}
			}
			return flag;
		};
		
		boolean result = p.test("APPLE");
		System.out.println(result);

	}

}
