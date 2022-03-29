package Mar29th;

import java.util.Scanner;

public class Report02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int positive = 0, negative = 0, odd = 0, even = 0;
		while (true) {
			num1 = sc.nextInt();
			if (num1 > 0) {
				positive++;
			} else if (num1 < 0) {
				negative++;
			}
			num1 = Math.abs(num1);
			if (num1 % 2 == 0) {
				even++;
			} else if (num1 % 2 == 1) {
				odd++;
			}
			System.out.println("P - " + positive + ", N - " + negative + 
					", O - " + odd + ", E - " + even);
		}

	}

}
