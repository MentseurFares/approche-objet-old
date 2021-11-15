package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {

	private Piece[] pieces;

	public void ajouterPiece(Piece piece) {
		if (pieces == null) {
			pieces = new Piece[0];
		}
		if (piece != null) {
			pieces = Arrays.copyOf(pieces, pieces.length + 1);
			pieces[pieces.length - 1] = piece;
		}
	}

	public double getSuperficieTotale() {
		double superficie = 0;
		for (int i = 0; i < pieces.length; i++) {
			superficie += pieces[i].getSuperficie();
		}

		return superficie;

	}

	public double getEtageSuperficie(int etage) {
		double superficie = 0;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getEtage() == etage) {
				superficie += pieces[i].getSuperficie();
			}
		}
		return superficie;
	}

	public <T> int getNbPiecesParType(Class<T> type) {
		int nb = 0;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getClass().equals(type)) {
				nb++;
			}
		}
		return nb;
	}

	public <T> double getSuperficieParType(Class<T> type) {
		double superficie = 0;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getClass().equals(type)) {
				superficie += pieces[i].getSuperficie();
			}
		}
		return superficie;
	}

	public int getNbPiecesParType(String type) {
		int nb = 0;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getPieceType().equalsIgnoreCase(type)) {
				nb++;
			}
		}
		return nb;
	}

	public double getSuperficieParType(String type) {
		double superficie = 0;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getPieceType().equalsIgnoreCase(type)) {
				superficie += pieces[i].getSuperficie();
			}
		}
		return superficie;
	}

}
