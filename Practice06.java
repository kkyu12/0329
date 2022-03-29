package Mar29th;

import java.util.Calendar;
import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();
		int month = sc.nextInt();

		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);

		calendar.set(year, month - 1, 1);

		int end = calendar.getActualMaximum(calendar.DATE);
		int firstDay = calendar.get(Calendar.DAY_OF_WEEK);

		System.out.println("Snu     Mon     Tue     Wed     Thu     Fri     Sat");

		for (int i = 1; i <= end; i++) {
			if (i == 1) {
				for (int j = 1; j < firstDay; j++) {
					System.out.print("\t");
				}
			}
			System.out.print(i + "\t");
			if (firstDay % 7 == 0) {
				System.out.println();
			}
			firstDay++;
		}

	}

}
