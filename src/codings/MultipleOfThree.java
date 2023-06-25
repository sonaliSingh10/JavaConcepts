package codings;

import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("=== Going to print multiple of three within the range ===");

		System.out.println("Enter lower range value : ");
		int a = sc.nextInt();
		
		System.out.println("Enter upper range value : ");
		int b = sc.nextInt();
		
		System.out.println("==== Find all the numbers from "+a+" to "+b+" that are divisible by 3 ===");
		for(int num = a; num<=b; num++)
		{
			//System.out.println("num : "+num);
			boolean result = isMultipleOfThree(num);
			if(result==true)
			{
				System.out.println(num);
			}
		}
		for(int num1=a;num1<=b;num1++) {
			boolean result = isEven(num1);
			if(result==true) {
				System.out.println("Even number:"+num1);
			}
		}

	}

	// Separate method for checking if the number is multiple of 3 or not
	static boolean isMultipleOfThree(int num) {
		if (num % 3 == 0)
			return true;
		else
			return false;
	}
	
	// To check whether a number is Even
	static boolean isEven(int num1) {
		if(num1%2==0)
			return true;
		else
			return false;
	}
}
