package java8features.functionalinterfaces.supplierdemo;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierFIDemo {

	public static void main(String[] args) {
		
		//Supplier FI : Sometimes, we don't any provide any input, but we need something
		//from the method in return.
		
		Supplier<Date> supplier = () -> new Date();
		Date date = supplier.get();
		System.out.println("Date : "+date);	
		
		
		//Random Name generator
		Supplier<String> sup = () -> {
				String names[] = {"Ravi","Kabi","Sabi","Habi","Akshay"};
				int x = (int) (Math.random()*4);
				return names[x];
		};
		String string = sup.get();
		System.out.println(string);
				
		//OTP generator
		
		
	}

}
