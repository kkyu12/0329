package Mar29th;

import java.math.BigDecimal;
import java.util.Scanner;

public class Practice15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String equation = sc.nextLine();
		System.out.println(equation);
		String str1, str2;
		float num1, num2;
		int cut1;
		if (equation.contains("+")) {
			cut1 = equation.lastIndexOf("+");
			str1 = equation.substring(0, cut1);
			str2 = equation.substring(cut1 + 1);
			num1 = Float.parseFloat(str1);
			num2 = Float.valueOf(str2);
			float result = num1 + num2;
			System.out.println(result);
		} else if (equation.contains("-")) {
			cut1 = equation.lastIndexOf("-");
			str1 = equation.substring(0, cut1);
			str2 = equation.substring(cut1 + 1);
			num1 = Float.parseFloat(str1);
			num2 = Float.valueOf(str2);
			float result = num1 - num2;
			System.out.println(result);
		} else if (equation.contains("*")) {
			cut1 = equation.lastIndexOf("*");
			str1 = equation.substring(0, cut1);
			str2 = equation.substring(cut1 + 1);
			num1 = Float.parseFloat(str1);
			num2 = Float.valueOf(str2);
			float result = num1 * num2;
			System.out.println(result);
		} else if (equation.contains("/")) {
			cut1 = equation.lastIndexOf("/");
			str1 = equation.substring(0, cut1);
			str2 = equation.substring(cut1 + 1);
			num1 = Float.parseFloat(str1);
			num2 = Float.valueOf(str2);
			float result = num1 / num2;
			System.out.println(result);
		}
		
		

		// String text = "-31.5234567890123456789012345678901234567890123456789";
		// System.out.println(text);
		// System.out.println(Float.parseFloat(text));
		// System.out.println(Double.parseDouble(text));
		// Double d = Double.parseDouble(text);
		// System.out.println(d);
		// System.out.println(d.intValue());
		// BigDecimal bd = new BigDecimal(text);
		// System.out.println(bd);
		// System.out.println(Math.round(d));
		// System.out.println(Math.floor(d));
		// System.out.println(Math.ceil(d));
		// float f = 3.26f;
		// System.out.println(f);
		// System.out.println((int)f);

	}

}
