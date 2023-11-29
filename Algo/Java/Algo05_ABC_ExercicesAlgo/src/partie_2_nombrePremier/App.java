package partie_2_nombrePremier;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		/* VARIABLES */

		int nombre;
		int diviseur;
		int resultat;
		int nombreDeDiviseurs = 0;

		/* DEBUT DE PROGRAMME */

		Scanner saisie = new Scanner(System.in);
		System.out.println("Saisir un nombre entier : ");
		nombre = saisie.nextInt();
		saisie.close();
		System.out.printf("Le nombre " + nombre);

		for(diviseur = 2; diviseur < nombre-1; diviseur++) {
			resultat = nombre%diviseur;
			if(resultat == 0) {
				nombreDeDiviseurs = nombreDeDiviseurs + 1;
			}
		}

		if(nombreDeDiviseurs == 0) {
			System.out.println(" est un nombre premier.");
		}else {
			System.out.println(" n'est pas un nombre premier.");
		}

		/* FIN DE PROGRAMME */
	}
}
