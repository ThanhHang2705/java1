package ddd;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		double length, width;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter length : ");
		width = scanner.nextDouble();
		System.out.print("Enter width: ");
		length = scanner.nextDouble();
		System.out.println("chu vi = " + (width + length) * 2);
		System.out.println("dien tich = " + width * length);
		System.out.println("canh nho nhat : " + Math.min(width, length));

	}

}
