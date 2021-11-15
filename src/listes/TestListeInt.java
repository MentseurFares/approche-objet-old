package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestListeInt {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
		
		for (Integer entier : list) {
			System.out.print(entier+"\t");
		}
		System.out.println();
		System.out.println("List size : " + list.size());
		
		int indexMax = 0;
		int indexMin = 0;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(indexMax) < list.get(i)) {
				indexMax = i;
			}
			if(list.get(indexMin) > list.get(i)) {
				indexMin = i;
			}
		}
		
		System.out.println("Max : " + list.get(indexMax));
		System.out.println("Min : " + list.get(indexMin));
		list.remove(indexMin);
		for (Integer entier : list) {
			System.out.print(entier+"\t");
		}
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) < 0) {
				list.set(i, -list.get(i));
			}
		}
		for (Integer entier : list) {
			System.out.print(entier+"\t");
		}
		System.out.println();
	}

}
