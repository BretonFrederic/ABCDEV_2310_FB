package exercice_algo_les_boucles_exercice_03;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		--VARIABLES--

		userNumber		ENTIER
		goal			ENTIER

		--DEBUT PROGRAMME--

		ECRIRE "Saisir un nombre : "
		LIRE userNumber
		goal <-- userNumber+10

		TANT QUE userNumber != goal FAIRE
			userNumber <-- userNumber + 1
			ECRIRE userNumber
		FIN TANT QUE

		--FIN PROGRAMME--
		*/
		
		/*VARIABLES*/

		int userNumber;
		int goal;

		/*DEBUT PROGRAMME*/
		
		Scanner userInput = new Scanner(System.in);

		System.out.println("Saisir un nombre : ");
		userNumber = userInput.nextInt();
		goal = userNumber+10;
		while(userNumber != goal) {
			userNumber = userNumber + 1;
			System.out.println(userNumber);
		}

		userInput.close();
		/*FIN PROGRAMME*/
		
	}

}
