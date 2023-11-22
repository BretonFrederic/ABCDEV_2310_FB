package partie_1_diviseursNombre;

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
		System.out.println("Les diviseurs du nombre " + nombre + " sont : ");

		for(diviseur = 2; diviseur < nombre-1; diviseur++) {
			resultat = nombre%diviseur;
			if(resultat == 0) {
				System.out.println(diviseur);
				nombreDeDiviseurs = nombreDeDiviseurs + 1;
			}
		}

		if(nombreDeDiviseurs == 0) {
			System.out.println(" ce nombre n'a pas d'autres diviseurs que 1 est lui-même.");
		}

		/* FIN DE PROGRAMME */
		
	}

}
