package day2;

import java.util.Scanner;

public class SeperationOf0sAnd1s {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("How much Elements Do u need in array?");
		int n=scanner.nextInt();
		
		int[] arr=new int[n];
		int count=0;
		
		System.out.println("Enter 0s and 1s in random:");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==0) {
				count++;
			}
		}
		
		for(int i=0;i<count;i++) {
			arr[i]=0;
			System.out.println(arr[i]);
		}
		
		for(int i=count;i<n;i++) {
			arr[i]=1;
			System.out.println(arr[i]);
		}
		
		

	}

}
