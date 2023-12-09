package exercice_algo_les_boucles_exercice_05;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		EXERCICE 5

		Ecrire un algorithme qui demande un nombre de départ, et qui calcule sa factorielle. 
		NB : la factorielle de 8, notée 8 !, vaut 1 x 2 x 3 x 4 x 5 x 6 x 7 x 8

		--VARIABLES--

		userNumber		ENTIER
		factorial		ENTIER
		i			ENTIER


		--DEBUT PROGRAMME--

		ECRIRE "Saisir un nombre : "
		LIRE userNumber

		factorial <-- 1

		POUR i <-- 2 À userNumber FAIRE
			factorial = factorial * i
		FIN POUR

		ECRIRE "La factorielle de ", userNumber, " est ", factorial

		--FIN PROGRAMME--
		*/
		
		/*VARIABLES*/

		int userNumber;
		int factorial;

		/*DEBUT PROGRAMME*/

		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Saisir un nombre : ");
		userNumber = userInput.nextInt();

		factorial = 1;

		for(int i = 2; i<= userNumber; i++) {
			factorial = factorial * i;
		}

		System.out.printf("La factorielle de %d est : %d",userNumber, factorial);
		userInput.close();
		
		/*FIN PROGRAMME*/
	}

}
