package interviews.collections.listdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameInArraylist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> names = new ArrayList<String>();

		System.out.println("Enter any 5 names : ");

		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter a name : ");
			String s = sc.next();
			names.add(s);
		}
		
		// [Abc, Xyz,qwerty, asbhff]
		
		for(int i=0; i<names.size(); i++)
		{
			String name = names.get(i);
			if(name.length()>5)
			{
				System.out.println(name);
			}
		}
		
		
		
	}

}
