package day1;

import java.util.Scanner;

public class InchToMeter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter in Inch: ");
		double inch = scanner.nextDouble();
		scanner.close();
		toMeter(inch);
		
		

	}
	
	static void toMeter(double inch) {
		System.out.println("Converted into Meter: "+(inch*0.0254));
	}

}
