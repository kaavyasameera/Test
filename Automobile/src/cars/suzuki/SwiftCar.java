package cars.suzuki;

public class SwiftCar 
{
   // calculating EMI for customer
	public static int carOnRoadPrice = 1200000; // number // int/ long
	public static int downPayment = 200000; // number // int/ long
	public static byte emiTenure = 7; // number // byte/ short/ int/ long
	public static float emiRateOfInterest = 11.66f;  // decimal number
	public char customerRating = 'A'; // character // If customer rating is A or B, we can provide Loan
	public boolean loanEligibility = true; // decision making
	public long customerAadharNumber = 123456789112l;
	
	public  float emiCalculation(int downPayment, byte emiTenure, int onRoadPrice)
	{
		int eligibleAmountForLoanCalculation = onRoadPrice-downPayment;
		float emi = (eligibleAmountForLoanCalculation*emiRateOfInterest*emiTenure)/100;
//		System.out.println("Yearly EMI: "+emi);
//		System.out.println("Monthly EMI: "+emi/12);
		return emi;
	}
	
	public static void highestAge(int Ram, int Ravi, int Hema)
	{
		if(Ram>Ravi & Ram>Hema)
			System.out.println("Ram age is greater");
		else if(Ravi>Ram & Ravi>Hema)
			System.out.println("Ravi age is greater");
		
		else
			System.out.println("Hema age is greater");
	}
	
	public static int highestAgeFor3People(int Ram, int Ravi, int Hema)
	{
		if(Ram>Ravi && Ram>Hema) 
			return Ram;
		else if(Ravi>Ram && Ravi>Hema)
			return Ravi;
		else
			return Hema;
	}
	
	public void emiCalculation()
	{
		int eligibleAmountForLoanCalculation = carOnRoadPrice-downPayment;
		float emi = (eligibleAmountForLoanCalculation*emiRateOfInterest*emiTenure)/100;
		System.out.println("Yearly EMI: "+emi);
		System.out.println("Monthly EMI: "+emi/12);
		return;
	}
	
	 static public  void  main(String[] test)
		{
		 highestAge(15, 12, 28);
		 int highestAgePerson = highestAgeFor3People(52, 65, 26);
		 System.out.println("Highest age of person age is: "+highestAgePerson);
//			float finalEmi =  emiCalculation(320000, (byte)5, 1200000);
//			System.out.println("Yearly EMI: "+finalEmi);
//		System.out.println("Monthly EMI: "+finalEmi/12);
//		System.out.println("Half yearly EMI: "+finalEmi/2);
//		System.out.println("Quarterly EMI: "+finalEmi/3);
//			 emiCalculation(100000, (byte)10, 1700000);
			//emiCalculation();
//			System.out.println(downPayment); // 2L
//			downPayment = downPayment+2;
//			System.out.println(downPayment); // 200002
//			getCarOnRoadPrice(); // 12L
//			getCarOnRoadPrice(); // 12L
//			getDownPayment(); // 2L
//			getCarOnRoadPrice(); // 12L
//			System.out.println();
//			main();
		}
	
	public static   void  main()
	{
		getCarOnRoadPrice();
		//getEmiTenure();
		System.out.println(downPayment); // 2L
		downPayment = downPayment+2;
		System.out.println(downPayment); // 200002
		
	}
	
	public static void getCarOnRoadPrice()
	{
		System.out.println("Car on road price: "+carOnRoadPrice); // it will print output in console
		// Expected output: 1200000;
	}
	
	
	public static void getDownPayment()
	{
		
		getCarOnRoadPrice();
		System.out.println("Car on down payment: "+downPayment); // it will print output in console
		// Expected output: 200000;
	}
	
	
	public void getEmiTenure()
	{
		emiCalculation();
		getCarOnRoadPrice();
		System.out.println(emiTenure); // it will print output in console
		// Expected output: 7;
	}
	
	
	
}
