package fonctions_et_les_procedures_partie_2_Exercice_3;

import java.util.Scanner;

public class App {
	/*
	EXERCICE 3

	Ecrire une fonction qui permet de savoir si un entier est divisible par un autre 
	BOOLEEN FONCTION estDivisible ( entier a, entier b) 
	SI (a mod b = 0)
	retourner vrai;
	SINON
	retourner faux;
	FIN

	BOOLEEN FONCTION isDivisible(VAL ENTIER numberA, VAL ENTIER numberB)

		divisible <-- faux
		
		SI(numberA mod numberB == 0)
			divisible <-- vrai
		SINON
			divisible <-- faux
		FIN SI
		
		RETOURNE divisible
	FIN FONCTION
	*/
	
	public static boolean isDivisible(int numberA, int numberB) {

		boolean divisible = false;
		
		if(numberA%numberB == 0) {
			divisible = true;
		}else{
			divisible = false;
		}
		
		return divisible;
	}
	
	public static void main(String[] args) {
		
		/* VARIABLES */
		
		int userNb1;
		int userNb2;
		
		/* DEBUT PROGRAMME */
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Saisir un premier nombre : ");
		userNb1 = userInput.nextInt();
		
		System.out.println("Saisir un deuxième nombre : ");
		userNb2 = userInput.nextInt();
		
		if(isDivisible(userNb1, userNb2)) {
			System.out.printf("Le nombre %d est divisible par le nombre %d", userNb1, userNb2);
		}else if(!isDivisible(userNb1, userNb2)) {
			System.out.printf("Le nombre %d n'est pas divisible par le nombre %d", userNb1, userNb2);
		}
		
		userInput.close();
		
		/* FIN PROGRAMME */
		
	}

}
