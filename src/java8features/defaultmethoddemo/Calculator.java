package java8features.defaultmethoddemo;

public interface Calculator {

	int add(int x, int y);
	int sub(int x,int y);
	default int multiply(int x, int y) {
		return x*y;
	}
}
