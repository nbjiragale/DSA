package day1;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a= scanner.nextInt();
		int b=scanner.nextInt();
		
		scanner.close();
		
		System.out.println("Product is "+a*b);

	}

}
