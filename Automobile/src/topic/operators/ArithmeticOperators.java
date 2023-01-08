package topic.operators;

public class ArithmeticOperators {

	public static void main(String[] args) 
	{
		incDecOperators();
		int number = 12;
		System.out.println(32+65);    // 97
		System.out.println("Selenium"+65); // Selenium65
		System.out.println("32"+65); //3265
		System.out.println(32+"65"); //3265
		System.out.println(12+32+"65"); // 4465
		System.out.println(89.6+"Selenium"+" "+65); // 89.6Selenium 65
		System.out.println(false+"Selenium"+65); //falseSelenium65
		System.out.println("Selenium"+65+93); // Selenium6593
		System.out.println(82.3+69+"Selenium"+65); // 151.3Selenium65
		System.out.println("Selenium"+" "+"Java"); // Selenium Java
		System.out.println("test1 "+"test2 "+"test3");
		System.out.println("test1 "+number);
	}
	
	public static void incDecOperators()
	{
		int hours = 5687;
		hours = hours + 1; 
		System.out.println(hours++);  // 5688
		System.out.println(++hours);  // 5690
		System.out.println(hours--); // 5690
		System.out.println(hours--); // 5689
		System.out.println(--hours);  //5687
	}

}
