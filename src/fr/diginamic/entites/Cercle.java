package fr.diginamic.entites;

public class Cercle {

	private double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	public double caclculPerimetre() {
		return 2 * Math.PI * rayon;
	}

	public double calculSuperficie() {
		return Math.PI * Math.pow(rayon,2);
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	@Override
	public String toString() {
		return "Cercle de rayon : "+this.rayon  + " a un perimetre de : "+this.caclculPerimetre()
				+" et une superficie de : "+ this.calculSuperficie();
	}
}
