package interviews.test;

public class LongerName {

	public static void main(String[] args) {

		String str[] = {"Apple","Mango","Orange","Guava","AnyWord"};
		
		for(int i=0;i< str.length;i++) {
			String string = str[i];
			if(string.length()>5 && string.startsWith("A")) {
				System.out.println(string);
			}
		}
	}

}
