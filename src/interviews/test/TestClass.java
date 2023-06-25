package interviews.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setDepartment("HR");
		employee.setGender("Female");
		employee.setName("Sonali");
		
		Employee employee2 = new Employee();
		employee2.setDepartment("HR");
		employee2.setGender("Male");
		employee2.setName("Singh");
		
		Employee employee3 = new Employee();
		employee3.setDepartment("Testing");
		employee3.setGender("Male");
		employee3.setName("Saubhik");
		
		Employee employee4 = new Employee();
		employee4.setDepartment("UIUX");
		employee4.setGender("Male");
		employee4.setName("Dasgupta");
		
		List<Employee> list = new ArrayList<>();
		list.add(employee);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		
		System.out.println(list);
		
		
		//1. Filter out all the Male Employees
		
		//Stream<Employee> stream = list.stream();
		
		//Predicate<String> p1 = (str) -> str.equals("Male");
		//Predicate<Employee> p = (emp) -> emp.getGender().equals("Male");
		
		//List<Employee> maleEmployeesList = stream.filter(p).collect(Collectors.toList());
		
		//System.out.println(maleEmployeesList);
		
		//2. Filter out the HR employees only
		Stream<Employee> stream = list.stream();
		Predicate<Employee> p1= (em) -> em.getDepartment().equals("HR");
		List<Employee> collect = stream.filter(p1).collect(Collectors.toList());
		System.out.println(collect);
		
		
		
		
		
		
		
		
		
	}

}
