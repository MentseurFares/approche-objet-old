package fr.diginamic.jdr;

import java.util.Scanner;

import fr.diginamic.jdr.personnages.Creature;
import fr.diginamic.jdr.personnages.Gobelin;
import fr.diginamic.jdr.personnages.Joueur;
import fr.diginamic.jdr.personnages.Loup;
import fr.diginamic.jdr.personnages.Troll;

public class JeuxCombat {

	private static final int MIN_BONUS_FORCE = 1;
	private static final int MAX_BONUS_FORCE = 10;
	private Joueur joueur;
	private Creature creature;
	private Scanner scanner = new Scanner(System.in);

	private boolean createCreature() {
		if (joueur == null || !joueur.estVivant()) {
			System.err.println("Vous devez creer un nouveau personnage avant de combattre ");
			return false;
		}
		int choix = 0;
		do {
			System.out.println("Choisir votre adversaire : " 
								+ "\n1 - Loup " 
								+ "\n2 - Gobelin " 
								+ "\n3 - Troll");
			choix = scanner.nextInt();
			switch (choix) {
			case 1:
				creature = new Loup();
				break;
			case 2:
				creature = new Gobelin();
				break;
			case 3:
				creature = new Troll();
				break;
			default:
				System.err.println("Choix erroné");
				break;
			}
		} while (choix < 1 || choix > 3);
		creature.afficheInfos();
		return true;
	}

	private void combattre() {
		System.out.println("Debut de combat");
		int round = 0;
		do {
			System.out.println("Round : " + (++round));
			int forceJoueur = (int) (joueur.getForce() + MIN_BONUS_FORCE
					+ (MAX_BONUS_FORCE - MIN_BONUS_FORCE) * Math.random());
			int forceCreature = (int) (creature.getForce() + MIN_BONUS_FORCE
					+ (MAX_BONUS_FORCE - MIN_BONUS_FORCE) * Math.random());
			if (forceJoueur >= forceCreature) {
				creature.subitFrappe(joueur, forceCreature);
			} else {
				joueur.subitFrappe(creature, forceJoueur);
				
			}

		} while (joueur.estVivant() && creature.estVivant());
		if (joueur.estVivant()) {
			joueur.augmenteScore(creature.getRecompense());
		}
	}

	private int afficheMenu() {
		System.out.println("Choisissez une option : " 
							+ "\n1 - Créer un personnage de combat"
							+ "\n2 - Combattre une créature" 
							+ "\n3 - Afficher score" 
							+ "\n4 - Quitter le jeux");
		int choix = scanner.nextInt();
		return choix;
	}

	public void start() {
		boolean isFinished = false;
		do {
			int choix = afficheMenu();
			switch (choix) {
			case 1:
				createPersonnage();
				break;
			case 2:
				boolean isCreated = createCreature();
				if (isCreated) {
					combattre();
				}
				break;
			case 3:
				afficherScore();
				break;
			case 4:
				isFinished = true;
				break;
			default:
				System.err.println("Mauvais choix !!!");
				break;
			}
			if (joueur != null && !joueur.estVivant()) {
				isFinished = true;
			}
		} while (!isFinished);
		
		System.out.println("Partie Termine !");
		afficherScore();
	}

	private void afficherScore() {
		if (joueur != null) {
			System.out.println("Votre score est de : " + joueur.getScore());
		} else {
			System.err.println("La partie n'a pas encore commencé, il faut creer un personnage");
		}

	}

	private void createPersonnage() {
		System.out.println("Donner un nom à votre personnage : ");
		String name = scanner.next();
		joueur = new Joueur(name);
		joueur.afficheInfos();
	}

}
