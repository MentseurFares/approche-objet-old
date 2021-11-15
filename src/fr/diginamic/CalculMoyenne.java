package fr.diginamic;

import java.util.Arrays;

public class CalculMoyenne {
	
	private double[] valeurs ;
	
	public CalculMoyenne() {
		valeurs = new double[0];		
	}
	
	public void ajout(double elt) {
		valeurs = Arrays.copyOf(valeurs, valeurs.length+1);
		valeurs[valeurs.length-1] = elt;
	}
	
	public double  moyenne() {
		double moyenne = 0;
		for (int i = 0; i < valeurs.length; i++) {
			moyenne += valeurs[i]/valeurs.length;	
		}
		return moyenne;
	}
	
	public void afficheElements() {
		for (int i = 0; i < valeurs.length; i++) {
			System.out.print(valeurs[i]+"\t");
		}
		System.out.println();
	}
	
	
}
