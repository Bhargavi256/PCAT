package day123;

import java.util.Scanner;

public class StringOperations {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter two string");
		String s1 = sc.next();
		String s2 = sc.next();
		
		StringOperation(s1,s2);
	}

	private static void StringOperation(String s1, String s2) {
		String s3 = s1.concat(s2);
		System.out.println("Concatinated String is "+s3);
		System.out.println("hi");
		String s4 = reverseString(s3);
		System.out.println("Reverse of String is "+s4);
		System.out.println("enter begin and end index to get sbstring");
		int begin = sc.nextInt();
		int end = sc.nextInt();
		String str = subString(begin,end,s3);
		if(!str.isEmpty())
		   System.out.println("Substring is "+str);
	}

	private static String subString(int begin, int end, String s3) {
		try{
			String s4 = s3.substring(begin, end);
			return s4;
			
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		return " ";
	}

	private static String reverseString(String s3) {
		System.out.println("hello");
		int start = 0;
		String newString = "";
		int end = s3.length()-1;
		while(end>=start) {
			char c = s3.charAt(end);
			newString += c;
			
			end--;
		}
		return newString;
	}

}
