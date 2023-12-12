package algorithme_les_tableaux_exercice_06;

public class App {

	public static void main(String[] args) {
		/*
		EXERCICE 6

		Toujours à partir de deux tableaux précédemment saisis, écrivez un algorithme qui calcule la somme 
		des produits des deux tableaux. Pour calculer le résultat, il faut multiplier chaque élément du tableau 1 par 
		chaque élément du tableau 2, et additionner le tout. Par exemple si l'on a :
		Tableau 1 :
		4 8 7 12
		Tableau 2 :
		3 6
		Le résultat sera :
		3 * 4 + 3 * 8 + 3 * 7 + 3 * 12 + 6 * 4 + 6 * 8 + 6 * 7 + 6 * 12 = 279

		Tableaux de l'exercice 5 :
		Tableau 1 :
				4 8 7 9 1 5 4 6
		Tableau 2 :
				7 6 5 2 1 3 7 4
				
		--VARIABLES--

		array1[]		ENTIER
		array2[]		ENTIER
		result			ENTIER
		temp			ENTIER

		--DEBUT PROGRAMME--

		array1 <-- {4, 8, 7, 9, 1, 5, 4, 6}
		array2 <-- {7, 6, 5, 2, 1, 3, 7, 4}
		temp <-- 0
		result <-- 0

		ECRIRE "La somme des produits du tableau 1 : "

		POUR i À LONGUEUR(array1)-1 FAIRE
			ECRIRE array1[i], " "
		FIN POUR

		ECRIRE " et du tableau 2 : "

		POUR i À LONGUEUR(array1)-1 FAIRE
			ECRIRE array1[i], " "
		FIN POUR

		POUR i À LONGUEUR(array1)-1 FAIRE
			POUR j À LONGUEUR(array2)-1 FAIRE
				temp <-- array1[i]*array2[j]
				result <-- temp
				temp <-- 0
			FIN POUR
		FIN POUR

		ECRIRE " est : ", result

		--FIN PROGRAMME--
		*/
				
		/*VARIABLES*/

		int array1[];
		int array2[];
		int result;
		int temp;

		/*DEBUT PROGRAMME*/

		array1 = new int[]{4, 8, 7, 9, 1, 5, 4, 6};
		array2 = new int[]{7, 6, 5, 2, 1, 3, 7, 4};
		temp = 0;
		result = 0;

		System.out.print("La somme des produits du tableau 1 : ");

		for(int i = 0; i <= array1.length-1; i++) {
			System.out.print(array1[i] + " ");
		}

		System.out.print("\n\t\t   et du tableau 2 : ");

		for(int i = 0; i <= array2.length-1; i++) {
			System.out.print(array2[i] + " ");
		}

		for (int i = 0; i <= array1.length-1; i++) {
			for(int j = 0;j <= array2.length-1; j++) {
				temp = array1[i]*array2[j];
				result = result + temp;
				temp = 0;
			}
		}

		System.out.println("\nest : " + result);

		/*FIN PROGRAMME*/
	}

}
