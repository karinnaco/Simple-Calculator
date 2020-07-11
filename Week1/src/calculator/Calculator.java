package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		int number1=0;
		int number2=0;
		int sum=0;
		
		System.out.print("Enter the first number: ");
		number1 = reader.nextInt();
		System.out.print("Enter the second number: ");
		number2 = reader.nextInt();
		
		sum = number1+number2;
		
		System.out.printf("Result is %d\n", sum);

	}

}
