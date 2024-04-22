package day4and5;

import java.util.Scanner;

public class TicketPricing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Enter type of movie : Regular or 3D");
		String movieType = sc.next();
		if(movieType.equals("regular")) {
			if(age<18)
				System.out.println("Ticket Price: $8");
			else
				System.out.println("Ticket Price: $12");
		}
		else if(movieType.equals("3D")) {
			if(age<18)
				System.out.println("Ticket Price: $10");
			else
				System.out.println("Ticket Price: $15");
		}
		
	}

}
