package partie_1_nombrePremier;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		/* VARIABLES */

		int nombre;
		int diviseur;
		int resultat;
		int nombreDeDiviseurs;

		/* DEBUT DE PROGRAMME */

		Scanner saisie = new Scanner(System.in);
		System.out.println("Saisir un nombre entier : ");
		nombre = saisie.nextInt();

		System.out.println("Le nombre ", nombre,");

		Pour (diviseur = 2 à nombre-1) Faire
			resultat <-- nombre % diviseur;
			Si (resultat = 0) Alors
				nombreDeDiviseurs = nombreDeDiviseurs + 1;
			Fin Si
		Fin Pour

		if(nombreDeDiviseurs = 0) {
			System.out.println(" est un nombre premier.");
		}else {
			System.out.println(" n'est pas un nombre premier.");
		}

		/* FIN DE PROGRAMME */
	}
}
