package day4and5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueOperation {
     static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		isEmpty(queue);
		enque(queue);
		enque(queue);
		enque(queue);
		dequeu(queue);
		peek(queue);
		dequeu(queue);
		enque(queue);
		enque(queue);
		dequeu(queue);
		peek(queue);
		isEmpty(queue);
		
	}

	private static void isEmpty(Queue<Integer> queue) {
		if(queue.isEmpty())
			System.out.println("Yes, Queue is empty");
		else
			System.out.println("Queue is not empty");
		
	}

	private static void peek(Queue<Integer> queue) {
		if(queue.isEmpty())
			System.out.println("Queue is empty");
		else {
			System.out.println(queue.peek()+" is the peek element");
		}	
	}

	private static void dequeu(Queue<Integer> queue) {
		if(queue.isEmpty())
			System.out.println("Queue is empty");
		else {
			System.out.println(queue.peek()+ "is deleted");
			queue.remove();
		}
	}

	private static void enque(Queue<Integer> queue) {
		System.out.println("Enter element to add it to quque");
		int num = sc.nextInt();
	  queue.add(num);	
	}

}
