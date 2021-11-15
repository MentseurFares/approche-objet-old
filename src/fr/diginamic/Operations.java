package fr.diginamic;

public class Operations {

	public static double calcul(double x, double y, char operateur) {
		double resultat = 0;
		switch (operateur) {
		case '+':
			resultat = x + y;
			break;
		case '-':
			resultat = x - y;
			break;
		case '*':
			resultat = x * y;
			break;
		case '/':
			resultat =x/y;
			if (y == 0) {
				System.out.println("Division Par 0 intedite");
			}
			break;
		case '%':
			if (y == 0) {
				System.out.println("Operation non définie");
			}
			resultat = x % y;
			break;
		default:
			System.out.println("Operateur inconnu");
			break;
		}
		return resultat;
	}

}
