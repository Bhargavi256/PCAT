package com.training5;

import java.util.Scanner;

public class DeleteANum {

	public static void main(String[] args) {
	double[] arr = {3,4,5,6,7};
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to delete form the array");
    double n = sc.nextDouble();
    double[] newarr = new double[arr.length-1];
    int k=0;
    for(int i=0;i<arr.length;i++) {
    	if(arr[i]==n)
    		continue;
    	newarr[k]=arr[i];
    	k++;
    }
    for(double num:newarr) {
    	System.out.print(num+" ");
    }
    System.out.println();
    for(int i=0;i<newarr.length;i++) {
    	double addValue = 0.2*newarr[i];
    	newarr[i]=newarr[i]+addValue;
    }
    for(double num:newarr) {
    	System.out.print(num+" ");
    }
}
}
