package interviews.test;

public class LeapYear {

	public static void main(String[] args) {

		/*
		 * 1. It must be divisible by 4 and it should not be divisible by 100 2.
		 */

		int year = 2012;

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("Leap year");
		} else {
			System.out.println("not a leap year");
		}

	}

}
