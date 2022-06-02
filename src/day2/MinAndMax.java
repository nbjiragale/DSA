package day2;

import java.util.Scanner;

public class MinAndMax {
	
	public static void main(String args[]) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		
		scanner.close();
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j]<min) {
				min=arr[j];
			}
		}
		
		for(int k=0;k<arr.length;k++) {
			if(arr[k]>max) {
				max=arr[k];
			}
		}
		
		System.out.println(min+"   max is "+max);
	}
}
