package day123;

public class RecursiceSum {

	public static void main(String[] args) {
		int[] arr= {3,4,5,2,1};
		int n = arr.length;
		
	int sumReturned = sumOfArray(arr,n-1);	
	System.out.println("Sum of array is "+sumReturned);
	}

	private static int sumOfArray(int[] arr, int n) {
		if(n<0){
			return 0;
		}
		
			
			  return arr[n]+sumOfArray(arr,n-1);
		    
		
	}

}
