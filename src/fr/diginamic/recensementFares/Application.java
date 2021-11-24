package fr.diginamic.recensementFares;

import java.util.Scanner;

import fr.diginamic.recensementFares.services.AffichageVillePeupleeDepartement;
import fr.diginamic.recensementFares.services.AffichagerDepartementPeuplee;
import fr.diginamic.recensementFares.services.AffichagerRegionPeuplee;
import fr.diginamic.recensementFares.services.AffichagerVillePeupleeFrance;
import fr.diginamic.recensementFares.services.AffichagerVillePeupleeRegion;
import fr.diginamic.recensementFares.services.RecherchePopulationDepartement;
import fr.diginamic.recensementFares.services.RecherchePopulationRegion;
import fr.diginamic.recensementFares.services.RecherchePopulationVille;

public class Application {
	private Scanner scanner;
	private Recensement recensement ;
	
	public Application() {
		scanner = new Scanner(System.in); 
		recensement = new Recensement();
	}

	private void start() {
		
		boolean isFinished = false;
		MenuService recherche = null;
		do {

			int choix = afficherMenu();
			switch (choix) {
			case 1:
				recherche = new RecherchePopulationVille();
				recherche.traiter(recensement, scanner);
				break;
			case 2:
				recherche = new RecherchePopulationDepartement();
				recherche.traiter(recensement, scanner);
				break;
			case 3:
				recherche = new RecherchePopulationRegion();
				recherche.traiter(recensement, scanner);
				break;

			case 4:
				recherche = new AffichagerRegionPeuplee();
				recherche.traiter(recensement, scanner);
				break;

			case 5:
				recherche = new AffichagerDepartementPeuplee();
				recherche.traiter(recensement, scanner);
				break;
			case 6:
				recherche = new AffichageVillePeupleeDepartement();
				recherche.traiter(recensement, scanner);
				break;
			case 7:
				recherche = new AffichagerVillePeupleeRegion();
				recherche.traiter(recensement, scanner);
				break;
			case 8:
				recherche = new AffichagerVillePeupleeFrance();
				recherche.traiter(recensement, scanner);
				break;
			case 9:
				isFinished = true;
				System.out.println("Merci");
				break;
			default:
				System.err.println("Mauvais choix : Entrer un nombre entre 1 et 9");
			}
		} while (!isFinished);

	}

	private int afficherMenu() {
		System.out.println("- 1. Population d’une ville donnée" 
				+ "- 2. Population d’un département donné"
				+ "- 3. Population d’une région donnée" + "- 4. Afficher les 10 régions les plus peuplées"
				+ "- 5. Afficher les 10 départements les plus peuplés"
				+ "- 6. Afficher les 10 villes les plus peuplées d’un département"
				+ "- 7. Afficher les 10 villes les plus peuplées d’une région"
				+ "- 8. Afficher les 10 villes les plus peuplées de France" + "- 9. Sortir");
		return scanner.nextInt();
	}

	public static void main(String[] args) {
		Application application = new Application();
		application.start();
	}
}
