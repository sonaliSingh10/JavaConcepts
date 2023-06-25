package java8features.lambda;

interface Helper {
	Boolean test(Integer i);
}

public class Demo7 {

	public static void main(String[] args) {
		Helper greaterThan10 = (i) -> (i > 10);
		boolean test = greaterThan10.test(12);
		System.out.println("Number is greater than 10:"+test);

		Helper inBetween = (i) -> (i > 10 && i < 20);
		boolean test2 = inBetween.test(22);
		System.out.println("Number lies between 10 and 20:"+test2);

		Helper oddCheck = (i) -> (i % 2 != 0);
		boolean test3 = oddCheck.test(4);
		System.out.println("Number entered is odd:"+test3);
	}

}
