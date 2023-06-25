package interviews.overridding;

public class SamsungS2 extends SamsungS1 
{

	void camera() 
	{
		System.out.println("Camera of 32MP");
	}
	
	void ram()
	{
		System.out.println("RAM of 8GB");
	}
	
	

	public static void main(String[] args) {
		SamsungS2 s2 = new SamsungS2();
		s2.ram();
		s2.screen();
		s2.camera();
		
		
	}

}
