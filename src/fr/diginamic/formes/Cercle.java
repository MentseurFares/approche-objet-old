package fr.diginamic.formes;

public class Cercle extends Forme {

	private double rayon;
	@Override
	
	public double calculerSurface() {
		
		return Math.PI * Math.pow(rayon, 2) ;
	}

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double calculerPerimetre() {
		return 2 * Math.PI * rayon;
	}

}
