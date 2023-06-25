package hashmapdemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(21, "kuchh bhi");
		map.put(23, "Arey");
		map.put(45, "bhai sahab");
		map.put(1, "khud confuse ho jaiyega");
		System.out.println(map);
		for(Map.Entry<Integer,String> m : map.entrySet() ) {
			System.out.println(m.getValue());
			System.out.println(m.getKey());
		}

	}

}
