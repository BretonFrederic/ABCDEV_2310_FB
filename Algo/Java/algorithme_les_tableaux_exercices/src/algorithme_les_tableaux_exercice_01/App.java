package algorithme_les_tableaux_exercice_01;

public class App {

	public static void main(String[] args) {
		/*
		EXERCICE 1

		Ecrire un algorithme qui déclare et remplit un tableau de 7 valeurs numériques en les mettant toutes à 
		zéro.


		--VARIABLES--

		array[6]	ENTIER

		--DEBUT PROGRAMME--

		ECRIRE "Valeurs du tableau avant initialisation à 0 : "
		
		POUR i <-- 0 À LONGUEUR(array)-1 FAIRE
			array[i] <-- 0
			ECRIRE " | valeur " , (i+1) , " : " , array[i]
		FIN POUR

		ECRIRE "Valeurs du tableau après initialisation à 0 : "
		
		POUR i <-- 0 À LONGUEUR(array)-1 FAIRE
			array[i] <-- 0
			ECRIRE " | valeur " , (i+1) , " : " , array[i]
		FIN POUR

		--FIN PROGRAMME--
		*/

		/*VARIABLES*/

		int array[] = new int[] {5,2,9,3,7,12,4};

		/*DEBUT PROGRAMME*/
		
		System.out.println("Valeurs du tableau avant initialisation à 0 : ");
		for(int i = 0; i <= array.length-1; i++) {
			System.out.print(" | valeur " + (i+1) + " : " + array[i]);
		}

		System.out.println("\n\nValeurs du tableau après initialisation à 0 : ");
		for(int i = 0; i <= array.length-1; i++) {
			array[i] = 0;
			System.out.print(" | valeur " + (i+1) + " : " + array[i]);
		}
	
		/*FIN PROGRAMME*/
	}

}
