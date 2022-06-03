package day2;

import java.util.Scanner;

public class SmallestOf3 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		
		scanner.close();
		
		int temp=a<b?a:b;
		int smallest=temp<c?temp:c;
		
		System.out.println(smallest+" is a smallest among all");

	}

}
