package Mar29th;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Practice09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for (int i = 0; i < 6; i++) {
			int random = (int) (Math.random() * 45) + 1;
			System.out.println(random);
		}
		*/
		
		// System.out.println(Math.min(3, 13));
		// System.out.println(Math.max(123, 54));
		// System.out.println(Math.abs(-23.1));
		// System.out.println(Math.sqrt(3));
		// System.out.println(Math.random());
		
		TimeZone time;
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		time = TimeZone.getTimeZone("Asia/Seoul");
		dateFormat.setTimeZone(time);
		System.out.println(time.getDisplayName() + " : " + dateFormat.format(date));

		time = TimeZone.getTimeZone("America/New_York");
		dateFormat.setTimeZone(time);
		System.out.println(time.getDisplayName() + " : " + dateFormat.format(date));
	
		time = TimeZone.getTimeZone("America/Los_Angeles");
		dateFormat.setTimeZone(time);
		System.out.println(time.getDisplayName() + " : " + dateFormat.format(date));
		
		time = TimeZone.getTimeZone("Pacific/Honolulu");
		dateFormat.setTimeZone(time);
		System.out.println(time.getDisplayName() + " : " + dateFormat.format(date));
		
		time = TimeZone.getTimeZone("Europe/London");
		dateFormat.setTimeZone(time);
		System.out.println(time.getDisplayName() + " : " + dateFormat.format(date));
		
	}

}
