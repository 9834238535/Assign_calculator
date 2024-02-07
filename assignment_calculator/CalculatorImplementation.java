package assignment_calculator;

import java.util.Scanner;

class ForException extends RuntimeException {

	ForException(String s) {
		super(s);
	}

}

public class CalculatorImplementation extends Calculator {

	int n;
	int n1;

	public void input() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Number : ");
		int n = sc.nextInt();

		this.n = n;

		System.out.println("Enter The Second Number : ");
		int n1 = sc.nextInt();
		this.n1 = n1;

	}

	public void Addition() {

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int i = 1;

		System.out.println("please Enter The Numbers");

		System.out.println("Press 0 after inputting the multiple values for result");
		while (i != 0) {
			i = sc.nextInt();
			sum = sum + i;

		}
		System.out.println("The sum of numbers is : " + sum);
	}

	public void Subtraction() {

		Scanner sc = new Scanner(System.in);

		System.out.println("please enter the Numbers");
		System.out.println("Press 0 after inputting the multiple values for result");

		int sub = 0;
		int k = 0;
		int i = 1;
		while (i != 0) {
			i = sc.nextInt();
			if (k == 0) {
				sub = i;
				k++;
			} else {
				sub = sub - i;
			}
		}
		System.out.println("Subtraction is= " + sub);
	}

	public void Multiplication() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please eneter the number");
		System.out.println("Press 1 after inputting the multiple values for result");

		int k = 0;

		int mul = 1;
		int i = 0;
		System.out.println("Press 1 Afetr inputting the values to calculate multiplication");
		while (i != 1) {
			i = sc.nextInt();
			if (k == 0 && i == 0) {
				k++;
				throw new ForException("Sorry You Can't enter first number as 0 for Multiplication");
			} else {
				mul = mul * i;

			}

		}
		System.out.println("Multiplication for provided numbers is : " + mul);

	}

	public void Division() {

		this.input();
		int n3 = n / n1;
		if (n == 0) {
			throw new ForException("Sorry You Can't enter first number as 0 for Division");
		} else {
			System.out.println("Divison for provided numbers is : " + n3);
		}

	}

	public void Square() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int n = sc.nextInt();
		int n3 = n * n;

		if (n == 0) {
			throw new ForException("Sorry You Can't enter first number as 0 for Square");
		} else {
			System.out.println("Square of the numbers is : " + n3);
		}

	}

	public void Modulus() {

		this.input();
		int n3 = n % n1;
		if (n == 0) {
			throw new ForException("Sorry You Can't enter first number as 0 for Modulus");
		} else {
			System.out.println("Modulus for the numbers is : " + n3);
		}

	}

	public void Squareroot() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Youre Number : ");
		int n = sc.nextInt();
		if (n == 0) {
			throw new ForException("Sorry You Can't enter first number as 0 for Squareroot");
		} else {

			int count = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					if (i * i == n) {
						System.out.println("Square Root Of " + n + " = " + i);
						count++;
					}

				}

			}
			if (count == 0) {
				System.out.println(n + " Number Sqaure Root cant be calculated");
			}
		}

	}

}
