package java8features.lambda;

//This is the TRADITIONAL way of implementing an Interface

interface Calculator {
	int operation(int a, int b);
}

class CalculatorImpl implements Calculator {
	@Override
	public int operation(int a, int b) {
		return a + b;
	}

}

public class Demo1 {

	public static void main(String[] args) {
		CalculatorImpl impl= new CalculatorImpl();
		int result = impl.operation(2, 3);
		System.out.println("SUM Result = "+result);
		
	}

}
