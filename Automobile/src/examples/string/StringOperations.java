package examples.string;

public class StringOperations {

	public static void main(String[] args) 
	{
		String name = "Ram"; 
		String studentName = new String("Ram");
		String studentNameRam = new String("ram");
		String studentNameRavi = new String("Ravi");
		String name2 = "RAm";  
		String studentNameRavi_ = new String("RaVi");
		String studentNameRavi2 = new String("Ravi");
		String name3 = "Ram";
//		if('r'=='R')
//			System.out.println("match");
//		else
//			System.out.println("not match");
		
		if(name==name3)
			System.out.println("match");
		else
			System.out.println("mis-match");
		
		if(name==studentName)
			System.out.println("match");
		else
			System.out.println("mis-match");
		
		if(name.equals(studentName))
			System.out.println("match");
		else
			System.out.println("mis-match");
		
		if(studentNameRam==studentName)
			System.out.println("match");
		else
			System.out.println("mis-match");
		
		if(name==name2)
			System.out.println("match");
		else
			System.out.println("mis-match");
		
		if(studentNameRavi_==studentNameRavi2)
			System.out.println("match");
		else
			System.out.println("mis-match");
		
		if(studentNameRavi==studentNameRavi2)
			System.out.println("match");
		else
			System.out.println("mis-match");


	}

}
