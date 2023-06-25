package hashmapdemo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {

		ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
		concurrentHashMap.put("India", "New Delhi");
		concurrentHashMap.put("China","Beijing");
		concurrentHashMap.put("USA","Washington DC");
		concurrentHashMap.put("Japan","Tokyo");
		
		System.out.println(concurrentHashMap);
		
		for(Map.Entry<String,String> mp : concurrentHashMap.entrySet())
		{
			System.out.println(mp.getKey()+" "+mp.getValue());
		}
		
		
		
		
		
	}

}
