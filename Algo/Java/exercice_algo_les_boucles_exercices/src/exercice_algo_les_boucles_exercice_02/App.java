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

		userNumber		ENTIER

		--DEBUT PROGRAMME--

		TANT QUE userNumber < 10 || userNumber > 20 FAIRE
			ECRIRE "Saisir un nombre compris entre 10 et 20 : "
			LIRE userNumber
			SI userNumber > 20 ALORS
				ECRIRE "Plus petit !"
			SINON SI userNumber < 10 ALORS
				ECRIRE "Plus grand !"
			ELSE
				ECRIRE "La réponse convient."
			FIN SI
		FIN TANT QUE

		--FIN PROGRAMME--
		*/
		
		/* VARIABLES */

		int userNumber=0;

		/* DEBUT PROGRAMME */
		
		Scanner userInput = new Scanner(System.in);

		while(userNumber < 10 || userNumber > 20){
			System.out.println("Saisir un nombre compris entre 10 et 20 : ");
			userNumber = userInput.nextInt();
			if(userNumber > 20) {
				System.out.println("Plus petit !");
			}else if (userNumber < 10) {
				System.out.println("Plus grand !");
			}else {
				System.out.println("Le nombre convient.");
			}

		}
		userInput.close();
		
		/*FIN PROGRAMME*/
	}

}
