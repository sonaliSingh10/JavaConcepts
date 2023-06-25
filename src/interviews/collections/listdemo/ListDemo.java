package interviews.collections.listdemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("Rahul");
		names.add("Ravi");
		names.add(null);
		names.add(null);
		names.add("Sonali");
		names.add("Sonali");
		
		names.add(0,"Chandranath");

		System.out.println(names);  
		
		for(int i=0; i<names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		
		//forEach loop //adv loop
		
		for(String name : names)
		{
			System.out.print(name+", ");
		}
		
		
		

	}

}
