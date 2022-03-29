package Mar29th;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date date = new Date();
		Scanner sc = new Scanner(System.in);
		
		String day1 = sc.nextLine();
		String day2 = sc.nextLine();

		Date format1 = new SimpleDateFormat("yyyyMMdd").parse(day1);
		Date format2 = new SimpleDateFormat("yyyyMMdd").parse(day2);

		long diffSec = (format2.getTime() - format1.getTime()) / 1000;
		long diffDays = diffSec / (24 * 60 * 60);
		
		System.out.println(diffDays);

	}

}
