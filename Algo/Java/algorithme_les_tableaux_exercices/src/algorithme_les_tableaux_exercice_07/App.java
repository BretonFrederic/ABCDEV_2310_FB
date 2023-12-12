package algorithme_les_tableaux_exercice_07;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		EXERCICE 7

		Ecrivez un algorithme qui permet la saisie d’un nombre quelconque de valeurs, sur le principe de l’exercice 
		3. Toutes les valeurs doivent être ensuite augmentées de 1, et le nouveau tableau sera affiché à l’écran.

		--VARIABLES--

		sizeArray		ENTIER
		userNumber		ENTIER
		sum[]			ENTIER

		--DEBUT PROGRAMME--

		ECRIRE "Combien de valeurs souhaitez vous saisir ? : "
		LIRE sizeArray

		sum[sizeArray]

		ECRIRE "Vous devez saisir ", sizeArray, " valeurs."

		POUR i <-- 0 À sizeArray FAIRE
			ECRIRE "Saisir une valeur : "
			LIRE userNumber
			sum[i] <-- userNumber + 1
		FIN POUR

		ECRIRE "Le nouveau tableau des valeurs augmentées de +1 est : "

		POUR i <-- 0 À LONGUEUR(sum)-1 FAIRE
			ECRIRE sum[i], " "
		FIN POUR

		--FIN PROGRAMME--
		*/

		/*VARIABLES*/

		int sizeArray;
		int userNumber;
		int sum[];

		/*DEBUT PROGRAMME*/

		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Combien de valeurs souhaitez vous saisir ? : ");
		sizeArray = userInput.nextInt();;

		sum = new int[sizeArray];

		System.out.println("Vous devez saisir " + sizeArray + " valeurs.");

		for(int i = 0; i < sizeArray; i++) {
			System.out.print("Saisir une valeur : ");
			userNumber = userInput.nextInt();
			sum[i] = userNumber + 1;
		}

		System.out.print("Le nouveau tableau des valeurs augmentées de +1 est : ");

		for(int i = 0; i <= sum.length-1; i++) {
			System.out.print(sum[i] + " ");
		}

		userInput.close();
		
		/*FIN PROGRAMME*/
	}

}
