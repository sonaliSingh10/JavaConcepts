package interviews;

public class FindCount {

	public static void main(String[] args) {

		String str = "6201320703";
		// count the number of zeroes

		int arr[] = { 6, 2, 0, 1, 3, 2, 0, 7, 0, 3 };

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			}

		}
		System.out.println(count);
		// logic for counting 0 in string
		int count1 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0') {
				count1++;
			}

		}
		System.out.println(count1);
	}

}
