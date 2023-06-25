package java8features.functionalinterfaces.functiondemo;

import java.util.function.Function;

public class FunctionFIDemo2 {

	public static void main(String[] args) {
		Function<String,String> fn=(str)->(str.toUpperCase());
		
		String s=fn.apply("sonali");
		System.out.println(s);
		
		//sonali singh
		Function<String,String> f1=(str)->{
			int index=-1;
			for(int i=0;i<str.length();i++) {
				char charAt = str.charAt(i);
				System.out.println(charAt);
				
				
				if(charAt==' ') {
					index = i;
				}
			}
			
			String substring = str.substring(index+1, str.length());
			
			
			return substring;
		};
		String apply = f1.apply("Sonali Singh");
		System.out.println(apply);
		
		
		
		Function<String,String> f3 = str->{
			String arr[] = str.split(" ");    //["sonali","Kumari",singh"]; length = 3 (0,1,2)
			String lname = arr[arr.length-1];
			return lname;
		};
		String lastName = f3.apply("Sonali Singh");
		System.out.println("LNAME : "+lastName);
		
		String lastName2 = f3.apply("Sonali Kumari Singh");
		System.out.println("LNAME : "+lastName2);
		
		
		String lastName3 = f3.apply("Sonali Kumari Singh Sumari");
		System.out.println("LNAME : "+lastName3);
		
		String lastName4 = f3.apply("Sonalee");
		System.out.println("LNAME : "+lastName4);
		
	}
	
	
	

}
