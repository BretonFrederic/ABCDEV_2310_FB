package algo_les_procedure_et_les_fonctions_partie_1exercice_05;
import java.util.Scanner;

public class App {
	/*
	EXERCICE 5

	Ecrivez une procédure qui affiche un message différent en fonction de l’âge passés en argument.
	Exemple : « Vous êtes majeur » ou « Vous êtes mineur », la majorité étant fixé à 18 ans.

	PROCEDURE displayAge(VAL ENTIER age)

		SI age < 0 ALORS
			ECRIRE "Vous n'êtes pas née"
		SI age >= 18 ALORS
			ECRIRE "Vous êtes majeur"
		SINON SI age < 18 ALORS
			ECRIRE "Vous êtes mineur"
		FIN SI
		
	FIN PROCEDURE
	*/

	public static void displayAge(int age) {

		if(age < 0) {
			System.out.println("Vous n'êtes pas née");
		}else if(age >= 18) {
			System.out.println("Vous êtes majeur");
		}else if(age < 18) {
			System.out.println("Vous êtes mineur");
		}
		
	}
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int userAge;
		
		System.out.println("Saisir un âge : ");
		userAge = userInput.nextInt();
		
		displayAge(userAge);
		
		userInput.close();
	}

}
