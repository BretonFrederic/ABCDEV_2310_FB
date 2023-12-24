package fonctions_et_les_procedures_partie_2_Exercice_4;

import java.util.Scanner;

public class App {
	/*
	EXERCICE 4 LA VENGENCE DE LA FOURCHETTE
	
	Améliorer le jeu de la fourchette en permettant à l’ordinateur de jouer contre le joueur humain.
	Le nombre choisi par l’ordinateur à chaque essai sera générer aléatoirement grâce à une fonction qui générera également le nombre à trouver.
	Le premier qui trouve le nombre à gagner la partie.
	Pour compliquer le jeu vous pouvez déterminer un nombre d’essais maximum.
	A la fin de la partie vous demanderez à l’utilisateur si il veux rejouer ou quitter la partie.
	
	ENTIER FONCTION randomNumber()

		number	ENTIER
	
		number <-- ALEATOIRE(0,100)

		RETOURNE number
	FIN FONCTION
	 */
	
	public static int randomNumber(int min, int max) {

		int number;
	
		number = min + (int)(Math.random() * ((max - min) + 1));

		return number;
	}
	public static void main(String[] args) {
		
		/* VARIABLES */

		int nombreMystere;
		int max = 100;
		int min = 0;
		int nombreJoueur;
		int nombrePC;
		int nombreEssai = 0;
		
		/* DEBUT PROGRAMME */
		
		Scanner saisie = new Scanner(System.in);

		nombreMystere = randomNumber(min, max);
		
		System.out.println("Saisir un nombre entier entre 0 et 100 : ");

		do {
			nombreJoueur = saisie.nextInt();
			nombreEssai++;
			if(nombreJoueur == nombreMystere) {
					System.out.println("Bravo, vous avez trouvez le nombre mystère en " + nombreEssai + " essai(s).");
				}else if(nombreJoueur < nombreMystere) {
					min = nombreJoueur;
					System.out.println("C'est plus ! ");
					System.out.println("Le nombre mystère est compris entre " + min + " est " + max);
				}else if(nombreJoueur > nombreMystere) {
					max = nombreJoueur;
					System.out.println("C'est moins ! ");
					System.out.println("Le nombre mystère est compris entre " + min + " est " + max);
			}
			
			nombrePC = randomNumber( min, max);
			System.out.printf("L'ordinateur a choisi le nombre :\n %d \n", nombrePC);
			if(nombrePC == nombreMystere) {
					System.out.println("Perdu, l'ordinateur a trouvez le nombre mystère en " + nombreEssai + " essai(s).");
				}else if(nombrePC < nombreMystere) {
					min = nombrePC;
					System.out.println("C'est plus ! ");
					System.out.println("Le nombre mystère est compris entre " + min + " est " + max);
				}else if(nombrePC > nombreMystere) {
					max = nombrePC;
					System.out.println("C'est moins ! ");
					System.out.println("Le nombre mystère est compris entre " + min + " est " + max);
			}
			
		}while(nombreJoueur != nombreMystere && nombrePC != nombreMystere);
		
		saisie.close();
	}

}
