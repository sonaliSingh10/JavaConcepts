package interviews;

public class StringWithoutSpaces {

	public static void main(String[] args) {
		
		String str = "abc x yz1 90";

		
		String res = "";  //abcxyz190
		for(int i=0; i<str.length(); i++)
		{
			//System.out.println(str.charAt(i));
			if(str.charAt(i)==' ') {
				
			}
			else
			{
				//System.out.println(str.charAt(i));
				res = res + str.charAt(i);
			}
		}
		
		System.out.println("Without Spaces : "+res);
		
		

	}

}
