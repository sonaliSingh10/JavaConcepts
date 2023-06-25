package sunday;

public class Student {

	private String name;
	private int roll;

	public Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}

}
