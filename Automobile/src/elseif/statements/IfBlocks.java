package elseif.statements;

import java.util.Scanner;

public class IfBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer time = sc.nextInt();

		//int time = 22;
	    if (time < 10) 
	      System.out.println("Good morning.");
	    else if (time < 255)
	    	System.out.println(" Good afternoon");
	      else 
	      System.out.println("Good evening.");
	    
	    String data = (time < 10) ? "Good morning." : "Good evening.";
	    System.out.println("Ternary operator: "+data);
	   String dataName =  (time < 10) ? "Good morning." : (time < 255) ? " Good afternoon": "Good evening.";
	   System.out.println("Ternary operator for multiple conditions: "+data);
		 int n1 = 2025,  n2=558;
		    if (n1 > n2) 
		    {   System.out.println(n1+" is greater than "+n2);// obviously
		    System.out.println("Selenium with Java");}
		    else
		    	System.out.println(n2+" is greater than "+n1);
		    System.out.println("Selenium with Java");
	}

}
