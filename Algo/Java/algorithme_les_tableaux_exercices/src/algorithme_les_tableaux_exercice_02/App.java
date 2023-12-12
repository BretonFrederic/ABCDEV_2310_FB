package algorithme_les_tableaux_exercice_02;

public class App {

	public static void main(String[] args) {
		/*
		 EXERCICE 2

		System.out.printlnun algorithme qui déclare et remplit un tableau contenant les six voyelles de l’alphabet latin.

		--VARIBLES--

		array[6]	CHAINE
		voyelle_A	CHAINE
		voyelle_E	CHAINE
		voyelle_I	CHAINE
		voyelle_O	CHAINE
		voyelle_U	CHAINE
		voyelle_Y	CHAINE
		i			ENTIER
		position	ENTIER

		--DEBUT PROGRAMME--

		position <-- 1

		System.out.println"Tableau avant affectation des six voyelles de l'alphabet latin."
		for i <-- 0 À LONGUEUR(array)-1 {
			array[i] <-- none
			position <-- position + 1
			System.out.println"Valeur ", position, " : ", array[i]
		FIN for
		
		array[0] <-- voyelle_A
		array[1] <-- voyelle_E
		array[2] <-- voyelle_I
		array[3] <-- voyelle_O
		array[4] <-- voyelle_U
		array[5] <-- voyelle_Y
		
		position <-- 1
		
		System.out.println"Tableau après affectation des six voyelles de l'alphabet latin."
		for i <-- 0 À LONGUEUR(array)-1 {
			position <-- position + 1
			System.out.println"Valeur ", position, " : ", array[i]
		FIN for
		
		
		--FIN PROGRAMME--
		 */
		
		/*VARIBLES*/

		String array[] = new String[6];
		String voyelle_A = "A";
		String voyelle_E = "E";
		String voyelle_I = "I";
		String voyelle_O = "O";
		String voyelle_U = "U";
		String voyelle_Y = "Y";
		int position;

		/*DEBUT PROGRAMME*/

		position = 0;

		System.out.println("\nTableau avant affectation des six voyelles de l'alphabet latin.\n");
		for (int i = 0; i <= array.length-1; i++) {
			array[i] = "none";
			position = position + 1;
			System.out.println("Valeur " + position + " : " + array[i]);
		}

		array[0] = voyelle_A;
		array[1] = voyelle_E;
		array[2] = voyelle_I;
		array[3] = voyelle_O;
		array[4] = voyelle_U;
		array[5] = voyelle_Y;

		position = 0;

		System.out.println("\nTableau après affectation des six voyelles de l'alphabet latin.\n");
		for (int i = 0; i <= array.length-1; i++) {
			position = position + 1;
			System.out.println("Valeur " + position + " : " + array[i]);
		}


		/*FIN PROGRAMME*/
	}

}
