package codings;

import java.util.Scanner;

public class PrimeCheck {
	
	static boolean isPrime(int num)
	{
		// 7 => 2, 3, 4, 5, 6 => not divisible by anyone of them => Prime
		// 6 => 2, => not prime
		// 15 => 2, 3 => not prime
		// 21 => 2, 3,.......20 => 
		
		int i=2; // 3  4 5 6 7
		int p=0; // 1
		//num = 6
		while(i<num)
		{
			if(num % i == 0)
			{
				p++; 
				break;
			}
			i++;
		}
				
		if(p==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=== Program to Check whether a number is Prime or not ===");
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		boolean result = isPrime(n);
		if(result==true)
		{
			System.out.println("The given number "+n+" is prime");
		}
		else
		{
			System.out.println("The given number "+n+" is not prime");
		}
		

	}

}
