package algorithme_les_tableaux_exercice_04;

public class App {

	public static void main(String[] args) {
		/*
		EXERCICE 4

		Ecrivez un algorithme calculant la somme des valeurs d’un tableau (on suppose que le tableau a été 
		préalablement saisi).

		--VARIABLES--

		array[5]	ENTIER
		sum			ENTIER

		--DEBUT PROGRAMME--

		array[5] <-- {5, 2, 9, 3, 4}

		ECRIRE "La somme de "
		POUR i <-- 0 À LONGUEUR(array)-1 FAIRE
			sum <-- sum + array[i]
			SI i < LONGUEUR(array)-1 ALORS
				ECRIRE array[i], " + "
			SINON
				ECRIRE array[i], " = "
			FIN SI
		FIN POUR

		ECRIRE sum

		--FIN PROGRAMME--
		*/
		
		/*VARIABLES*/

		int array[];
		int sum = 0;

		/*DEBUT PROGRAMME*/

		array = new int[]{5, 2, 9, 3, 4};

		System.out.print("La somme de ");
		for (int i = 0; i <= array.length-1; i++){
			sum = sum + array[i];
			if(i < array.length-1) {
				System.out.print(array[i] + " + ");
			}else {
				System.out.print(array[i] + " = ");
			}
		}

		System.out.print(sum);

		/*FIN PROGRAMME*/
	}

}
