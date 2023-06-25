package java8features.streamapi.filterdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(21);
		list.add(13);
		list.add(40);
		list.add(15);
		list.add(12);
		
		System.out.println("List without filter : "+list);
		
		//Step 1 : First convert it into Stream
		Stream<Integer> stream = list.stream();
		
		//Step 2 :  We'll define a Predicate, because filter needs a Predicate
		Predicate<Integer> p= (n)->(n%2==0);

		List<Integer> result = stream.filter(p).collect(Collectors.toList());
		
		System.out.println("Filtered List of Even : "+result);
		
		
		
		//========================================================================
		
		List<String> l= new ArrayList<>();
		l.add("hi");
		l.add("hello");
		l.add("hola");
		l.add("namastey");
		l.add("welcome");
		Predicate<String> p1=(str)->(str.length()>5);
		Stream<String> stream2 = l.stream();
		List<String> collect = stream2.filter(p1).collect(Collectors.toList());
		System.out.println("List of String having length greater than 5:"+collect);
		
		
		//=========================================================================
		
		List<Integer> lst = new ArrayList<>();
		lst.add(-2);
		lst.add(12);
		lst.add(-7);
		lst.add(23);
		lst.add(4);
		
		Predicate<Integer> p2=(num)->(num<0);
		Stream<Integer> stream3 = lst.stream();
		List<Integer> collect2 = stream3.filter(p2).collect(Collectors.toList());
		System.out.println("List of all negative integers:"+collect2);
		
		List<String> list1= new ArrayList<>();
		list1.add("sonali");
		list1.add("Singh");
		list1.add("Bina S ka");
		list1.add("includes s");
		
		Predicate<String> p3=(string)->(string.startsWith("s")||string.startsWith("S"));
		Stream<String> stream4=list1.stream();
		List<String> collect3 = stream4.filter(p3).collect(Collectors.toList());
		System.out.println("List of names starting with s:"+collect3);
		
		
		System.out.println("==================================================================");
		List<String> l1=new ArrayList<>();
		l1.add("Naam");
		l1.add("Kaam");
		l1.add("Daam");
		l1.add("jaam");
		l1.add("Saam");
		l1.add("sky");
		l1.add("fly");
		l1.add("try");
		
		Predicate<String> p4=(str2)->(!str2.contains("a")&& !str2.contains("e")&& !str2.contains("i")&& !str2.contains("o")&& !str2.contains("u"));
		Stream<String> stream5 = l1.stream();
		List<String> collect4 = stream5.filter(p4).collect(Collectors.toList());
		System.out.println("List of names containing vowels:"+collect4);
		
		System.out.println("=================================================================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
