package day123;

import java.util.Scanner;

public class BubbleSort {
	
	public static void InitializeArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter th esize of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		bubbleSort(arr,n);
		for(int num:arr) {
 			System.out.print(num+" ");
 		}
		
	}

	private static void bubbleSort(int[] arr, int n) {
		for(int i=0;i<n;i++) {
 			for(int j=0;j<n-1-i;j++) {
 				if(arr[j]>arr[j+1]) {
 					int temp = arr[j];
 					arr[j]=arr[j+1];
 					arr[j+1]=temp;
 				}
 			}
		}
		
	}

	public static void main(String[] args) {
		
		
 		InitializeArray();
 		
 		
	}
}
