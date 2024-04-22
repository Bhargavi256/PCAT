package day4and5;

import java.util.Scanner;
import java.util.Stack;

public class StackOperation {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		isEmpty(stack);
		peek(stack);
		push(stack);
		peek(stack);
		pop(stack);
		peek(stack);
		push(stack);
		push(stack);
		peek(stack);
		pop(stack);
	    isEmpty(stack);
	}

	private static void peek(Stack<Integer> stack) {
		if(stack.isEmpty())
			System.out.println("Stack is empty");
		else {
			System.out.println(stack.peek()+" is the peek element");
		}
	}

	private static void pop(Stack<Integer> stack) {
		if(stack.isEmpty())
			System.out.println("Queue is empty");
		else {
			System.out.println(stack.peek()+ "is deleted");
			stack.pop();
		}
		
	}

	private static void isEmpty(Stack<Integer> stack) {
		if(stack.isEmpty())
			System.out.println("Yes, Stack is empty");
		else
			System.out.println("Stack is not empty");
	}

	private static void push(Stack<Integer> stack) {
		System.out.println("Enter element to add it to stack");
		int num = sc.nextInt();
	  stack.add(num);
	}

	

}
