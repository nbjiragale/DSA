package day1;

import java.util.Scanner;

public class GreatestOf3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers:");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		
		scanner.close();
		
		greatestOf3(a,b,c);

	}
	
	static void greatestOf3(int a,int b,int c) {
		int temp;
		temp=a>b?a:b;
		int largest= temp>c?temp:c;
		
		System.out.println(largest);
	}

}
