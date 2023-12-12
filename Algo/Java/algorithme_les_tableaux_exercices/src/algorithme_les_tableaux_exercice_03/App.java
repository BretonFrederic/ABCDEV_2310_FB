package algorithme_les_tableaux_exercice_03;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 EXERCICE 3

		Ecrivez un algorithme permettant à l’utilisateur de saisir un nombre quelconque de valeurs, qui devront 
		être stockées dans un tableau. L’utilisateur doit donc commencer par entrer le nombre de valeurs qu’il 
		compte saisir. Il effectuera ensuite cette saisie. Enfin, une fois la saisie terminée, le programme affichera le 
		nombre de valeurs négatives et le nombre de valeurs positives.
		
		--VARIABLES--
		
		sizeArray		ENTIER
		userNumber		ENTIER
		array[]			ENTIER
		nbIsNegative	ENTIER
		nbIsPositive	ENTIER
		
		--DEBUT PROGRAMME--
		
		ECRIRE "Combien de valeurs souhaitez vous saisir ? : "
		LIRE sizeArray
		
		array[sizeArray]
		
		ECRIRE "Vous devez saisir ", sizeArray, " valeurs."
		
		POUR i <-- 0 À LONGUEUR(array)-1 FAIRE
			ECRIRE "Saisir une valeur : "
			LIRE userNumber
			SI userNumber < 0 ALORS
				nbIsNegative <-- nbIsNegative + 1
			SINON SI userNumber > 0 ALORS
				nbIsPositive <-- nbIsPositive + 1
			FIN SI
		FIN POUR
		
		ECRIRE "Il y a ", nbIsNegative, " valeur(s) négative(s)."
		ECRIRE "Il y a ", nbIsPositive, " valeur(s) positive(s)."
		
		--FIN PROGRAMME--
		 */
		
		/*VARIABLES*/
		
		int sizeArray;
		int userNumber;
		int array[];
		int nbIsNegative = 0;
		int nbIsPositive = 0;
		
		/*DEBUT PROGRAMME*/
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Combien de valeurs souhaitez vous saisir ? : ");
		sizeArray = userInput.nextInt();
		
		array = new int[sizeArray];
		
		System.out.println("Vous devez saisir " + sizeArray + " valeurs.");
		
		for(int i = 0; i <= array.length-1; i++) {
			System.out.println("Saisir une valeur : ");
			userNumber = userInput.nextInt();
			if(userNumber < 0) {
				nbIsNegative = nbIsNegative + 1;
			}else if(userNumber > 0) {
				nbIsPositive = nbIsPositive + 1;
			}
		}
		
		System.out.println("Il y a " + nbIsNegative + " valeur(s) négative(s).");
		System.out.println("Il y a " + nbIsPositive + " valeur(s) positive(s).");
		
		userInput.close();
		
		/*FIN PROGRAMME*/
	}

}
