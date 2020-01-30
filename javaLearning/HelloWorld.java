package javaLearning;

import java.util.Scanner;

public class HelloWorld {
	
	

	public static void main(String[] args) {

		//System.out.println("Hello world");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number");
		
		int firstNumber = input.nextInt();
		System.out.println("Enter the second number");
		int secondNumber = input.nextInt();
		
		System.out.println("the sum of the two numbers is: " + (firstNumber + secondNumber));
		
		if (firstNumber > secondNumber) {
			System.out.println("the first number is greater than the second number");
		}
		else if (firstNumber < secondNumber) {
			System.out.println("the first number is less than the second number");
		}
		else {
			System.out.println("both numbers are equal");
		}
		
		
		
	}
	
	

}
