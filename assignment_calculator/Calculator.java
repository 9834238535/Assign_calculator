package assignment_calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Calculator {

	public abstract void Addition();

	public abstract void Subtraction();

	public abstract void Multiplication();

	public abstract void Division();

	public abstract void Square();

	public abstract void Modulus();

	public abstract void Squareroot();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Calculator obj = new CalculatorImplementation();

		System.out.println("Press Y to Start Calculating");
		System.out.println("Press N to Exit");
		String n = sc.next().toUpperCase();
		if (n.equals("Y") || n.equals("N")) {

			while (!n.equals("N")) {

				try {
					Thread.sleep(250);

					System.out.println("**********Calculator**********");
					Thread.sleep(250);
					System.out.println("1. For Addition Please Press 1 ");
					Thread.sleep(250);
					System.out.println("2. For Subtraction Please Press 2 ");
					Thread.sleep(250);
					System.out.println("3. For Multiplication Please Press 3 ");
					Thread.sleep(250);
					System.out.println("4. For Division Please Press 4 ");
					Thread.sleep(250);
					System.out.println("5. For Square of Number Please Press 5 ");
					Thread.sleep(250);
					System.out.println("6. For Modulus of number press 6 ");
					Thread.sleep(250);
					System.out.println("7. For Squareroot of number press 7 ");

					System.out.println();

				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Select The Operation You Want To Perform");
				int choice = sc.nextInt();

				switch (choice) {

				case 1:
					try {

						obj.Addition();
					} catch (Exception e) {
						System.out.println("You cant use String as a input " + e);
					}
					break;

				case 2:
					try {
						obj.Subtraction();
					} catch (Exception e) {
						System.out.println("You cant use String as a input " + e);

					}
					break;

				case 3:
					try {
						obj.Multiplication();
					} catch (InputMismatchException e) {
						System.out.println("You cant use String as a input:" + e);

					}

					catch (Exception e) {
						System.out.println(e);

					}

					break;

				case 4:
					try {
						obj.Division();
					} catch (InputMismatchException e) {
						System.out.println("You cant use String as a input:" + e);
					} catch (Exception e) {
						System.out.println(e);
					}
					break;

				case 5:
					try {
						obj.Square();
					} catch (InputMismatchException e) {
						System.out.println("You cant use String as a input:" + e);
					} catch (Exception e) {
						System.out.println(e);
					}
					break;

				case 6:
					try {
						obj.Modulus();
					} catch (InputMismatchException e) {
						System.out.println("You cant use String as a input:" + e);
					} catch (Exception e) {
						System.out.println(e);
					}
					break;

				case 7:
					try {
						obj.Squareroot();
					} catch (InputMismatchException e) {
						System.out.println("You cant use String as a input:" + e);
					} catch (Exception e) {
						System.out.println(e);
					}
					break;

				default:
					System.out.println(" Please Enter valid Choices");

				}
				System.out.println("Press Y to continue");
				System.out.println("Press N to exit");
				n = sc.next().toUpperCase();

			}

			System.out.println("****Thank you***");

		} else {
			System.out.println("Please Enter Y or N to Calculate or to exit");
		}
	}

}
