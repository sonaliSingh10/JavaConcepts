package interviews;

public class StringTest {

	public static void main(String[] args) {
		String s1 = "Hello";
		System.out.println(s1.hashCode());
		
		s1 = "Hell";
		System.out.println(s1.hashCode());
		
		
		
		String str1 = "abc";
		String str2 = "ABC";
		
		System.out.println(str1.equals(str2)); //false
		
		System.out.println(str1.equalsIgnoreCase(str2)); //true
		
		
		
		String name="Google";
		
		//Print the last character of this string
		
		int n = name.length();
		System.out.println(name.charAt(n-1));
		
		
		
		
		String myFullName = "Rahul#Kumar#Horro"; // 3 strings
		
		//Print R K H
		
		String[] split = myFullName.split(" "); //any character
		
		//for each loop
		for(String str : split)
		{
			System.out.println(str.charAt(0));
		}
		
		//How do we achieve abstraction
	    /*1. Interface (100%)  => Vehicle => how many wheels ? not possible, 
	     *2. Abstract class(0-100%) => Human => how many hands ? 2 hands, 
	     *3. Class(0%)
	     */
		//Its one of the OOPs concept
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
