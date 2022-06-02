package day1;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		
		scanner.close();
		
		swapNumbers(a, b);
	}
	
	static void swapNumbers(int a, int b) {
		int temp;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println(a+"   "+b);
	}

}
