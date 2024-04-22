package com.training5;

public class WrapperClass {

	public static void main(String[] args) {
		int a = 1;
		char c = 'a';
		float num = 2.3f;
		double number = 3.4;
		
		Integer num1 = Integer.valueOf(a);
		Character character = Character.valueOf(c);
		Float num2 = Float.valueOf(num);
		Double num3 = Double.valueOf(number);
		System.out.println(num1+" "+character+" "+num2+" "+num3);
		
	}

}
