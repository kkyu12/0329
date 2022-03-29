package Mar29th;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		char[] chars = line.toCharArray();
		for (int i = 0; i < line.length(); i++) {
			if (chars[i] >= 97 && chars[i] <= 122) {
				chars[i] -= 32;
			} else if (chars[i] >= 65 && chars[i] <= 90) {
				chars[i] += 32;
			}
			System.out.print(chars[i]);

		}

	}

}
