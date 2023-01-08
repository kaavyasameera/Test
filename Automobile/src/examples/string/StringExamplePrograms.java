package examples.string;

public class StringExamplePrograms {

	public static void main(String[] args) {
		String syllabus = "+*Selenium with Java-1.8 version &^&";
		String latestSyllabus = "";
		int syllabusCharsCount_ = syllabus.length();
		System.out.println("Chars count before spaces removal: "+syllabusCharsCount_);
		latestSyllabus = syllabus.replaceAll(" ", "");
		int syllabusCharsCount = latestSyllabus.length();
		System.out.println("Chars count after spaces removal: "+syllabusCharsCount);
		int spacesCount = syllabusCharsCount_-syllabusCharsCount;
		System.out.println("spaces count is: "+spacesCount);
		
		syllabus = syllabus.toUpperCase(); // String to uppercase
        System.out.println(syllabus);
	}

}
