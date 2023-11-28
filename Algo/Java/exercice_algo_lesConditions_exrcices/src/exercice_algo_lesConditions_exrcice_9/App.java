package exercice_algo_lesConditions_exrcice_9;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/* VARIABLES */

		int jour;
		int mois;

		
		int annee = 0;
		int mois31Jours;
		double anneeMod4;
		double anneeMod100;
		double anneeMod400;
		boolean bissextile = false;

		/* DEBUT PROGRAMME */

		Scanner saisie = new Scanner(System.in);

		System.out.println("Saisir un numéro de jour : ");
		jour = saisie.nextInt();
		System.out.println("Saisir un numéro de mois : ");
		mois  = saisie.nextInt();
		System.out.println("Saisir un numéro d'année : ");
		annee = saisie.nextInt();
		
		saisie.close();
		
		anneeMod4 = annee%4;
		anneeMod100 = annee%100;
		anneeMod400 = annee%400;

		if(anneeMod4 > 0) {
			bissextile = false;
		}

		if(anneeMod4 == 0) {
			if(anneeMod100 == 0 && anneeMod400 > 0) {
				bissextile = false;
		}else {
			bissextile = true;
			}
		}
		
		System.out.println("bissextile : " + bissextile);

		if(jour > 0 && jour < 32) {
			if(mois > 0 && mois < 13) {
				if(jour == 31) {
					for(mois31Jours = 1; mois31Jours <= 7; mois31Jours += 2) {
						if(mois31Jours == mois) {
							System.out.println("Date valide.");
						}
					}
					for(mois31Jours = 8; mois31Jours <= 12; mois31Jours += 2) {
						if(mois31Jours == mois) {
							System.out.println("Date valide.");
						}
					}

				}else if(mois == 2) {
					if(jour > 29) {
						System.out.println("Date invalide.");
					}else if(jour == 29 && bissextile == true || jour == 28 && bissextile == false) {
						System.out.println("Date valide.");
					}else {
						System.out.println("Date invalide.");
					}
				}
				
			}else {
				System.out.println("Date invalide.");
			}
		}else {
			System.out.println("Date invalide.");
		}

		/* FIN PROGRAMME */
		
	}

}
