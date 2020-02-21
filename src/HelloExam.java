
public class HelloExam {
	
	public static void main(String... arguments) {
		System.out.println("main method...");
		main("hello world");
		main(5);
	}
	
	public static void main(String args) {
		System.out.println("overloaded main method");
	}
	
	public static void main(int number) {
		System.out.println("number = " +number);
	}

}
