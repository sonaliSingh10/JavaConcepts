package java8features.lambda;
@FunctionalInterface
interface Number{
	public boolean checkEven(int a);
	
}

public class Demo6 {

	public static void main(String[] args) {
		Number n=(a)->(a%2==0);
		boolean c = n.checkEven(6);
		System.out.println(c);
	}

}
