package day123;

public class Consecutive {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int start = 0;
		int end = arr.length-1;
		while(start<end) {
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int num:arr) {
			System.out.print(num+" ");
		}
		
	}

}
