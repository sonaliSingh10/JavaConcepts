package interviews;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RegexTest {

	public static void main(String[] args) {

		String text = "The fox, $on the log%";

		String str2 = text.replaceAll("[^a-zA-Z0-9]", " ").replaceAll("\\s+", " ");
		
		System.out.println(str2);
		
		String[] arr = str2.split(" ");
		
		
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String s : arr)
		{
			s = s.toLowerCase();
			if(map.containsKey(s))
			{
				map.put(s,map.get(s)+1);
			}
			else
			{
				map.put(s,1);
			}
		}
		
		System.out.println(map);
		String response = "";
		
		for (Map.Entry<String,Integer> entry : map.entrySet())
		{
			String k = entry.getKey();
			Integer v = entry.getValue();
			response = response+k+","+v;
			response = response+"\n";
			
          System.out.println(response);
		
		}
		
		System.out.println(response);
		

	}

}
