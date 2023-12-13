package algorithme_les_tableaux_exercice_08;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		EXERCICE 8

		Ecrivez un algorithme permettant, toujours sur le même principe, à l’utilisateur de saisir un nombre 
		déterminé de valeurs. Le programme, une fois la saisie terminée, renvoie la plus grande valeur en précisant 
		quelle position elle occupe dans le tableau. On prendra soin d’effectuer la saisie dans un premier temps, et 
		la recherche de la plus grande valeur du tableau dans un second temps.
		
		--VARIABLES--
		
		array[]			ENTIER
		arraySize		ENTIER
		userNumber		ENTIER
		greaterNumber	ENTIER
		position		ENTIER
		
		--DEBUT PROGRAMME--
		
		ECRIRE "Combien de nombres voulez vous saisir ? : "
		LIRE arraySize
		
		POUR i <-- 0 À LONGUEUR(array)-1 FAIRE
			ECRIRE "Saisir une valeur : "
			LIRE userNumber
			array[i] <-- userNumber
		FIN POUR
		
		POUR i <-- 0 À LONGUEUR(array)-1 FAIRE
			SI array[i] > greaterNumber ALORS
				greaterNumber <-- array[i]
				position <-- i + 1
			FIN 
		FIN POUR
		
		ECRIRE "Dans le tableau de valeurs suivant : "
		
		POUR i <-- 0 À LONGUEUR(array)-1 FAIRE
			ECRIRE array[i], " "
		FIN POUR
		
		ECRIRE "La plus grande valeur est : ", greaterNumber, ". Elle se trouve en position : ", position
		
		--FIN PROGRAMME--
		*/
		
		/*VARIABLES*/

		int array[];
		int arraySize, userNumber, greaterNumber = 0, position = 0;
		
		/*DEBUT PROGRAMME*/

		Scanner userInput = new Scanner(System.in);
		
		// initialisation de la taille du tableau par l'utilisateur 
		System.out.println("Combien de nombres voulez vous saisir ? : ");
		arraySize = userInput.nextInt();
		array = new int[arraySize];

		// choix des valeurs du tableau par utilisateur
		for (int i = 0; i <= array.length-1; i++) {
		System.out.print("Saisir une valeur : ");
			userNumber = userInput.nextInt();		
			array[i] = userNumber;
		}
		
		// on recherche le nombre le plus grand et on conserve sa valeur 
		// et sa position dans le tableau
		for (int i = 0; i <= array.length-1; i++) {
			if(array[i] > greaterNumber) {
				greaterNumber = array[i];
				position = i + 1;
			}
		}

		// on affiche les valeurs du tableau.
		// puis on affiche la valeur la plus grande et sa position
		System.out.println("Dans le tableau de valeurs suivant : ");
		for(int i = 0; i <= array.length-1; i++) {
		System.out.println(array[i] + " ");
		}
		
		System.out.println("La plus grande valeur est : " + greaterNumber + ". Elle se trouve en position : " + position);

		userInput.close();
		
		/*FIN PROGRAMME*/
	}

}
