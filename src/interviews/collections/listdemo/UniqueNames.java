package interviews.collections.listdemo;

import java.util.ArrayList;
import java.util.List;

public class UniqueNames {

	public static void main(String[] args) {
		
		List<String> list= new ArrayList<>();
		list.add("Kolkata");
		list.add("Patna");
		list.add("Ranchi");
		list.add("Kolkata");
		list.add("Durgapur");
		list.add("Patna");
		System.out.println("Record with duplicates : "+list);
			
		List<String> newList=new ArrayList<>();
		
		for(int i=0; i<list.size(); i++)
		{
			String city = list.get(i);
			if(!newList.contains(city))
			{
				newList.add(list.get(i));
			}
		}
		
		System.out.println(newList);
			
	}

}
