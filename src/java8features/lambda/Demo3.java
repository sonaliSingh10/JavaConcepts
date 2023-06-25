package java8features.lambda;

interface Welcome
{
	String greet(String name);
}

public class Demo3 {

	public static void main(String[] args) {
		
		//Give body to the greet function as you require
		
		Welcome w=(String name) -> "Welcome"+name;
		String s=w.greet("naam mein kya rakha hai");
		System.out.println(s);

	}

}
