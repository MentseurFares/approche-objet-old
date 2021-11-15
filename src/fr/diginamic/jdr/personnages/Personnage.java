package fr.diginamic.jdr.personnages;

import java.util.Random;

// La classe abstraite Personnage regroupera tous les personnages participants au jeux 
public abstract class Personnage {

	private int force;
	private int pointDeVie;
	private String name;

	public Personnage(int minForce, int maxForce, int minVie, int maxVie, String name) {
		Random random = new Random();
		this.force = minForce + random.nextInt(maxForce - minForce);
		this.pointDeVie = minVie + random.nextInt(maxVie - minVie);
		this.name = name;
	}
	
	public boolean estVivant() {
		if (pointDeVie > 0) {
			return true;
		}
		return false;
	}

	public void afficheInfos() {
		System.out.println(this.toString());
	}
	
	public void subitFrappe(Personnage adversaire, int forceFrappe) {
		System.out.println(adversaire.getName() +" est plus rapide, il inflige une frappe de force " +forceFrappe + " à " +this.getName());
		pointDeVie -= forceFrappe;
		if(pointDeVie < 0) {
			pointDeVie = 0;
		}
		System.out.println("Il reste "+pointDeVie + " points de vie à "+this.getName());
	}

	@Override
	public String toString() {
		return  this.name + " a des caracteristiques : Force = " + this.force + " et Point de vie = "+ this.pointDeVie;
	}

	public int getForce() {
		return force;
	}

	public int getPointDeVie() {
		return pointDeVie;
	}

	public void setPointDeVie(int pointDeVie) {
		this.pointDeVie = pointDeVie;
	}

	public String getName() {
		return name;
	}	
}
