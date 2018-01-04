package ddd;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		double length;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter length : ");
		length = scanner.nextDouble();
		System.out.println("the tich khoi lap phuong = " + Math.pow(length, 3));
	}

}
