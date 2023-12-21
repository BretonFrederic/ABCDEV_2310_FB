package fonctions_et_les_procedures_partie_2_Exercice_2;

public class App {
	/*
	EXERCICE 2

	Ecrivez une fonction qui retourne le plus grand nombre entier présent dans un tableau 
	Exemple :
	int[] tab = {1, 2, 9, 4};
	Sortie prévue :
	9

	ENTIER FONCTION biggestNumber(VAL TAB ENTIER arrayNumbers)
		number		ENTIER
		
		POUR i <-- 0 À i <= LONGUEUR(arrayNumbers)-2 FAIRE
			SI arrayNumbers[i] > arrayNumbers[i+1] ALORS
				number <-- arrayNumbers[i]
				arrayNumbers[i] <-- arrayNumbers[i+1]
				arrayNumbers[i+1] <-- number
			FIN SI
		FIN POUR
		number <-- arrayNumbers[LONGUEUR(arrayNumbers)-1]
		RETOURNE number
	FIN FONCTION
	*/
	
	public static int biggestNumber(int[] arrayNumbers) {
		int number;
		
		for(int i = 0; i <= arrayNumbers.length-2; i++){
			if(arrayNumbers[i] > arrayNumbers[i+1]) {
				number = arrayNumbers[i];
				arrayNumbers[i] = arrayNumbers[i+1];
				arrayNumbers[i+1] = number;
			}
		}
		number = arrayNumbers[arrayNumbers.length-1];
		return number;
	}
	
	public static void main(String[] args) {
		
		/* VARIABLES */
		
		int[] tab = {1, 2, 9, 4};
		int bigNumber=0;
		
		/* DEBUT PROGRAMME */
		
		System.out.println("Dans le tableau suivant :");
		for(int i = 0; i <= tab.length-1; i++) {
			System.out.print(tab[i] + " ");
		}
		bigNumber = biggestNumber(tab);
		System.out.println("\nLe plus grand nombre est : \n" + bigNumber);
		
		/* FIN PROGRAMME */
	}

}
