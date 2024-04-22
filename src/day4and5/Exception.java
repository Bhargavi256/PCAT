package day4and5;

public class Exception {

	public static void main(String[] args) {
		try {
			int res = 1/0;
		}catch(ArithmeticException e) {
			System.out.println("Can't divide by zero");
		}
	}

}
