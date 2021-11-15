package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(
				Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));
		
		for (String string : list) {
			System.out.print(string +"\t");
		}
		System.out.println();
		
		int indexMax = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(indexMax).length() < list.get(i).length()) {
				indexMax = i;
			}
		}
		System.out.println("Max cityname length : "+ list.get(indexMax));
		
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i).toUpperCase());
		}
		
		for (String string : list) {
			System.out.print(string +"\t");
		}
		System.out.println();
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String cityName = (String) iterator.next();
			if (cityName.startsWith("N") ) {
				iterator.remove();
			}			
		}
		
		for (String string : list) {
			System.out.print(string +"\t");
		}
		System.out.println();
	}
}
