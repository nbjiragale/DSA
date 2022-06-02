package day2;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] myArr = new int[5];
		int sum=0;
		
		for(int i=0;i<myArr.length;i++) {
			myArr[i]=sc.nextInt();
		}
		
		sc.close();
		
		for(int j=0;j<myArr.length;j++) {
			sum=sum+myArr[j];
		}
		
		System.out.println(sum);

	}

}
