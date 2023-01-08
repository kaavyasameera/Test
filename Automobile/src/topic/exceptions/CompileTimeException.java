package topic.exceptions;

public class CompileTimeException {

	public static void main(String[] args) throws InterruptedException {
		int number = 58755;
		number+=5;
		Thread.sleep(2000);
		number+=5;
		System.out.println(number);

	}

}
