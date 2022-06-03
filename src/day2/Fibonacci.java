package day2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter up to what u need:");
		int n=scanner.nextInt();
		
		scanner.close();
		
		int a=0;
		int b=1;
		
		System.out.print(a+" "+b+" ");
		
		for(int i=2;i<=n-1;i++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		
		

	}

}
