package java8features.lambda;

interface Greetings {
	public String greet(String str);
	
}

public class Demo5 {

	public static void main(String[] args) {
		Greetings g=(str)->("welcome"+str);
		String g1 = g.greet("naam");
		System.out.println(g1);
		
		String g2 = g.greet("kaam");
		System.out.println(g2);
		
		
		Greetings greetings=(str)->("good Morning"+str);
		String g4 = greetings.greet("sajjanpur");
		System.out.println(g4);
	
	
	}

}
