package interviews.test;

public class ZeroesOne {

	public static void main(String[] args) {

		String str = "ababbbaaab";
		
		//Output s1 = "aaaaa" s2 = "bbbbb"
		
		String r1=""; //aa
		String r2=""; //bb
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if(ch=='a')
			{
				r1 = r1+ch;
			}
			else
			{
				r2 = r2+ch;
			}
		}
		
		System.out.println("String of A's : "+r1);
		System.out.println("String of B's : "+r2);
		
		
	}

}
