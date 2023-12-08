package exercice_algo_les_boucles_exercice_04;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		EXERCICE 4

		Ecrire un algorithme qui demande un nombre de départ, et qui calcule la somme des entiers jusqu’à ce 
		nombre. Par exemple, si l’on entre 5, le programme doit calculer : 1 + 2 + 3 + 4 + 5 = 15 
		NB : on souhaite afficher uniquement le résultat, pas la décomposition du calcul.


		--VARIABLES--

		userNumber		ENTIER
		result			ENTIER
		i			ENTIER

		--DEBUT PROGRAMME--

		ECRIRE "Saisir un nombre entier : "
		LIRE userNumber

		POUR i <-- 1 À userNumber FAIRE
			result <-- result + 1
		FIN POUR

		ECRIRE "La somme des entiers jusqu'à ce nombre est : ", result

		--FIN PROGRAMME--
		*/
		
		/* VARIABLES */

		int userNumber;
		int result = 0;

		/* DEBUT PROGRAMME */

		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Saisir un nombre entier : ");
		userNumber = userInput.nextInt();
		
		for(int i = 0; i < userNumber; i++) {
			result = result + 1;
		}

		System.out.println("La somme des entiers jusqu'à ce nombre est : " + result);
		
		userInput.close();

		/* FIN PROGRAMME */
	}

}
