package fr.diginamic.maison;

public class SalleDeBain extends Piece {

	public SalleDeBain(double superficie, int etage) {
		super(superficie, etage);
		
	}

	@Override
	public String getPieceType() {

		return "Salle de bain";
	}

}
