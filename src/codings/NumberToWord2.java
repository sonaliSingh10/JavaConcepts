package codings;

import java.util.Scanner;

public class NumberToWord2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// 3467 => 7643 => Three Six Four Three

		// Three Four Six Seven

		// get a digit one by one
		
		//Reverse the number
		
		
		int temp = n; //145
		String num="";
		while(temp>0)
		{
			int r = temp%10;
			num = num + r;
			temp = temp/10;
			
		}
		
		System.out.println("Reversed : "+num);
		
		int newNum = Integer.parseInt(num);
		
		
		
		
		

		while (newNum > 0) {
			int r = newNum % 10;

			switch (r) {
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
				break;
			case 5:
				System.out.println("five");
				break;
			case 6:
				System.out.println("six");
				break;
			case 7:
				System.out.println("seven");
				break;
			case 8:
				System.out.println("eight");
				break;
			case 9:
				System.out.println("nine");
				break;
			case 0:
				System.out.println("zero");
				break;
			default:
				System.out.println("incorrect value entered");
			}

			newNum = newNum / 10;

		}

	}

}
