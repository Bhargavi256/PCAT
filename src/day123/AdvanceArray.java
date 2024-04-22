package day123;

import java.util.Scanner;

public class AdvanceArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("Enter first and last index for slicing the array");
		int firstIndex = sc.nextInt();
		int lastIndex = sc.nextInt();
		int n1 = lastIndex-firstIndex+1;
		int[] returnedArray = new int[n1];
		SliceArray(arr,n,firstIndex,lastIndex,returnedArray);
		for(int num:returnedArray) {
			System.out.println(num);
		}
	}

	private static void SliceArray(int[] arr, int n, int firstIndex, int lastIndex, int[] returnedArray) {
		int k =0;
		for(int i=firstIndex;i<=lastIndex;i++) {
			returnedArray[k]=arr[i];
			k++;
		}
		
	}

}
