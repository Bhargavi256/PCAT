package day123;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a=3;
		int b = 5;
		System.out.println("Before:");
		System.out.println("Value of a is : "+a);
		System.out.println("Value of b is : "+b);
		a = a+b;
		b = a-b;
		a =a-b;
		System.out.println("After:");
		System.out.println("Value of a is : "+a);
		System.out.println("Value of b is : "+b);
		
	}

}
