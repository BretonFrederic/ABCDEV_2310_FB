package exercice_algo_les_boucles_exercice_02;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		EXERCICE 2
		Ecrire un algorithme qui demande un nombre compris entre 10 et 20, jusqu’à ce que la réponse convienne. 
		En cas de réponse supérieure à 20, on fera apparaître un message : « Plus petit ! », et inversement, « Plus 
		grand ! » si le nombre est inférieur à 10.

		--VARIABLES--

		randomNumber		ENTIER
		userNumber		ENTIER
		i			ENTIER
		count			ENTIER
		answer			BOOLEEN

		--DEBUT PROGRAMME--

		answer <-- faux
		randomNumber <-- RANDOM(100)

		FAIRE
			ECRIRE "Saisir un nombre compris entre 10 et 20 : "
			LIRE userNumber
			SI userNumber > 20 ALORS
				ECRIRE "Plus petit !"
			SINON SI userNumber < 10 ALORS
				ECRIRE "Plus grand !"
			ELSE
				ECRIRE "Le nombre convient."
			FIN SI
		TANT QUE answer = faux
		FIN TANT QUE

		--PROGRAMME--
		*/
		
		/* VARIABLES */

		int userNumber;
		boolean answer;

		/* DEBUT PROGRAMME */
		
		answer = false;
		Scanner userInput = new Scanner(System.in);

		do {
			System.out.println("Saisir un nombre compris entre 10 et 20 : ");
			userNumber = userInput.nextInt();
			if(userNumber > 20) {
				System.out.println("Plus petit !");
			}else if (userNumber < 10) {
				System.out.println("Plus grand !");
			}else {
				answer = true;
				System.out.println("Le nombre convient.");
			}

		}while(!answer);
		userInput.close();
		/*FIN PROGRAMME*/
	}

}
