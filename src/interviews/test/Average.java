package interviews.test;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total numbers to be averaged:");
		int n = sc.nextInt();
		System.out.println("Enter "+n+" numbers one by one");
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			sum = sum + a[i];

		}
		System.out.println("average:" + (float)sum / n);
	}

}
