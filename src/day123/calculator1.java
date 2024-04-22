package day123;

public class calculator1 {

	public static void main(String[] args) {
		int sum=0;
		for(String arg : args) {
			sum += Integer.valueOf(arg);
		}
		System.out.println(sum);
		
		int mul=1;
		for(String arg : args) {
			mul *= Integer.valueOf(arg);
		}
		System.out.println(mul);
		
	}

}
