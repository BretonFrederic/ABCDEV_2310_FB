package exercice_algo_les_boucles_exercice_03v2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		--VARIABLES--

		userNumber		ENTIER

		--DEBUT PROGRAMME--

		ECRIRE "Saisir un nombre : "
		LIRE userNumber

		POUR i <-- 0 À 10 FAIRE
			userNumber <-- userNumber + 1
			ECRIRE userNumber
		FIN POUR

		--FIN PROGRAMME--
		*/
		/*VARIABLES*/

		int userNumber;

		/*DEBUT PROGRAMME*/
		
		Scanner userInput = new Scanner(System.in);

		System.out.println("Saisir un nombre : ");
		userNumber = userInput.nextInt();
		
		for(int i = 0; i < 10; i++) {
		userNumber = userNumber + 1;
		System.out.println(userNumber);
		}

		userInput.close();
		/*FIN PROGRAMME*/
	}

}
