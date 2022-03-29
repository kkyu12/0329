package Mar29th;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// currency converter È¯Àü
		System.out.println("#Current Converter");
		System.out.println("1. South Korean Won -> United States Dollar");
		System.out.println("2. United States Dollar -> South Korean Won");
		System.out.println("3. South Korean Won -> Japanese Yen");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		float money = sc.nextInt();
		float result = 0;
		float dallorRate = 1220.40f;
		float yenRate = 9.8725f;
		if (choice == 1) {
			result = Math.round(money / dallorRate);
			System.out.println(result + " dallor");
		} else if (choice == 2) {
			result = Math.round(money * dallorRate);
			result = result - result % 10;
			System.out.println(result + " won");
		} else if (choice == 3) {
			result = Math.round(money / yenRate);
			result = result - result % 10;
			System.out.println(result + " yen");
		} else {
			System.out.println("Error");
		}

	}

}
