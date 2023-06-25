package codings;

import java.util.Scanner;

public class NumberToWord3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();

		int n = 12345;
		
		String arr[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		
		
		String name="Sonali";
		for(int i=name.length()-1; i>=0; i--)
		{
			System.out.println(name.charAt(i));
		}

	}

}
