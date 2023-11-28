package partie_3_jeu_de_la_fourchette;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/* VARIABLES */

		int nombreMystere;
		
		int nombreJoueur;
		int nombreEssai = 0;
		
		/* DEBUT PROGRAMME */
		
		Scanner saisie = new Scanner(System.in);

		nombreMystere = (int)Math.round(Math.random()*100);
		//System.out.println("Saisir un nombre entier entre 0 et 100 : ");

		do {
			System.out.println("Saisir un nombre entier entre 0 et 100 : ");
			nombreJoueur = saisie.nextInt();
			nombreEssai++;
			if(nombreJoueur == nombreMystere) {
					System.out.println("Bravo, vous avez trouvez le nombre mystère en " + nombreEssai + " essai(s).");
				}else if(nombreJoueur < nombreMystere) {
					System.out.println("Le nombre mystère est compris entre " + nombreJoueur + " est " + 100);
				}else if(nombreJoueur > nombreMystere) {
					System.out.println("Le nombre mystère est compris entre " + 0 + " est " + nombreJoueur);
			}
		}while(nombreJoueur != nombreMystere);
		
		saisie.close();

		/* FIN PROGRAMME */
		
	}

}
