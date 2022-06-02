package day1;

import java.util.Scanner;

public class LeapOrNot {
	
	 static boolean isLeap=false;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a year:");
		int year = scanner.nextInt();
		scanner.close();
		
		checkLeap(year);

	}
	
	static void checkLeap(int year) {
		if((year%400==0)||(year%4==0 && year%100!=0)) {
			isLeap=true;
		}
		
		if(isLeap)
			System.out.println("Yes,Its a leap year!");
		else {
			System.out.println("No, Its not a leap year!");
		}
	}

}
