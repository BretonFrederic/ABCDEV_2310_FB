package exercice_algo_les_boucles_exercice_06;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		EXERCICE 6

		Ecrire un algorithme qui demande successivement 20 nombres à l’utilisateur, et qui lui dise ensuite quel 
		était le plus grand parmi ces 20 nombres : Entrez le nombre numéro 1 : 12 Entrez le nombre numéro 2 : 14 
		etc. Entrez le nombre numéro 20 : 6 Le plus grand de ces nombres est : 14 Modifiez ensuite l’algorithme 
		pour que le programme affiche de surcroît en quelle position avait été saisie ce nombre : C’était le nombre 
		numéro 2


		--VARIABLES--

		userNumber		ENTIER
		greaterNumber		ENTIER

		--DEBUT PROGRAMME--

		POUR i <-- 1 À 20 FAIRE
			ECRIRE "Saisir un nombre : ", i
			LIRE userNumber
			
			SI userNumber > greaterNumber ALORS
				greaterNumber <-- userNumber
			FIN SI
		FIN POUR

		ECRIRE "le plus grand parmi ces 20 nombres est : ", greaterNumber

		--FIN PROGRAMME--
		*/
		

		/*VARIABLES*/

		int userNumber;
		int greaterNumber=0;
		int index=0;

		/*DEBUT PROGRAMME*/
		
		Scanner userInput = new Scanner(System.in);

		for(int i = 1;i < 20; i++) {
			System.out.printf("Saisir le nombre numéro : %d \n", i);
			userNumber = userInput.nextInt();
			if(userNumber > greaterNumber) {
				index = i;
				greaterNumber = userNumber;
			}
		}
		System.out.printf("Le plus grand parmi ces 20 nombres est : %d", greaterNumber);
		System.out.printf("\n\nC’était le nombre numéro : %d", index);
		userInput.close();
		/*FIN PROGRAMME*/
	}
}
