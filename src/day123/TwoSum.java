package day123;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = {1,2,7,5,4,3,9,12};
		int target = 9;
		int[] res = new int[2];
		res=twoSum(arr,target);
		//System.out.println(arr[res[0]]);
		System.out.println("Two numbers that sum upto given target are "+arr[res[0]]+" "+arr[res[1]]);
		
	}

	private static int[] twoSum(int[] arr, int target) {
		Map<Integer,Integer> map = new HashMap<>();
		int res[] = {-1,-1};
		for(int i=0;i<arr.length;i++) {
			int rem = target-arr[i];
			if(map.containsKey(rem)) {
				res[0] = map.get(rem);
				res[1]=i;
				return res;
			}
				
			else
				map.put(arr[i], i);
		}
		
		return res;
	}
}
