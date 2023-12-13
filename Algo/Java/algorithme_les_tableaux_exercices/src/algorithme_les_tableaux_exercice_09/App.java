package algorithme_les_tableaux_exercice_09;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		EXERCICE 9

		Toujours et encore sur le même principe, écrivez un algorithme permettant, à l’utilisateur de saisir les 
		notes d'une classe. Le programme, une fois la saisie terminée, renvoie le nombre de ces notes supérieures 
		à la moyenne de la classe.

		--VARIABLES--

		grades[]		REEL
		arraySize		ENTIER
		number			REEL
		i				ENTIER
		sum				REEL
		average			REEL
		greaterNb		ENTIER


		--DEBUT PROGRAMME--

		ECRIRE "Combien de notes souhaitez-vous saisir ? : "
		LIRE arraySize

		grades[arraySize]
		POUR i À LONGUEUR(grades)-1 FAIRE
			DEBUT TANT QUE
			FAIRE
				ECRIRE "Saisir une note entre 0 et 20 : "
				LIRE number
			TANT QUE number > 20
			FIN TANT QUE
			grades[i] <-- number
		FIN POUR

		POUR i À LONGUEUR(grades)-1 FAIRE
			sum <-- sum + grades[i]
		FIN POUR

		average <-- sum/arraySize

		POUR i À LONGUEUR(grades)-1 FAIRE
			SI grades[i] > average ALORS
				greaterNb <-- greaterNb + 1
			FIN SI

		ECRIRE "Le nombre de notes supérieures à la moyenne est : ", greaterNb

		--FIN PROGRAMME--
		*/
		
		/*VARIABLES*/

		double grades[];
		double number, sum = 0, average;
		int arraySize, greaterNb = 0;


		/*DEBUT PROGRAMME*/
		
		Scanner userInput = new Scanner(System.in);

		System.out.println("Combien de notes souhaitez-vous saisir ? : ");
		arraySize = userInput.nextInt();

		grades = new double[arraySize];
		for(int i = 0; i <= grades.length-1; i++) {
			do {
				System.out.println("Saisir une note entre 0 et 20 : ");
				number = userInput.nextDouble();
				if(number < 0 || number > 20) {
					System.out.println("La note est impossible. Recommencer.");
				}
			}while(number < 0 || number > 20);
			grades[i] = number;
		}

		for(int i = 0; i <= grades.length-1; i++) {
			sum = sum + grades[i];
		}

		average = sum/(double)arraySize;

		for(int i = 0; i <= grades.length-1; i++) {
			if (grades[i]*10 > average*10) {
				greaterNb = greaterNb + 1;
			}
		}

		System.out.println("Le nombre de notes supérieures à la moyenne est : " + greaterNb);

		userInput.close();
		
		/*FIN PROGRAMME*/
	}

}
