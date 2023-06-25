package interviews.test;

public class Employee {

	String name;
	String department;
	String gender;
	String city;
	double salary;
	
	
	
	public Employee() {
		
	}
	public Employee(String name, String department, String gender, String city, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.gender = gender;
		this.city = city;
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", gender=" + gender + ", city=" + city
				+ ", salary=" + salary + "]";
	}
	
}
