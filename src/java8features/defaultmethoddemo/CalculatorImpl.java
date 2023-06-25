package java8features.defaultmethoddemo;

public class CalculatorImpl implements Calculator {

	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		return x-y;
	}
	
}
