package examples.string;

public class StringExtractSpecialCharacters {

	public static void main(String[] args) {
		String syllabus = "Selenium is an %$&54open source umbr3265 ella project for a^&*& range of tools and libraries aimed at supporting browser automation. It provides a playback tool for authoring functional tests across most modern web…";
		syllabus = syllabus.replaceAll("[a-zA-Z0-9]", "/");
		System.out.println(syllabus);
	}

}
