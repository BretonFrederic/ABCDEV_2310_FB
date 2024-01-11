package exercice_bouteille;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/* VARIABLES */
		String nom = "Evian";
		double capacite = 2.0;
		double contenance = 1.2;
		boolean ouverte = false;
		double quantite;
		int action;
		String quitter="y";
		
		/* DEBUT PROGRAMME */
		Scanner saisie = new Scanner(System.in);
		
		Bouteille vittel = new Bouteille();
		
		Bouteille evian = new Bouteille(nom, capacite, contenance, ouverte);
		System.out.print("La bouteille contient : " + contenance + " Litres\n");
		while(!quitter.equals("q")) {
			System.out.print("Saisir une action : "
					+ "\n\t1 fermer"
					+ "\n\t2 ouvrir"
					+ "\n\t3 vider"
					+ "\n\t4 vider tout"
					+ "\n\t5 remplir"
					+ "\n\t6 remplir tout\n");
			action = saisie.nextInt();
			switch(action) {
				case 1:
					boolean testFermer = evian.fermer();
					break;
				case 2:
					boolean testOuvrir = evian.ouvrir();
					break;
				case 3:
					System.out.print("Saisir une quantité à vider : ");
					quantite = saisie.nextDouble();
					boolean testVider = evian.vider(quantite);
					break;
				case 4:
					boolean testViderTout = evian.viderTout();
					break;
				case 5:
					System.out.print("Saisir une quantité à remplir : ");
					quantite = saisie.nextDouble();
					boolean testRemplir = evian.remplir(quantite);
					break;
				case 6:
					boolean testRemplirTout = evian.remplirTout();
					break;
				default:
					System.out.print("Vous devez choisir entre 1 et 6");
					break;
			}
			System.out.print("Saisir q pour quitter ou n'importe quelle autre touche pour continuer : ");
			quitter = saisie.next();
		}
		saisie.close();
		/* FIN PROGRAMME */

	}
	
}
