package sets;

import java.util.Arrays;
import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {
		HashSet<Double> setDouble = new HashSet<>(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));
		
		for (Double val : setDouble) {
			System.out.print(val + "\t");
		}
		System.out.println();
		
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		
		for (Double val : setDouble) {
			if(val>max) {
				max = val;
			}
		}
		System.out.println("MAX = " + max);
		
		for (Double val : setDouble) {
			if(val < min) {
				min = val;
			}
		}
		System.out.println("MIN = " + min);
		setDouble.remove(min);
		System.out.println(setDouble);
		
	}

}
