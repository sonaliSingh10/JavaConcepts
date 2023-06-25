package interviews.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setAge(0);
		s1.setCity("Patna");
		s1.setName("Bachha");
		s1.setStandard(2);

		Student s2 = new Student();
		s2.setAge(1);
		s2.setCity("Gaya");
		s2.setName("Balak");
		s2.setStandard(2);

		Student s3 = new Student();
		s3.setAge(10);
		s3.setCity("patna");
		s3.setName("Butru");
		s3.setStandard(5);

		Student s4 = new Student();
		s4.setAge(10);
		s4.setCity("patna");
		s4.setName("Butru");
		s4.setStandard(5);

		List<Student> li = new ArrayList<>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);

		// Print students living in patna city

		Predicate<Student> p = (student) -> student.getCity().equalsIgnoreCase("Patna");

		Stream<Student> stream = li.stream();
		List<Student> collect = stream.filter(p).collect(Collectors.toList());
		System.out.println(collect);

		stream.close();

		// 2. Count the number of students having age greater 5
		Predicate<Student> p1 = (student) -> student.getAge() > 5 && student.getCity().equalsIgnoreCase("Patna");
		Stream<Student> stream2 = li.stream();
		long count = stream2.filter(p1).count();
		System.out.println("No of records extracted for the given condition:" + count);

	}

}
