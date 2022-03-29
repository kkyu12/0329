package Mar29th;

import java.util.Scanner;

public class Report01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int count = 1;
		int num2 = num1, mean = num1, max = num1, min = num1;
		System.out.println("Result : " + count + " - Mean " + mean + 
				", Max " + max + ", Min " + min);
		while (true) {
			num1 = sc.nextInt();
			num2 = num2 + num1;
			count++;
			mean = num2 / count;
			max = Math.max(max, num1);
			min = Math.min(min, num1);
			System.out.println("Result : " + count + " - Mean " + mean + 
					", Max " + max + ", Min " + min);
		}

	}

}
