package entites;

public class AdressePostale {

	private int numRue;
	private String libelleRue;
	private int codePostale;
	private String ville;

	public AdressePostale(int numRue, String libelleRue, int codePostale, String ville) {
		this.numRue = numRue;
		this.libelleRue = libelleRue;
		this.codePostale = codePostale;
		this.ville = ville;
	}

	public int getNumRue() {
		return numRue;
	}

	public void setNumRue(int numRue) {
		this.numRue = numRue;
	}

	public String getLibelleRue() {
		return libelleRue;
	}

	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
	}

	public int getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Votre Adresse :\n\t" + numRue + " " + libelleRue + ", " + codePostale + " " + ville;
	}

}
