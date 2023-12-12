package algorithme_les_tableaux_exercice_05;

public class App {

	public static void main(String[] args) {
		/*
		 EXERCICE 5

		Ecrivez un algorithme constituant un tableau, à partir de deux tableaux de même longueur 
		préalablement saisis. Le nouveau tableau sera la somme des éléments des deux tableaux de départ.
		Tableau 1 :
		4 8 7 9 1 5 4 6
		Tableau 2 :
		7 6 5 2 1 3 7 4
		Tableau à constituer :
		11 14 12 11 2 8 11 1
		
		--VARIABLES--
		
		array1[]		ENTIER
		array2[]		ENTIER
		sum[]			ENTIER
		
		--DEBUT PROGRAMME--
		
		array1[8] <-- {4, 8, 7, 9, 1, 5, 4, 6}
		array2[8] <-- {7, 6, 5, 2, 1, 3, 7, 4}
		sum[8]
		
		ECRIRE "Voici la somme des éléments des deux tableaux de départ par position respective : "
		
		POUR i <-- 0 À LONGUEUR(sum)-1 FAIRE
			sum[i] = array1[i] + array2[i]
			ECRIRE array1[i] + " + " + array2[i] + " = " + sum[i]
		FIN POUR
		
		--FIN PROGRAMME--
		 */
		

		/*VARIABLES*/

		int array1[];
		int array2[];
		int sum[];

		/*DEBUT PROGRAMME*/

		array1 = new int[]{4, 8, 7, 9, 1, 5, 4, 6};
		array2 = new int[]{7, 6, 5, 2, 1, 3, 7, 4};
		sum = new int[8];

		System.out.println("Voici la somme des éléments des deux tableaux de départ affectée\ndans un troisième tableau par position respective : ");
		System.out.println("tab1|tab2 | tab3\n");
		for(int i = 0; i <= sum.length-1; i++) {
			sum[i] = array1[i] + array2[i];
			System.out.println(" " + array1[i] + "  +  " + array2[i] + "  =  " + sum[i]);
		}

		/*FIN PROGRAMME*/
	}

}
