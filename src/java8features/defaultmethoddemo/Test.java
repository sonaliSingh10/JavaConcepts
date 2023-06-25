package java8features.defaultmethoddemo;

public class Test {

	public static void main(String[] args) {
		
		Calculator c = new CalculatorImpl();
		
		System.out.println("Add :"+c.add(6, 8));
		System.out.println("Sub :"+c.sub(6, 8));
		System.out.println("Multiply :"+c.multiply(6, 2));

	}

}
