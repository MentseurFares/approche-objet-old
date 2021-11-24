package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 4, 19, 23, 59,30);
		Date date = cal.getTime();
		
		System.out.println(format1.format(date));
		Date date2 = Calendar.getInstance().getTime();
		System.out.println(format2.format(date2));
		
		format2 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.FRANCE);
		System.out.println(format2.format(date2));
		
		format2 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.GERMAN);
		System.out.println(format2.format(date2));
		
		format2 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.CHINESE);
		System.out.println(format2.format(date2));

		format2 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", new Locale("ru", "Ru"));
		System.out.println(format2.format(date2));

	}
}
