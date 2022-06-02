package day2;

import java.util.Scanner;

public class GreatestThanAvg {

	static int[] arr=new int[5];
	static int sum=0;
	static int avg=0;
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		checkGreatest();

	}
	
	static int sum() {
		for(int j=0;j<arr.length;j++) {
			 sum=sum+arr[j];
		}
		return sum;
	}
	
	static void checkGreatest() {
		avg=sum()/(arr.length-1);
		
		for(int k=0;k<arr.length;k++) {
			if(arr[k]>avg) {
				System.out.println(arr[k]);
			}
			
		}
		
//		System.out.println(avg);
		
	}

}
