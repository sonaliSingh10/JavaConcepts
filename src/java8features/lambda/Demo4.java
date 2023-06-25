package java8features.lambda;

//Modern way

@FunctionalInterface
interface Calculatar {
	int m1(int a, int b);   //SAM
}

public class Demo4 {

	public static void main(String[] args) {

		//We are going to provide implementation of the method m1 using lambda
		
		Calculatar cal=(a,b)->(a+b);
		int c= cal.m1(2,3);
		System.out.println("SUM :"+c);
		
		
		//We are going to the provide another implementation 
		
		Calculatar c2 = (a,b)-> (a-b);
		int d = c2.m1(5, 9);
		System.out.println("SUB : "+d);
		
		
		//We are going to provide the 3rd implementation
		
		Calculatar c3= (a,b)-> (a*b);
		int e= c3.m1(3,3);
		System.out.println("Mult:"+e);
		
		//4th implementation
		Calculatar c4=(x,y)->(x/y);
		float f = c4.m1(3, 2);
		System.out.println("Division:"+f);
		
		
		
		
		
		
	}

}
