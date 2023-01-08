package toipc.polymorphism;

public  class Overloading {

	public static void main(String[] args) 
	{
		System.out.println();
		Overloading load = new Overloading();
		System.out.println(load.emiCalculation(250000, (byte)8, 852652));

	}
	
	public  void emi()
	{
		System.out.println("parent");
	}
	
	
	public void emiCalculation()
	{
	// logic
	}
	
	 public  float emiCalculation(int downPayment, byte emiTenure, int onRoadPrice)
	{
		int eligibleAmountForLoanCalculation = onRoadPrice-downPayment-50000;
		float emi = (eligibleAmountForLoanCalculation*11.56f*emiTenure)/100;
		return emi;
	}
	
	public void emiCalculation(int emi)
	{
	// logic
	}
	
	public void emiCalculation(int emi, float interestRate) 
	{
	// logic
	}
	
	public void emiCalculation(float emi, float interestRate) 
	{
	// logic
	}
	
	public void emiCalculation(float emi, float interestRate, int downPayment)
	{
	// logic
	}


}
