package examples.string;

public class StringReverse {

	public static void main(String[] args) {
		String syllabus = "Selenium with Java", reverse="";
		// avaJ htiw muineleS
		int lastIndex = syllabus.length()-1;
		for(int index=lastIndex; index>=0; index--)
		{
			char ch = syllabus.charAt(index);
			reverse = reverse + ch;
		}
		System.out.println(reverse);
	}

}
