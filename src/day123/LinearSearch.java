package day123;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("Enter element to search");
		int ele = sc.nextInt();
		int index = PerformLineaSearch(arr,n,ele);
		System.out.println("given element is found at "+index);
	}

	
	private static int PerformLineaSearch(int[] arr, int n, int ele) {
		for(int i=0;i<n;i++) {
			if(arr[i]==ele)
				return i;
		}
		return -1;
	}

}
