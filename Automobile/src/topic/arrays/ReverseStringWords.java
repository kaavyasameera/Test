package topic.arrays;

public class ReverseStringWords {

	public static void main(String[] args) {
		String syllabus = "Selenium with Java version 1.8", reverse="";
		// 1.8 version Java with Selenium
		String[] allWords = syllabus.split(" ");
		for(int index=allWords.length-1; index>=0; index--)
		{
			if(index==allWords.length-1)
				reverse = reverse + allWords[index];
			else
			reverse = reverse +" "+ allWords[index];
		}
		System.out.println(reverse);
	}

}
