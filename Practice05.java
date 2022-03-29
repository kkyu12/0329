package Mar29th;

import java.util.Calendar;

public class Practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.YEAR) + 1);
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.MONTH) + 3);
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DATE) - 7);

	}

}
