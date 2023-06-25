package dpring.di.demo;

public class Test {

	public static void main(String[] args) {

		//We are creating a Student object, but while creating it we need 3 values
		//two primitive values (name, age) and one reference(object) type value ie Address
		
		//so we can say that Student object is dependent on Address object
		
		Student student = new Student();
		student.setName("Random");
		student.setAge(0);
		
		Address address = new Address();
		address.setCity("Sheher");
		address.setState("Rajya");
		
		student.setAddress(address);
		
		System.out.println(student);
		
	}

}
