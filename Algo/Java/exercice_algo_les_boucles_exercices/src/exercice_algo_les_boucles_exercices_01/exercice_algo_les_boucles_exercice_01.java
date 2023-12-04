package exercice_algo_les_boucles_exercices_01;
import java.util.Scanner;

public class exercice_algo_les_boucles_exercice_01 {

	public static void main(String[] args) {
		
/* 
--EXERCICE 1--

Ecrire un algorithme qui demande à l’utilisateur un nombre compris entre 1 et 3 jusqu’à ce que la réponse 
convienne.

--VARIABLES--

userNumber		ENTIER
int randomNumber	ENTIER
i			ENTIER
count			ENTIER
answer			BOOLEEN

--DEBUT PROGRAMME--

count <-- 0
answer <-- false

FAIRE
	ECRIRE"Saisir un nombre entre 1 et 3 : "
	ECRIRE userNumber

	randomNumber <--  RANDOM(1,3)

		
	POUR i <-- 1 À 3 FAIRE
		SI userNumber = randomNumber FAIRE
			count += 1;
		FIN SI
	FIN POUR
	SI count > 0 FAIRE
		ECRIRE "Félicitation vous avez trouvé le nombre mystère !"
		answer <-- true
	FIN SI
TANT QUE !answer FAIRE
FIN TANT QUE

--FIN PROGRAMME--
*/
		

		/* VARIABLES */

		int userNumber;
		int randomNumber;
		int i;
		int count;
		boolean answer;

		/* DEBUT PROGRAMME */

		count = 0;
		answer = false;
		Scanner userInput = new Scanner(System.in);

		do {
			System.out.println("Saisir un nombre entre 1 et 3 : ");
			userNumber = userInput.nextInt();

			randomNumber =  (int)Math.round(Math.random()*3);

		
			for(i = 1; i < 3; i++) {
				if(userNumber == randomNumber) {
					count += 1;
				}
			}
			if(count > 0) {
				System.out.println("Félicitation vous avez trouvé le nombre mystère !");
				answer = true;
			}
			
		}while(!answer);
		userInput.close();
	}

}
