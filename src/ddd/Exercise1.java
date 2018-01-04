package ddd;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		String lastname, firstname;
		double mark;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Lastname: ");
		lastname = scanner.nextLine();
		System.out.print("Enter Firstname: ");
		firstname = scanner.nextLine();
		System.out.print("Enter Mark: ");
		mark = scanner.nextDouble();
		System.out.println(lastname + " " + firstname + ": " + mark + " điểm");

	}

}
