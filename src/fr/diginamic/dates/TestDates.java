package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
	
	public static void main(String[] args) {
		Date date = new Date(121,10,22,14,00,00);
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(format1.format(date));
		
		// Creation de la date 
		Date date2 = new Date(116, 04, 19, 23, 59,30);
		System.out.println(format2.format(date2));
		
		
		Date date3 = new Date(System.currentTimeMillis());
		System.out.println(format2.format(date3));
	}

}
