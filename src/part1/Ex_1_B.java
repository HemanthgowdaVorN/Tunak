package part1;

import java.util.Scanner;

public class Ex_1_B 
{
	public static void main (String[]args) {
		int num1, num2, sum;
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the first number");
		num1 = c . nextInt();
		System.out.println("Enter second number");
		num2 = c . nextInt();
		sum=num1+num2;
		System.out.println("Sum of 2 numbers is:"+" "+sum);
	}
}
