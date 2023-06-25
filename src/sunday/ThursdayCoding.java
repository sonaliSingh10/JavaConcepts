package sunday;

import java.util.Arrays;

public class ThursdayCoding {

	public static void main(String[] args) {
		
		
		String s = "my#name#is#khan";
		
		String[] nameArr = s.split("#");
		System.out.println(Arrays.toString(nameArr)); // 
		
		
		String str = "abc$xyz$pqr_PQR";
		
		String[] splitted = str.split("$");
		
		System.out.println(Arrays.toString(splitted)); // ["abc", "xyz", "pqr_PQR"]
		
		
		
		String strr = "Kolkata";
		String[] sp = strr.split("");
		System.out.println(Arrays.toString(sp)); // ["k","o","l","k","a","t","a"];
		
		
		
		String ss = "I$am@a*good$boy";
		
		String[] myName = ss.split("[$@*]");
		System.out.println(Arrays.toString(myName));
		
		
		
		
		
		
		
		
		String ques = "rose=color:red,lotus=color:white,sunflower=color:yellow,tulip=color:red,jasmine=color:white";
		
		
		//Q1. Print it as follow
		/* rose : red
		 * lotus : white
		 * sunflower : yellow
		 * tulip : red
		 * jasmine : white
		 */
		
		//Q2. Print the flower(s) having color white
		// Output ==> lotus jasmine
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		/*
		 * String str = "apple_5,orange_6,banana_3,guava_7"; String[] split =
		 * str.split(",");//[apple_5, orange_6, banana_3, guava_7] for(int
		 * i=0;i<split.length;i++) { String index = split[i];//apple_5
		 * //System.out.println(index); String[] index_split = index.split("_");
		 * //System.out.println(Arrays.toString(index_split));//[apple, 5] String
		 * fruitName = index_split[0]; String count= index_split[1];
		 * System.out.println(fruitName+"="+count);//apple=5
		 * 
		 * }
		 */
		//System.out.println(Arrays.toString(split));
		//Output ==> 
		/*apple = 5
		 *orange = 6
		 *banana = 3
		 *guava = 7
		 */
		
		
		

	}

}
