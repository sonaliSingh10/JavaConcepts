package java8features.lambda;

//Functional Interface
interface Kalkulator {
	int add(int a, int b); //Single Abstract Method (SAM)
}

public class Demo2 {

	public static void main(String[] args) {
		// (add) -> {a+b};
		Kalkulator calc = (a, b) -> a + b;
		int c = calc.add(10, 11);
		System.out.println(c);

	}

}
