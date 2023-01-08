package toipc.polymorphism;

public class Overriding extends Overloading{

	public static void main(String[] args) 
	{
		Overriding ride = new Overriding();
		ride.emiCalculation();
		ride.emiCalculation(56);
		System.out.println(ride.emiCalculation(250000, (byte)8, 852652));
	}
	
	public  float emiCalculation(int downPayment, byte emiTenure, int onRoadPrice)
	{
		int eligibleAmountForLoanCalculation = onRoadPrice-downPayment;
		float emi = (eligibleAmountForLoanCalculation*11.56f*emiTenure)/100;
		return emi;
	}
	
	public void emi()
	{
		System.out.println("child");
	}
	

}
