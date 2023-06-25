package interviews;

public class AddMultiPattern {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };

		if (arr.length == 3) {
			int a = arr[0] * arr[1];
			int b = arr[2] * 1;
			System.out.println(a - b);
		} else if (arr.length == 4) {
			int a = arr[0] * arr[1];
			int b = arr[2] * arr[3];
			System.out.println(a - b);
		}
		else
		{
			if(arr.length%2==0)
			{
				int sum=0;
				for(int i=0; i<=arr.length; i++)
				{
					int j=i;
					int a = arr[j]*arr[j+1];  // 1 *2
					int b = arr[j+2]*arr[j+3];// 3 *4
					
				}
			}
		}

	}

}
