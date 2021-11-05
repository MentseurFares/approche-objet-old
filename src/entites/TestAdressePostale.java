package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		AdressePostale adresse1 = new AdressePostale(45, "Rue du Faubourg Saint Jaumes", 34000, "Montpellier");
		AdressePostale adresse2 = new AdressePostale(64, "Avenue de Castelnau", 34090, "Montpellier");
		System.out.println(adresse1);
		System.out.println(adresse2);
	}
}
