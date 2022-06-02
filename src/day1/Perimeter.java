package day1;

import java.util.Scanner;

public class Perimeter {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter radius of circle: ");
		double radius = scanner.nextDouble();
	
		scanner.close();
		
		System.out.print("Perimeter of Circle with radius "+radius+" is "+(2*3.1427*radius));
		

	}

}
