package Mar29th;

import java.util.Scanner;

public class Practice14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] strArr = input.split(" ");
		String mm = "aeiou";
		String jj = "bcdfghjklmnpqrstvwxyz";

		String[] mo = mm.split("");
		String[] ja = jj.split("");
		
		for (int i = 1; i < strArr.length; i++) {
			for (int j = 0; j < mo.length; j++) {
				if (strArr[i].substring(0, 1).equals(mo[j])) {
					if (strArr[i - 1].equals("a")) {
						strArr[i - 1] = "an";
					}
				} 
			}
			for (int k = 0; k < ja.length; k++) {
				if (strArr[i].substring(0, 1).equals(ja[k])) {
					if (strArr[i - 1].equals("an")) {
						strArr[i - 1] = "a";
					}
				} 
			}
		}
	
		for (int i = 0; i < strArr.length; i++)
			System.out.print(strArr[i] + " ");
	}

}
