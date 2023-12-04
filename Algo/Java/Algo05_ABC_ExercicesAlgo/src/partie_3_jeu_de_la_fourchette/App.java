package partie_3_jeu_de_la_fourchette;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/* VARIABLES */

		int nombreMystere;
		int max = 100;
		int min = 0;
		int nombreJoueur;
		int nombreEssai = 0;
		
		/* DEBUT PROGRAMME */
		
		Scanner saisie = new Scanner(System.in);

		nombreMystere = min + (int)(Math.random() * ((max - min) + 1));
		
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
		}while(nombreJoueur != nombreMystere);
		
		saisie.close();

		/* FIN PROGRAMME */
		
	}

}
