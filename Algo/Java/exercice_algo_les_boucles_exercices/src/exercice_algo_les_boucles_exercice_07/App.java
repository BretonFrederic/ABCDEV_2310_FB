package exercice_algo_les_boucles_exercice_07;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		EXERCICE 7

Réécrire l’algorithme précédent, mais cette fois-ci on ne connaît pas d’avance combien l’utilisateur 
souhaite saisir de nombres. La saisie des nombres s’arrête lorsque l’utilisateur entre un zéro

--VARIABLES--

userNumber		ENTIER
greaterNumber	ENTIER
index			ENTIER
i				ENTIER

--DEBUT PROGRAMME--

i <-- 1
DEBUT TANT QUE
	i <-- i + 1
	ECRIRE "Saisir un nombre : "
	LIRE userNumber
	
	SI userNumber > greaterNumber ALORS
		greaterNumber <-- userNumber
		index <-- i-1
	FIN SI
TANT QUE userNumber != 0
FIN TANT QUE

i <-- i - 1

ECRIRE "le plus grand parmi ces ", i, " nombres est : ", greaterNumber
ECRIRE "C’était le nombre numéro : ", index

--FIN PROGRAMME--
		*/
		

		/*VARIABLES*/

		int userNumber=1;
		int greaterNumber=0;
		int index=0;
		int i = 1;

		/*DEBUT PROGRAMME*/
		
		Scanner userInput = new Scanner(System.in);

		do {
			i = i + 1;
			System.out.printf("Saisir un nombre : ");
			userNumber = userInput.nextInt();
			if(userNumber > greaterNumber) {
				greaterNumber = userNumber;
				index = i-1;
			}
		}while(userNumber != 0);
		
		i -= 1;
			
		System.out.printf("Le plus grand parmi ces %d nombres est : %d", i, greaterNumber);
		System.out.printf("\n\nC’était le nombre numéro : %d", index);
		userInput.close();
		/*FIN PROGRAMME*/
	}
}
