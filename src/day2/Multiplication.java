package day2;

import java.util.Scanner;

public class Multiplication {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n =scanner.nextInt();
		
		scanner.close();
		
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
		}
		

	}

}
