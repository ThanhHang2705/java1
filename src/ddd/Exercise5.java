package ddd;

import java.util.Scanner;

public class Exercise5 {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		int exer;
		System.out.println("-----------------Menu--------------------");
		System.out.println("1. Xuất thông tin");
		System.out.println("2. Tính chu vi, diện tích HCN");
		System.out.println("3. Tính thể tích hình lập phương");
		System.out.println("4. In ra căn delta");
		System.out.println("5. Thoát");
		System.out.println("-----------------------------------------");
		System.out.println("Chọn chức năng : ");
		exer = scanner.nextInt();
		switch (exer) {
		case 1:
			nhapHoTen();
			break;
		case 2:
			rectangle();
			break;
		case 3:
			cube();
			break;
		case 4:
			calculateDelta();
			break;
		default:
			break;
		}
	}

	public static void nhapHoTen() {
		String lastname, firstname;
		double mark;
		scanner.nextLine();
		System.out.print("Mời bạn nhập họ: ");
		lastname = scanner.nextLine();
		System.out.println("Mời bạn nhập tên: ");
		firstname = scanner.nextLine();
		System.out.print("Mời bạn nhập điểm: ");
		mark = scanner.nextDouble();
		System.out.println("Thông tin của bạn : " + lastname + " " + firstname + ": " + mark + " điểm");
		menu();
	}

	public static void rectangle() {
		double length, width;
		System.out.println("Bài tập tính chu vi, diện tích hình chữ nhật : ");
		System.out.print("Nhập chiều dài  : ");
		width = scanner.nextDouble();
		System.out.print("Nhập chiều rộng : ");
		length = scanner.nextDouble();
		System.out.println("chu vi hình chữ nhật = " + (width + length) * 2);
		System.out.println("diện tích hình chữ nhật = " + width * length);
		System.out.println("cạnh nhỏ nhất của hình chữ nhật : " + Math.min(width, length));
		menu();
	}

	public static void cube() {
		double length;
		System.out.println("Bài tập tính thể tích khối lập phương : ");
		System.out.print("Nhập chiều dài cạnh : ");
		length = scanner.nextDouble();
		System.out.println("thể tích khối lập phương là:  = " + Math.pow(length, 3));
		menu();
	}

	public static void calculateDelta() {
		double a, b, c;
		System.out.println("Bài tập tính delta của phương trình ax^2 +bx +c =0 ");
		System.out.print("Nhập a: ");
		a = scanner.nextDouble();
		System.out.print("Nhập b: ");
		b = scanner.nextDouble();
		System.out.print("Nhập c: ");
		c = scanner.nextDouble();
		double delta = Math.pow(b, 2) - 4 * a * c;
		if (delta >= 0) {
			System.out.println("căn delta = " + Math.sqrt(delta));
		} else {
			System.out.println("delta < 0 ");
		}
		menu();

	}

}
