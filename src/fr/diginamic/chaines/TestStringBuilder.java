package fr.diginamic.chaines;

import java.util.Calendar;

public class TestStringBuilder {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		String string = new String();
		long debut = System.currentTimeMillis();
		for (int i = 1; i <= 100_000; i++) {
			stringBuilder.append(i);
		}
		
		System.out.println("Temps d'execution StringBuilder : " + (System.currentTimeMillis() - debut));
		debut = System.currentTimeMillis();
		for (int i = 1; i <= 100_000; i++) {
			string += ""+i; 
		}			
		System.out.println("Temps d'execution String : " + (System.currentTimeMillis() - debut));
	}

}
