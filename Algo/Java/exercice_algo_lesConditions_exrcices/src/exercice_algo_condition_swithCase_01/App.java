package exercice_algo_condition_swithCase_01;
import java.util.Scanner;

public class App {
	/*
	 EXERCICE 1

	Le but de cet exercice est de créer une calculatrice, dans un premier temps on demandera à l’utilisateur de 
	saisir deux nombres, puis on lui demandera l’opérateur qui souhaite utiliser parmi +,-,* ou / et selon son 
	choix on affichera le calcul correspondant.
	
	PROCEDURE Calculator(REEL numberA, REEL numberB, CHAINE operator)
	
		result		REEL
	
		SELON operator
		
		CAS "+" FAIRE
			result <-- numberA + numberB
			ECRIRE "Résultat : ", numberA, " + ", numberB, " = ", result
		CAS  "-" FAIRE
			result <-- numberA - numberB
			ECRIRE "Résultat : ", numberA, " - ", numberB, " = ", result
		CAS  "*" FAIRE
			result <-- numberA * numberB
			ECRIRE "Résultat : ", numberA, " * ", numberB, " = ", result
		CAS  "/" FAIRE
			SI numberB = 0 ALORS
				System.out.println("Désolé impossible de diviser par 0...");
				break;
			SINON
				result <-- numberA / numberB;
				ECRIRE "Résultat : ", numberA, " / ", numberB, " = ", result
		FIN SELON
	
	FIN PROCEDURE
	 */
	
	public static void Calculator(double numberA, double numberB, String operator) {

	double result;

	switch (operator) {
	
		case "+":
			result = numberA + numberB;
			System.out.println ("\nRésultat :\n" + numberA + " + " + numberB + " = " + result);
			break;
		case"-":
			result = numberA - numberB;
			System.out.println ("\nRésultat :\n" + numberA + " - " + numberB + " = " + result);
			break;
		case"*":
			result = numberA * numberB;
			System.out.println ("\nRésultat :\n" + numberA + " * " + numberB + " = " + result);
			break;
		case"/":
			if(numberB == 0) {
				System.out.println("Désolé impossible de diviser par 0...");
				break;
			}else {
				result = numberA / numberB;
				System.out.println ("\nRésultat :\n" + numberA + " / " + numberB + " = " + result);
				break;
			}
		default:
			System.out.println("Vous devez utiliser l'un des opérateurs suivants :\n\t(+) ou (-) ou (*) ou (/)");
		}
	}

	public static void main(String[] args) {
		
		/* VARIABLES */
		
		double userNumberA=0;
		double userNumberB=0;
		String operator="";
		
		/* DEBUT PROGRAMME */
		
		Scanner userInput = new Scanner(System.in);
		
		// Titre
		System.out.println("**Calculatrice**\n");
		
		// on demande de saisir un premier nombre
		System.out.println("Saisir un premier nombre : ");
		userNumberA = userInput.nextDouble();
		
		// on demande de saisir un opérateur addition, soustraction, multiplication ou division
		System.out.println("Saisir un des opérateurs suivants :\n\t(+) ou (-) ou (*) ou (/)");
		operator = userInput.next();
		
		// on demande de saisir un deuxième nombre
		System.out.println("Saisir un deuxième nombre : ");
		userNumberB = userInput.nextDouble();
		
		// on passe les variables en paramètres à la procédure
		Calculator(userNumberA, userNumberB, operator);
		
		userInput.close();
		
		/* FIN PROGRAMME */
	}

}
