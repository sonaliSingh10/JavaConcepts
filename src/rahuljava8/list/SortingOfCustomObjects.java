package rahuljava8.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student student) {  //positive negative and zero
		// Our own logic to sort the custom objects
		//return this.getName().compareTo(student.getName());
		
		return this.getAge()-student.getAge();
	}

}

public class SortingOfCustomObjects {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 122, 7, 9, 34);
		Collections.sort(list);
		System.out.println("Sorted List ==> " + list);

		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "Krishna", 1000));
		students.add(new Student(12, "Krissh", 2004));
		students.add(new Student(10, "Hanuman", 1500));

		Collections.sort(students);
		System.out.println("Sorted Gods as per name ==>"+students);

	}

}
