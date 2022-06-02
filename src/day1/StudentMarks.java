package day1;

import java.util.Scanner;

public class StudentMarks {
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter Marks to check grade");
		Scanner scanner= new Scanner(System.in);
		 int marks=scanner.nextInt();
		 scanner.close();
		 
		
		StudentMarks smMarks=new StudentMarks();
		
		smMarks.checkGrade(marks);
		
	}
	
	void checkGrade(int marks) {
		if(marks>=0 && marks<=100) {
			if(marks<=30)
				System.out.println("D");
			if (marks>30 && marks<=50)
				System.out.println("C");
			if(marks>50 && marks<=75)
				System.out.println("B");
			if(marks>75 && marks<=100)
				System.out.println("A");
		}
		else {
			System.out.println("Not a valid marks");
		}
	}

}
