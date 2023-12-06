package exercice_algo_les_boucles_exercice_01;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		EXERCICE 1
		Ecrire un algorithme qui demande à l’utilisateur un nombre compris entre 1 et 3 jusqu’à ce que la réponse 
		convienne.

		--VARIABLES--

		userNumber		ENTIER

		--DEBUT PROGRAMME--

		userNumber <-- 0

		TANT QUE userNumber < 1 OU userNumber > 3 FAIRE
			ECRIRE "Saisir un nombre entre 1 et 3 : "
			ECRIRE userNumber
		FIN TANT QUE

		ECRIRE "Le nombre convient."
		
		--FIN PROGRAMME--
		*/

		int userNumber=0;

		/* DEBUT PROGRAMME */

		Scanner userInput = new Scanner(System.in);

		while(userNumber < 1 || userNumber > 3){
			
			System.out.println("Saisir un nombre entre 1 et 3 : ");
			userNumber = userInput.nextInt();
		}	
		userInput.close();
		System.out.println("Le nombre convient.");
	}

}
