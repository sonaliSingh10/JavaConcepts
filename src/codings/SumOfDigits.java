package codings;

public class SumOfDigits {

	public static void main(String[] args) {
		int number = 457;
		
		//Output : 4+5+7=16
		
		int s=0;
		while(number>0)
		{
			int r = number % 10;
			System.out.println("single digit : "+r);
			s=s+r;
			
			 number = number / 10;
			//System.out.println("number : "+number);
		}
		
		System.out.println("Sum of digits "+s);
		

	}

}
