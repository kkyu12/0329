package Mar29th;

import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("#Current Converter");
		System.out.println("1. Celsius -> Fahrenheit");
		System.out.println("2. Fahrenheit -> Celsius");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		int temper = sc.nextInt();
		int result = 0;
		if (choice == 1) {
			result = temper * 9 / 5 + 32;
			System.out.println(result);
		} else if (choice == 2) {
			result = (temper - 32) * 5 / 9;
			System.out.println(result);
		} else {
			System.out.println("Error");
		}

	}

}
