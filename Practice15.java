package Mar29th;

import java.math.BigDecimal;
import java.util.Scanner;

public class Practice15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String equation = sc.next();
		String str1, str2, outputOper = "", oper = "+-*/%";
		String[] operArr = oper.split("");
		float num1 = 0f, num2 = 0f, result = 0f;
		int cut1;

		for (int i = 0; i < operArr.length; i++) {
			if (equation.contains(operArr[i])) {
				cut1 = equation.lastIndexOf(operArr[i]);
				str1 = equation.substring(0, cut1);
				str2 = equation.substring(cut1 + 1);
				num1 = Float.valueOf(str1);
				num2 = Float.valueOf(str2);
				outputOper = operArr[i];
				break;
			}
		}

		if (outputOper.equals("+")) {
			result = num1 + num2;
		} else if (outputOper.equals("-")) {
			result = num1 - num2;
		} else if (outputOper.equals("*")) {
			result = num1 * num2;
		} else if (outputOper.equals("/")) {
			result = num1 / num2;
		} else if (outputOper.equals("%")) {
			result = num1 % num2;
		}

		System.out.println(result);

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
