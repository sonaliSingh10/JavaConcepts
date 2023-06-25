package interviews;

public class MyInterfaceImplByRavi implements MyInterface{

	@Override
	public String sayHello(String name) {
		return "Hey "+name+" Hello";
	}

	@Override
	public String sayBye(String name) {
		return "c u later"+name;
	}

	@Override
	public int countLength(String string) {
		if(string==null)
		{
			return -1;
		}
		else
		{
			return string.length();
		}
	}

}
