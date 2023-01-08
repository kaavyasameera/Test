package cars.suzuki;

public class HeatherV2 {
	public static int carOnRoadPrice = 1200000; // number // int/ long
	protected static int downPayment = 200000; // number // int/ long
	private static byte emiTenure = 7;
	long customerAadharNumber = 123456789112l;
	
	public static void main(String[] args) {
		

	}
	
	public void m1()
	{
		System.out.println(emiTenure);
		System.out.println("m1");
	}
	
	private void m2()
	{
		m1();
		System.out.println("m2");
	}
	
	 void m3()
	{
		 m2();
		System.out.println("m3");
	}
	
	protected void m4()
	{
		System.out.println("m4");
	}

}
