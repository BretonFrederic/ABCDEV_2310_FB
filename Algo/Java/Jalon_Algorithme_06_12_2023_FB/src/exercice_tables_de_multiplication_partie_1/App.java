package exercice_tables_de_multiplication_partie_1;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		Partie 1:

			Algorithme qui demande un nombre entier de 1 à 10, 
			puis affiche la table de multiplication correspondante de 0 à 10.

			--VARIABLES--

			userNumber		ENTIER
			result			ENTIER
			answer			CHAINE
			quit			BOOLEEN

			--DEBUT PROGRAMME--

			quit <-- faux

			FAIRE 
				ECRIRE "Saisir un nombre entier entre 1 et 10 : "
				LIRE userNumber

				POUR i <-- 0 À 10 FAIRE
					result <-- i * userNumber
					ECRIRE i, " * ", userNumber, " = ", result
				FIN POUR

				ECRIRE "Souhaitez vous afficher une autre table ? Oui(O) ou Non(N)"
				LIRE answer
				
				SI answer = "O" ALORS
					quit <-- vrai
				SINON SI answer = "N" ALORS
					quit <-- faux
				FIN SI

			TANT QUE !quit
			FIN TANT QUE

			--FIN PROGRAMME--
		*/

		/*VARIABLES*/

		int userNumber;
		int result;
		int i;
		String answer;
		boolean quit;

		/*DEBUT PROGRAMME*/

		quit = false;
		Scanner userInput = new Scanner(System.in);

		do {
			System.out.println("Saisir un nombre entier entre 1 et 10 : ");
			userNumber = userInput.nextInt();

			for(i = 0; i <= 10; i++){
				result = i*userNumber;
				System.out.println(i + " * " + userNumber + " = " + result);
			}

			System.out.println("Souhaitez vous afficher une autre table ? Oui(O) ou Non(N)");
			answer = userInput.next();
			
			if(answer.equals("O")){
				quit = false;
			}else if(answer.equals("N")) {
				quit = true;
			}

		}while(!quit);
		
		userInput.close();

		/*FIN PROGRAMME*/
	}
}
