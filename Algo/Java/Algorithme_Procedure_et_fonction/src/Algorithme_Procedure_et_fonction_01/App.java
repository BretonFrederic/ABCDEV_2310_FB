package Algorithme_Procedure_et_fonction_01;

public class App {

	/*
	Enoncé 1:

	Ecrire et utiliser une procédure inversant le contenu de 2 variables a et b passées en arguments

	PROCEDURE Invert(int number1, int number2)

	temp	ENTIER

	temp <-- number1
	number1 <-- number2
	number2 <-- temp
	ECRIRE "valeur 1 : ", number1, "Valeur 2 : ", number2

	FIN PROCEDURE

	--VARIABLES--

	variableA		ENTIER
	variableB		ENTIER

	--DEBUT PROGRAMME--

	variableA <-- 7
	variableB <-- 2

	ECRIRE "valeur 1 : ", variableA, "Valeur 2 : ", variableB
	invert(variableA, variableB)

	--FIN PROGRAMME--
	*/

	public static void main(String[] args) {
		
		/*VARIABLES*/

		int variableA;
		int variableB;

		/*DEBUT PROGRAMME*/

		variableA = 7;
		variableB = 2;

		System.out.println("Avant l'appel de la procédure d'inversion de 2 valeurs.");
		System.out.println("\nValeur 1 = " + variableA + "\nValeur 2 = " + variableB);
		System.out.println("\nAprès l'appel de la procédure d'inversion de 2 valeurs.");
		Invert(variableA, variableB);

		/*FIN PROGRAMME*/
	}

	public static void Invert(int nb1, int nb2) {

		int temp;

		temp = nb1;
		nb1 = nb2;
		nb2 = temp;
		System.out.println("\nValeur 1 = " + nb1 + "\nValeur 2 = " + nb2);

	}
}
