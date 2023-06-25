package interviews;

public class MyInterfaceImplbyRahul implements MyInterface{

	@Override
	public String sayHello(String name) {
		return "Hello "+name;
	}

	@Override
	public String sayBye(String name) {
		return "Bye!"+name;
	}

	@Override
	public int countLength(String string) {
		
		return string.length();
	}

	

}
