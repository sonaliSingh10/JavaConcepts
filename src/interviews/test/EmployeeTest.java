package interviews.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		
		Employee emp1 = new Employee("Sonali","HR","Female","Patna",1000d);
		Employee emp2 = new Employee("Singh","HR","Male","Kolkata",1200d);
		Employee emp3 = new Employee("Ram","Developer","Male","Patna",700d);
		Employee emp4 = new Employee("Shyam","HR","Male","Ranchi",2000d);
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		System.out.println(list);
		
		//Print the list of all employees having city patna or department HR.
		
		Predicate<Employee> p = (emp) -> emp.getCity().equalsIgnoreCase("Patna") || 
					                     emp.getDepartment().equalsIgnoreCase("HR");
		
		
		
		List<Employee> result = list.stream().filter(p).collect(Collectors.toList());
		System.out.println("Result "+result);
		
		//Increase the salary of each employees by 100
		
		Function<Employee,Employee> fn = (emp)-> {
			String name = emp.getName();
			String city = emp.getCity();
			String department = emp.getDepartment();
			String gender = emp.getGender();
			double salary = emp.getSalary();
			
			//updating employee with new salary
			Employee newEmployee = new Employee(name, city, department, gender, salary+100);
			
			return newEmployee;
			
		};
		
		
		
		Stream<Employee> stream = list.stream();
		
		List<Employee> updatedEmployeeList = stream.map(fn).collect(Collectors.toList());
		System.out.println("updatedEmployeeList : "+updatedEmployeeList);
		
		
		//Print the list of employees having salary greater than 800 and having name starting with S
		Predicate<Employee> p1 = (emp) -> (emp.getSalary()>800 && (emp.getName().startsWith("S")|| emp.getName().startsWith("s")));
		
		Stream<Employee> stream2 = list.stream();
		List<Employee> collect = stream2.filter(p1).collect(Collectors.toList());
		System.out.println("list of employees having salary greater than 8000 and with initias S:"+collect);

		
		
		/*lambda expression
		default methods
		functional interface and its types
		stream api and its methods(filter-predicate, map-function,sorted-comparable &comparator,collect,count,sorted,distinct,min, max)
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
