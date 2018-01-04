package ddd;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		double a, b, c;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a: ");
		a = scanner.nextDouble();
		System.out.print("Enter b: ");
		b = scanner.nextDouble();
		System.out.print("Enter c: ");
		c = scanner.nextDouble();
		double delta = Math.pow(b, 2) - 4 * a * c;
		if (delta >= 0) {
			System.out.println("delta= " + Math.sqrt(delta));
		} else {
			System.out.println("delta < 0 ");
		}
	}

}
