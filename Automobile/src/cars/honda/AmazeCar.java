package cars.honda;

import cars.suzuki.ErtigaCar;

import cars.suzuki.HeatherV2;
import cars.suzuki.SwiftCar;


public class AmazeCar 
{
	public static int carOnRoadPrice = 1200000; // number // int/ long
	public static int downPayment = 200000; // number // int/ long
	public static byte emiTenure = 7; // number // byte/ short/ int/ long
	public static float emiRateOfInterest = 11.66f;  // decimal number
	public char customerRating = 'A'; // character // If customer rating is A or B, we can provide Loan
	public boolean loanEligibility = true; // decision making
	public long customerAadharNumber = 123456789112l;
static int sum;
	public static void main(String[] args) 
	{
		HeatherV2 v2 = new HeatherV2();
		
		sumNumbers();
		// TODO Auto-generated method stub
		SwiftCar swift = new SwiftCar();
		swift.emiCalculation();
		ErtigaCar.getSeatCount();
		SwiftCar.getDownPayment();
	}
	
	public static void sumNumbers()
	{
		int sum=12;
		int total = 587;
		total = total + sum;
		System.out.println(total);
	}
}
