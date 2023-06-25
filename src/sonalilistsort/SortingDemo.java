package sonalilistsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingDemo {

	public static void main(String[] args) {
		List<Country> countries = new ArrayList<>();
		Country c1 = new Country("Bindiya", 30000000L, 15000.0);
		countries.add(c1);
		
		Country c2 = new Country("Nindiya", 30000000L, 1000.0);
		countries.add(c2);
		
		Country c3 = new Country("Jindiya", 50000000L, 1500.0);
		countries.add(c3);
		
		Country c4 = new Country("Sindiya", 10000000L, 5000.0);
		countries.add(c4);
		
		System.out.println("Countries ==> "+countries);
		
		
		//sort based on population ==> asc order
		
		Collections.sort(countries);
		System.out.println("Sorted Countries List Based on Pop ==> "+countries);
		
		
	}

}
